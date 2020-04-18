package edu.wpi.teamname;

import java.util.ArrayList;

public abstract class Employee {

  protected static String employeeName;
  protected static SalesManager manager;
  protected static long salesID;
  protected ArrayList<Client> clients;

  public Employee(String employeeName, SalesManager manager, long salesID) {
    clients = new ArrayList<Client>();
    this.employeeName = employeeName;
    this.manager = manager;
    this.salesID = salesID;
  }

  /**
   * adds a client to the employee's list of clients so that the clients are sorted in numerical
   * order by client id
   *
   * @param newClient client to be added to the client list
   * @return true of it worked, false if it didn't
   */
  public boolean addClient(Client newClient) {
    ArrayList<Client> currentClients = this.clients;
    ArrayList<Client> newClients = new ArrayList<Client>();

    if (clients.isEmpty()) {
      clients.add(newClient);
      return true;
    } else {
      for (Client aClient : clients) {
        if (aClient.getClientID() < newClient.getClientID()) {
          newClients.add(currentClients.remove(0));
        } else if (aClient.getClientID() == newClient.getClientID()) {
          return false;
        }
        {
          newClients.add(newClient);
          newClients.addAll(currentClients);
          clients.clear();
          clients.addAll(newClients);
          return true;
        }
      }
    }
    return false;
  }

  private ArrayList<Client> getClients() {
    return clients;
  }

  public String getName() {
    return employeeName;
  }

  public void setName(String name) {
    this.employeeName = name;
  }

  protected ArrayList returnClients() {
    return this.getClients();
  }
}
