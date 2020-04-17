package edu.wpi.teamname;

import java.util.ArrayList;

public class SalesAssociate extends Employee {

  // FIELDS

  // CONSTRUCTOR

  public SalesAssociate(String employeeName, SalesManager manager, long salesID) {
    Employee.employeeName = employeeName;
    Employee.manager = manager;
    manager.addEmployee(this);
    Employee.salesID = salesID;
    this.setName(employeeName);
  }

  // METHODS

  public String getEmployeeName() {
    return Employee.employeeName;
  }

  public void setEmployeeName(String newName) {
    Employee.employeeName = newName;
  }

  public SalesManager getManager() {
    return Employee.manager;
  }

  public void setManager(SalesManager newManager) {
    Employee.manager = newManager;
  }

  public long getSalesID() {
    return Employee.salesID;
  }

  public void setSalesID(long newSalesID) {
    Employee.salesID = newSalesID;
  }

  double bonus() {
    double bonus = 0;
    ArrayList<Client> clients;
    int numberOfClients;

    clients = this.returnClients();
    numberOfClients = clients.size();
    bonus = numberOfClients * 500;

    return bonus;
  }

  @Override
  public String toString() {
    String returnString =
        "Sales Associate: "
            + employeeName
            + ". Sales Manager: "
            + manager.getEmployeeName()
            + " Clients: ";

    String clientString = "";
    for (Client client : clients) {
      if (!clientString.equals("")) clientString += ", ";

      clientString += client.getClientName() + " " + client.getClientID();
    }

    returnString += clientString;

    return returnString;
  }
}
