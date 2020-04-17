package edu.wpi.teamname;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class SalesManagerTest {

  // TEST OBJECTS//
  long salesId1 = 3;
  long salesId2 = 4;
  long salesId3 = 7;
  long salesId4 = 20;
  ArrayList<Employee> employees = new ArrayList<>();
  SalesManager emp2 = new SalesManager("Charlie", employees, salesId2);
  SalesManager emp1 = new SalesManager("Sam", employees, salesId1);
  SalesAssociate emp3 = new SalesAssociate("Sven", emp2, salesId3);
  SalesAssociate emp4 = new SalesAssociate("Alex", emp1, salesId4);
  Client amyClient = new Client(2, "Amy", emp3);
  Client danClient = new Client(21, "Dan", emp3);
  Client fredClient = new Client(12, "Fred", emp4);

  @Test
  void getEmployeeName() {}

  @Test
  void getEmployees() {}

  @Test
  void getManager() {}

  @Test
  void getSalesID() {}

  @Test
  void testBonus() {
    double bonus = 0;

    bonus = emp3.bonus();
    assertEquals(10000, bonus);
  }
}
