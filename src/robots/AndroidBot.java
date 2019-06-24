package robots;

import robotInstances.Android;

public class AndroidBot extends DomesticBot implements Android {


    private boolean hasInternet;

    public AndroidBot(boolean isKind, boolean turnedOff,String purpose, boolean hasInternet) {
        super(isKind, turnedOff, purpose);
        this.hasInternet = hasInternet;
    }

    @Override
    public void searchNews() {
        if(hasInternet) {
            if (getPurpose() == "good news") {
                System.out.println("Check your e-mail box for good news!");
            } else if (getPurpose() == "bad news") {
                System.out.println("Check your e-mail box for bad news!");
            } else if (getPurpose() == "both") {
                System.out.println("Check your e-mail box for the news!");
            }
        }
    }


    public boolean isHasInternet() {
        return hasInternet;
    }
}
