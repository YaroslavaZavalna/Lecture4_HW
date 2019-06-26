import robots.AndroidBot;
import robots.DomesticBot;
import robots.Robot;

import java.util.Scanner;

public class StartMain {


    public StartMain(){
        System.out.println("Press 's' to begin");
        Scanner sc = new Scanner(System.in);
        String start = sc.nextLine();

        while (!start.equals("s")) {
            System.out.println("You`ve pressed wrong key! Try again!");
            String start1 = sc.nextLine();
            if(start1.equals("s")){
//                start = start1;
                break;
            }
        }

        while (true) {
                start();
                System.out.println("Would you like to exit?(y/n)");
                String exit = sc.nextLine();
                while(!exit.equals("y") || !exit.equals("n")){
                    System.out.println("You`ve pressed wrong key! Try again!");
                    String exit2 = sc.nextLine();
                    if (exit2.equals("y")) {
                        break;
                    } else if (exit2.equals("n")) {
                        break;
                    }
                }

        }
    }


    private static void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi! What kind of robot would you like to have?\n a) Standart robot\n b) Domestic robot\n c) Android\n");
        String answer = sc.nextLine();

        if (answer.equals("a")) {
            Robot robot = new Robot(true, false);
            System.out.println();
            System.out.println("Let`s test me!");
            robot.formGen();
            robot.move();
            robot.talk();
            robot.shoot();
        } else if (answer.equals("b")) {
            while(true) {
                System.out.println("Which kind of domestic robot you would like?\na) Vacuum cleaner \nb) Dishwasher\n");
                String answer2 = sc.nextLine();
                if (answer2.equals("a")) {
                    DomesticBot domBot = new DomesticBot(true, false, "vacuum cleaner");
                    System.out.println("Let`s test me!");
                    domBot.formGen();
                    domBot.move();
                    domBot.talk();
                    domBot.clean();
                    domBot.shoot();
                    break;
                } else if (answer2.equals("b")) {
                    DomesticBot domBot2 = new DomesticBot(true, false, "dishwasher");
                    System.out.println("Let`s test me!");
                    domBot2.formGen();
                    domBot2.move();
                    domBot2.talk();
                    domBot2.clean();
                    domBot2.shoot();
                    break;
                }else{
                    System.out.println("You`ve pressed wrong key! Try again!");
                    continue;
                }
            }
        } else if (answer.equals("c")) {
            while(true) {
                System.out.println("This kind of robot can search for some news. Would you like to have \na) good news \nb) bad news\nc)both");
                String answer3 = sc.nextLine();
                if (answer3.equals("a")) {
                    AndroidBot android = new AndroidBot(true, false, true);
                    System.out.println("Let`s test me!");
                    android.formGen();
                    android.move();
                    android.talk();
                    android.searchNews("good news");
                    android.shoot();
                    break;
                } else if (answer3.equals("b")) {
                    AndroidBot android2 = new AndroidBot(true, false, true);
                    System.out.println("Let`s test me!");
                    android2.formGen();
                    android2.move();
                    android2.talk();
                    android2.searchNews("bad news");
                    android2.shoot();
                    break;
                } else if (answer3.equals("c")) {
                    AndroidBot android3 = new AndroidBot(true, false, true);
                    System.out.println("Let`s test me!");
                    android3.formGen();
                    android3.move();
                    android3.talk();
                    android3.searchNews("both");
                    android3.shoot();
                    break;
                }else {
                    System.out.println("You`ve pressed wrong key! Try again!");
                    continue;
                }
            }
        }else{
            System.out.println("You`ve pressed wrong key! Try again!");
            start();
        }
    }
}




