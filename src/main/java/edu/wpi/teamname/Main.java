package edu.wpi.teamname;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    System.out.println("Hi this is Sam");

    SalesManager sam = new SalesManager("Sam", new ArrayList<Employee>(), null, 3);
    SalesManager charlie = new SalesManager("Charlie", new ArrayList<Employee>(), null, 4);
    SalesAssociate sven = new SalesAssociate("Sven", charlie, 7);
    SalesAssociate alex = new SalesAssociate("Alex", sam, 20);
    Client jo = new Client(32, "Jo", sam);
    Client riley = new Client(473, "Riley", sam);
    Client peyton = new Client(555, "Peyton", sven);
    Client avery = new Client(654, "Avery", charlie);
    Client taylor = new Client(840, "Taylor", alex);
    Client remi = new Client(912, "Remi", alex);

    SalesManager managerKaren = new SalesManager("Karen", new ArrayList<Employee>(), null, 123);
    SalesAssociate associateBill = new SalesAssociate("Bill", managerKaren, 233);
    Client amyClient = new Client(2, "Amy", managerKaren);
    Client danClient = new Client(21, "Dan", associateBill);
    Client fredClient = new Client(12, "Fred", associateBill);

    System.out.println(sam);
    System.out.println(charlie);
    System.out.println(sven);
    System.out.println(alex);
    System.out.println();
    System.out.println(jo);
    System.out.println(riley);
    System.out.println(peyton);
    System.out.println(avery);
    System.out.println(taylor);
    System.out.println(remi);
    System.out.println();
  }
}
