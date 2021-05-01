package sr.unasat.methods.app;

import sr.unasat.methods.services.ExampleService;

public class Application {

    public static void main(String[] args) {
        ExampleService exampleService = new ExampleService();
        exampleService.example();
        exampleService.example("This is my custom message");
    }
}
