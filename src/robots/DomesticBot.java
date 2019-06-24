package robots;

import robotInstances.Domestic;


public class DomesticBot extends Robot implements Domestic {

    private String purpose;

    public DomesticBot(boolean isKind, boolean turnedOff, String purpose ) {
        super(isKind, turnedOff);
        this.purpose = purpose;
    }

    @Override
    public void clean() {
        if(getPurpose().equals("vacuum cleaner")){
            System.out.println("Robot can delete all dust in your house!\n" +
                    "~~~~~~~~~~~~~~~~~\n" +
                    "~~~~~~~~~~~~~~~~~\n" +
                    "~~~~~~~~~~~~~~~~~\n(This is like the wind from vacuum cleaner)\n");
        }else if(getPurpose().equals("dishwasher")){
            System.out.println(
                    "Robot can delete all dirt from your dishes!\n" +
                    "O   o     O   \n"+
                    "  O o  O     O\n" +
                    "o     O   o o\n (These are bubbles)\n");
        }

    }

    public String getPurpose() {
        return purpose;
    }
}
