package robots;

import interfaces.RobotFeature;

public class Robot implements RobotFeature {
    private boolean isKind;
    private boolean turnedOff;
    private Form form;


    public Robot(boolean isKind, boolean turnedOff) {
        this.isKind = isKind;
        this.turnedOff = turnedOff;
    }

    @Override
    public void shoot() {
        int i = (int)(Math.random()*10);

        if(i != 0){
            System.out.println("Let the party begin! I am shooting presents!");
            System.out.println("   |><|    \n"+
                               "   ПППП     \n"+
                               "   ПППП     \n");

        }else if(i==0){
            System.out.println("I gonna kill you, silly humans!\nJUST RUUUUUUUUUUUUUUUUUN!!!!!!\n");
        }

    }

    @Override
    public void talk() {
        if(isTurnedOff()==false) {
            System.out.println("      >-<        ");
            System.out.println("   =========    ");
            System.out.println("   | +   + |    ");
            System.out.println("   |   ^   |    ");
            System.out.println("   |   @   |    ");
            System.out.println("   =========    ");
            System.out.println("Robot is talking . . .    \n");
        }else{
            System.out.println("Turn me on!");
        }
    }

    @Override
    public void move() {
        if(isTurnedOff()==false) {
            System.out.println("    ____    \n" +
                    "    |  *|   \n" +
                    "    -----   \n" +
                    "    | /  |  \n" +
                    "    -----   \n" +
                    "      ^     \n" +
                    "    ^   ^    ");
            System.out.println("Robot is moving . . . \n");
        }
    }

    @Override
    public void formGen() {
        int i = (int)(Math.random()*12+1);
        if(i>=1 && i<=3){
            form = new Form(1.5, 45, "red", "tin", "Form #1");
            System.out.println("Now robot has "+ form.getFormName()+ " : "+ form.getColor()
                        +", made of "+ form.getMaterial()+ ", "+ form.getHeight() + " m high and "
                        + form.getWeight()+ " kg weight\n");
        }else if(i>=4 && i<=8){
            form = new Form(1.75, 56, "green", "steel", "Form #2");
              System.out.println("Now robot has "+ form.getFormName()+ " : "+ form.getColor()
                        +", made of "+ form.getMaterial()+ ", "+ form.getHeight() + " m high and "
                        + form.getWeight()+ " kg weight\n");
        }else if(i>=9 && i<=12){
            form = new Form(2.0, 67, "blue", "plastic", "Form #3");
            System.out.println("Now robot has "+ form.getFormName()+ " : "+ form.getColor()
                        +", made of "+ form.getMaterial()+ ", "+ form.getHeight() + " m high and "
                        + form.getWeight()+ " kg weight\n");
        }

    }

    public boolean isKind() {
        return isKind;
    }

    public void setKind(boolean kind) {
        isKind = kind;
    }

    public boolean isTurnedOff() {
        return turnedOff;
    }

    public void setTurnedOff(boolean turnedOff) {
        this.turnedOff = turnedOff;
    }

}
