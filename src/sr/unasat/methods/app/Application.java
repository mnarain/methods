package sr.unasat.methods.app;

import sr.unasat.methods.services.ATMService;
import sr.unasat.methods.services.ExampleService;
import sr.unasat.methods.services.TafelService;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
/*        TafelService ts = new TafelService();
        ts.tafelVanTien();*/
/*        ExampleService exampleService = new ExampleService();
        exampleService.example();
        exampleService.example("This is my custom message");

        Integer[] numb = {1, 2, 3};
        System.out.println(numb.length);
        List<Integer> numbers = new ArrayList<>();
        System.out.println(numbers.size());
        numbers.add(1);
        System.out.println(numbers.size());
        numbers.add(2);
        System.out.println(numbers.size());
        numbers.add(100);*/

        ATMService atmService = new ATMService();

        //else if aanroeping
        int opnameBedragIf = 400;
        atmService.fastCash(opnameBedragIf);

        //switch aanroeping
        Integer opnameBedragSwitch = 400;
        atmService.fastCash(opnameBedragSwitch);
    }

}

