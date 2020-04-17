package edu.wpi.teamname;

import java.util.ArrayList;

public class SalesAssociate extends Employee {

  // FIELDS

  protected String employeeName;
  protected SalesManager manager;
  protected long salesID;

  // CONSTRUCTOR

  public SalesAssociate(String employeeName, SalesManager manager, long salesID) {
    this.employeeName = employeeName;
    this.manager = manager;
    manager.addEmployee(this);
    this.salesID = salesID;
    this.setName(employeeName);
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
