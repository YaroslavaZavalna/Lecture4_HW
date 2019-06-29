package robots;

import robotInstances.Android;

public class AndroidBot extends Robot implements Android {


    private boolean hasInternet;

    public AndroidBot(boolean isKind, boolean turnedOff, boolean hasInternet) {
        super(isKind, turnedOff);
        this.hasInternet = hasInternet;
    }

    @Override
    public void searchNews(String answer) {
        if(hasInternet) {
            if (answer.equals("good news")) {
                System.out.println("Check your e-mail box for good news!");
            } else if (answer.equals("bad news") ){
                System.out.println("Check your e-mail box for bad news!");
            } else if (answer.equals("both") ){
                System.out.println("Check your e-mail box for the news!");
            }
        }
    }

    public boolean isHasInternet() {
        return hasInternet;
    }

}
