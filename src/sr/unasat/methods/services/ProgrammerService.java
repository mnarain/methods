package sr.unasat.methods.services;

public class ProgrammerService {

    public void findProgrammer(String[] programmers, String programmer) {
        for (String name : programmers) {
            if (name.equals(programmer)) {
                System.out.println("Found programmer named " + programmer);
                break;
            }
        }
    }

    //Geef nette melding als niets is gevonden
    public void findProgrammerIncludingNotFoundMessage(String[] programmers, String programmer) {
        for (String name : programmers) {
            if (name.equals(programmer)) {
                System.out.println("Found programmer named " + programmer);
                return;
            }
        }
        System.out.println("No match found for: " + programmer);
    }

    public void listProgrammersExceptFor(String[] programmers, String programmer) {
        for (String name : programmers) {
            if (name.equals(programmer)) {
                continue;
            }
            System.out.println("programmer name: " + name);
        }
    }
}
