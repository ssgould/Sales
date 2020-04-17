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
   * adds a client to the employee's list of clients so that the clients are sorted in numerical order by client id
   * @param newClient client to be added to the client list
   * @return
   */
  public boolean addClient(Client newClient) {
    ArrayList<Client> currentClients = this.clients; //current client list
    ArrayList<Client> newClients = new ArrayList<Client>(); // will contain sorted list

    //if there are no clients in the list, just add the client to the list
    if (clients.isEmpty()) {
      clients.add(newClient);
      return true;
    } else {
      //go through the whole list
      for (Client aClient : clients) {
        //if the id of the client already sorted is in numerical order
        if (aClient.getClientID() < newClient.getClientID()) {
          newClients.add(currentClients.remove(0));//take it out and put it at the end of the new list
        } else if (aClient.getClientID() == newClient.getClientID()) {//this would cause an error
          return false;
        } else {
          //if the newClient is before aClient in numerical order
          newClients.add(newClient);//put the new client in
          newClients.addAll(currentClients);//add the rest of the clients in (sorted)
          //reset the list
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
