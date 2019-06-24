import robots.AndroidBot;
import robots.DomesticBot;
import robots.Robot;

import java.util.Scanner;

public class StartMain {


    public StartMain(){
        System.out.println("Press 's' to begin");
        Scanner sc = new Scanner(System.in);
        String start = sc.nextLine();
        while(start.equals("s")){
            start();
            System.out.println("Would you like to exit?(y/n)");
            String exit = sc.nextLine();
            if(exit.equals("y")){
                break;
            }else if(exit.equals("n")){
                continue;
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

            } else if (answer2.equals("b")) {
                DomesticBot domBot2 = new DomesticBot(true, false, "dishwasher");
                System.out.println("Let`s test me!");
                domBot2.formGen();
                domBot2.move();
                domBot2.talk();
                domBot2.clean();
                domBot2.shoot();

            }
        } else if (answer.equals("c")) {
            System.out.println("This kind of robot can search for some news. Would you like to have \na) good news \nb) bad news\nc)both");
            String answer3 = sc.nextLine();
            if (answer3.equals("a")) {
                AndroidBot android = new AndroidBot(true, false,  true);
                System.out.println("Let`s test me!");
                android.formGen();
                android.move();
                android.talk();
                android.searchNews("good news");
                android.shoot();
            } else if (answer3.equals("b")) {
                AndroidBot android2 = new AndroidBot(true, false,  true);
                System.out.println("Let`s test me!");
                android2.formGen();
                android2.move();
                android2.talk();
                android2.searchNews("bad news");
                android2.shoot();
            } else if (answer3.equals("c")) {
                AndroidBot android3 = new AndroidBot(true, false,  true);
                System.out.println("Let`s test me!");
                android3.formGen();
                android3.move();
                android3.talk();
                android3.searchNews("both");
                android3.shoot();

            }
        }
    }
}




