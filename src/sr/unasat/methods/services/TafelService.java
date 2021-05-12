package sr.unasat.methods.services;

import java.util.ArrayList;
import java.util.List;

public class TafelService {

    //opdracht 1
    public void tafelVanTien() {
        System.out.println("********* Dit is tafel van 10 *********");
        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.println(multiplier + " * 10 = " + multiplier * 10);
        }
    }

    //opdracht 1
    public void tafelVanTienWhile() {
        System.out.println("********* Dit is tafel van 10 *********");

        int multiplier = 1;
        while (multiplier <= 10) {
            System.out.println(multiplier + " * 10 = " + multiplier * 10);
            multiplier++;
        }

    }


    //opdracht 2
    public void tafelVan(int tafel) {
        System.out.println("********* Dit is tafel van " + tafel + " *********");
        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.println(multiplier + " * " + tafel + " = " + multiplier * tafel);
        }
    }

    //opdracht 3
    public void tafelVan(int start, int eind, int tafel) {
        System.out.println("********* Dit is tafel van " + tafel + " *********");
        for (int multiplier = start; multiplier <= eind; multiplier++) {
            System.out.println(multiplier + " * " + tafel + " = " + multiplier * tafel);
        }
    }


    //opdracht 3
    public void tafelVanWhile(int start, int eind, int tafel) {
        System.out.println("********* Dit is tafel van " + tafel + " *********");

        int multiplier = start;
        while (multiplier <= eind) {
            System.out.println(multiplier + " * " + tafel + " = " + (multiplier * tafel));
            multiplier++;
        }
    }

    public void tafelVanDoWhile(int start, int eind, int tafel) {
        System.out.println("********* Dit is tafel van " + tafel + " *********");

        int multiplier = start;
        do {
            System.out.println(multiplier + " * " + tafel + " = " + (multiplier * tafel));
            multiplier++;
        } while (multiplier <= eind);
    }

    public void tafelVanForEach(int start, int eind, int tafel) {
        System.out.println("********* Dit is tafel van " + tafel + " *********");
        List<Integer> multiplyValues = new ArrayList<>();
        for (int multiplier = start; multiplier <= eind; multiplier++) {
            multiplyValues.add(multiplier);
        }

        for (Integer multiplier : multiplyValues) {
            System.out.println(multiplier + " * " + tafel + " = " + (multiplier * tafel));
        }
    }

}
