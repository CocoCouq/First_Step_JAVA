package com.FirstJavaProject.Objects;

public class CallClient {
    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Client                        (V1.1 - 04/20) ||");

        // Scenario
        Client client1 = new Client("Weller", "Paul", "Baker Street", "London");
        Client client2 = new Client("White", "Jack", "Detroit");
        Client client3 = new Client("Les", "Claypool", "SF");
        Client client4 = new Client("Johnny", "Thunders", "New York");

        System.out.printf("%s     || %s || %s || %s%n", client1.getFName(), client1.getName(), client1.getCity(), client1.getAddress());
        System.out.printf("%s     || %s  || %s%n", client2.getFName(), client2.getName(), client2.getCity());
        System.out.printf("%s || %s    || %s%n", client3.getFName(), client3.getName(), client3.getCity());
        System.out.printf("%s || %s || %s%n", client4.getFName(), client4.getName(), client4.getCity());
    }
}