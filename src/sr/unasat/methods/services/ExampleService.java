package sr.unasat.methods.services;

public class ExampleService {

    public void example(){
        System.out.println("This is an example!");
    }

    //3.4 overloaded methods, zelfde naam maar verschil in parameters
    public void example(String customMessage){
        System.out.println(customMessage);
    }

}
