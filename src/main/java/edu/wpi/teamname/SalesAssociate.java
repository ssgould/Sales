package edu.wpi.teamname;

import java.util.ArrayList;

public class SalesAssociate extends Employee {

  // FIELDS

  protected String employeeName;
  protected SalesManager manager;
  protected long salesID;

  // CONSTRUCTOR

  public SalesAssociate(
      String employeeName, ArrayList<Employee> employees, SalesManager manager, long salesID) {
    this.employeeName = "John Doe";
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

    clients = this.getClients();
    numberOfClients = clients.size();
    bonus = numberOfClients*500;

    return bonus;
  }


}
