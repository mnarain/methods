package sr.unasat.methods.app;

import sr.unasat.methods.services.ATMService;
import sr.unasat.methods.services.ExampleService;
import sr.unasat.methods.services.ProgrammerService;
import sr.unasat.methods.services.TafelService;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        TafelService ts = new TafelService();
       /* ts.tafelVanTien();
        ts.tafelVan(20);*/
        ts.tafelVan(4,7,17);
        ts.tafelVanDoWhile(4,7,17);
        ts.tafelVanWhile(4,7,17);
        ts.tafelVanForEach(4,7,17);
/*

        ProgrammerService ps = new ProgrammerService();
        String[] programmers = {"Paul", "Shreya", "Selvan", "Tom"};
        ps.findProgrammer(programmers, "Henk");
        ps.findProgrammerIncludingNotFoundMessage(programmers, "Tom");
        ps.findProgrammerIncludingNotFoundMessage(programmers, "Henk");

        String[] programmers2ndList = {"Gregory", "Geert", "Hans", "Ann"};
        ps.findProgrammer(programmers2ndList, "Paul");

        ps.listProgrammersExceptFor(programmers, "Paul");
        ps.listProgrammersExceptFor(programmers2ndList, "Paul");

*/


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

      /*  ATMService atmService = new ATMService();*/

        //else if aanroeping
 /*       int opnameBedragIf = 400;
        atmService.fastCash(opnameBedragIf);*/

        //switch aanroeping
  /*      Integer opnameBedragSwitch = 400;
        atmService.fastCash(opnameBedragSwitch);*/
    }



}

