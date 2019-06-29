package robots;

import planetInstances.PlanetA;
import planetInstances.PlanetB;
import planetInstances.PlanetC;
import robotInstances.RobotAppearance;
import robotInstances.RobotFeature;

public class Robot implements RobotFeature, RobotAppearance, PlanetA, PlanetB, PlanetC {
    private static final int MAX = 12;
    private static final int RANGE = 1;
    private static final int SHOOT_MAGIC = 10;
    private static final int HIGH_BOUND = 8;
    private static final int MID_BOUND = 3;

    private boolean isKind;
    private boolean turnedOff;

    private Form form;

    public Robot(boolean isKind, boolean turnedOff) {
        this.isKind = isKind;
        this.turnedOff = turnedOff;

        char planet = Aliens.planetRandom();
        if(planet=='A'){
            seaClimate();
        }else if(planet=='B'){
            windClimate();
        }else if(planet=='C'){
            sunClimate();
        }
    }

    @Override
    public void shoot() {
        int i = (int)(Math.random()*SHOOT_MAGIC);

        if(i != 0){
            System.out.println("Let the party begin! I am shooting presents!");
            System.out.println("   |><|    \n"+
                               "   ПППП     \n"+
                               "   ПППП     \n");
        }else{
            System.out.println("I gonna kill you, silly humans!\nJUST RUUUUUUUUUUUUUUUUUN!!!!!!\n");
        }
    }

    @Override
    public void speak() {
        if(!isTurnedOff()) {
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
        if(!isTurnedOff()) {
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
    public void formGenerator() {
        int i = (int)(Math.random()*MAX+ RANGE);
        if(i>HIGH_BOUND){
            form = new Form(1.5, 45, "red", "tin", "Form #1");
            System.out.println("Now robot has "+ form.getForm()+ " : "+ form.getColor()
                        +", made of "+ form.getMaterial()+ ", "+ form.getHeight() + " m high and "
                        + form.getWeight()+ " kg weight\n");
        }else if(i>MID_BOUND){
            form = new Form(1.75, 56, "green", "steel", "Form #2");
              System.out.println("Now robot has "+ form.getForm()+ " : "+ form.getColor()
                        +", made of "+ form.getMaterial()+ ", "+ form.getHeight() + " m high and "
                        + form.getWeight()+ " kg weight\n");
        }else {
            form = new Form(2.0, 67, "blue", "plastic", "Form #3");
            System.out.println("Now robot has "+ form.getForm()+ " : "+ form.getColor()
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

    @Override
    public void seaClimate() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Activating waterproof power~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n~~~~~~~~~~~~~~~~~~~ Aliens have come to the WaterPlanet ~~~~~~~~~~~~~~~~~~~\n");
    }

    @Override
    public void windClimate() {
        System.out.println("================================================ Activating windproof power ================================================\n==================== Aliens have come to the WindPlanet==================== \n");
    }

    @Override
    public void sunClimate() {
        System.out.println("***********************************************  Activating sunproof power   ***********************************************\n********************* Aliens have come to the SunPlanet *********************\n ");

    }
}
