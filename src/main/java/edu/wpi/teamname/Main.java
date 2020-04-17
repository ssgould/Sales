package edu.wpi.teamname;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    System.out.println("Hi this is Sam");

    SalesManager managerKaren = new SalesManager("Karen", new ArrayList<Employee>(), null, 123);
    SalesAssociate associateBill = new SalesAssociate("Bill", managerKaren, 233);
    Client amyClient = new Client(2, "Amy", managerKaren);
    Client danClient = new Client(21, "Dan", associateBill);
    Client fredClient = new Client(12, "Fred", associateBill);

    System.out.println(managerKaren.toString());
    System.out.println(associateBill.toString());
    System.out.println(amyClient);
    System.out.println(danClient);
    System.out.println(fredClient);
  }
}
