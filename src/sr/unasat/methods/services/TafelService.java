package sr.unasat.methods.services;

public class TafelService {

    //opdracht 1
    public void tafelVanTien() {
        System.out.println("********* Dit is tafel van 10 *********");
        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.println(multiplier + " * 10 = " + multiplier * 10);
        }
    }

    //opdracht 2
    public void tafelVan(int tafel){
        System.out.println("********* Dit is tafel van " + tafel + " *********");
        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.println(multiplier + " * " + tafel + " = " + multiplier * tafel);
        }
    }

    //opdracht 3
    public void tafelVan(int start, int eind, int tafel){
        System.out.println("********* Dit is tafel van " + tafel + " *********");
        for (int multiplier = start; multiplier <= eind; multiplier++) {
            System.out.println(multiplier + " * " + tafel + " = " + multiplier * tafel);
        }
    }
}
