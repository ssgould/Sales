package edu.wpi.teamname;

import java.util.ArrayList;

public class SalesManager extends Employee {

  // FIELDS

  protected String employeeName;
  private ArrayList<Employee> employees;
  protected SalesManager manager;
  protected long salesID;

  // CONSTRUCTOR

  public SalesManager(
      String employeeName, ArrayList<Employee> employees, SalesManager manager, long salesID) {
    this.employeeName = "John Doe";
    this.employees = new ArrayList<Employee>();
    this.manager = manager;
    this.salesID = salesID;
  }

  // METHODS

  public String getEmployeeName() {
    return this.employeeName;
  }

  public void setEmployeeName(String newName) {
    this.employeeName = newName;
  }

  public ArrayList<Employee> getEmployees() {
    return this.employees;
  }

  public void setEmployees(ArrayList<Employee> newEmployees) {
    this.employees = newEmployees;
  }

  public SalesManager getManager() {
    return this.manager;
  }

  public void setManager(SalesManager newManager) {
    this.manager = newManager;
  }

  public long getSalesID() {
    return this.salesID;
  }

  public void setSalesID(long newSalesID) {
    this.salesID = newSalesID;
  }

  private double bonus() {
    double bonus = 0;
    ArrayList<Client> clients;
    int numberOfClients;

    clients = this.returnClients();
    numberOfClients = clients.size();
    bonus = numberOfClients * 10000;

    return bonus;
  }
}
