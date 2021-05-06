package sr.unasat.methods.services;

public class ATMService {

    public void fastCash(int opnameBedrag) {
        if (opnameBedrag == 50) {
            System.out.println("Neem uw SRD50,- a.u.b. uit het geldvak");
        } else if (opnameBedrag == 100) {
            System.out.println("Neem uw SRD100,- a.u.b. uit het geldvak");
        } else if (opnameBedrag == 200) {
            System.out.println("Neem uw SRD200,- a.u.b. uit het geldvak");
        } else if (opnameBedrag == 400) {
            System.out.println("Neem uw SRD400,- a.u.b. uit het geldvak");
        } else {
            System.out.println("Kies aub een bedrag van SRD 50,100,200,400");
        }
    }


        /*
        Zet de method fastCash if else om in een switch statement
         */


    public void fastCash(Integer opnameBedrag) {

        switch (opnameBedrag) {
            case 50:
                System.out.println("Neem uw SRD50,- a.u.b. uit het geldvak");
                break;
            case 100:
                System.out.println("Neem uw SRD100,- a.u.b. uit het geldvak");
                break;
            case 200:
                System.out.println("Neem uw SRD200,- a.u.b. uit het geldvak");
                break;
            case 400:
                System.out.println("Neem uw SRD400,- a.u.b. uit het geldvak");
                break;
            default:
                System.out.println("Kies aub een bedrag van SRD 50,100,200,400");
        }
    }

}
