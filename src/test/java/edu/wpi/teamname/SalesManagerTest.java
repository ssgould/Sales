package edu.wpi.teamname;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class SalesManagerTest {

  //TEST OBJECTS
  Employee emp1 = new Employee();
  Employee emp2 = new Employee();
  Employee emp3 = new Employee();
  long salesId1 = 123456789;
  ArrayList<Employee> employees = new ArrayList<>(emp1, emp2, emp3);
  SalesManager salesManager = new SalesManager("Bob Johnson", employees, salesId1);

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
    bonus = salesManager.bonus();
    assertEquals(30000, bonus);
  }
}
