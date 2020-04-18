package edu.wpi.teamname;

import java.util.ArrayList;

public class SalesAssociate extends Employee {

  // FIELDS

  // CONSTRUCTOR

  public SalesAssociate(String employeeName, SalesManager manager, long salesID) {
    super(employeeName, manager, salesID);
    manager.addEmployee(this);
  }

  // METHODS

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String newName) {
    employeeName = newName;
  }

  public SalesManager getManager() {
    return manager;
  }

  public void setManager(SalesManager newManager) {
    manager = newManager;
  }

  public long getSalesID() {
    return this.salesID;
  }

  public void setSalesID(long newSalesID) {
    this.salesID = newSalesID;
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
            + ". Clients: ";

    String clientString = "";
    for (Client client : clients) {
      if (!clientString.equals("")) clientString += ", ";

      clientString += client.getClientName() + " " + client.getClientID();
    }

    returnString += clientString;

    return returnString;
  }
}
