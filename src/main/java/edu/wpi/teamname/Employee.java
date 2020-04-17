package edu.wpi.teamname;

import java.util.ArrayList;

public abstract class Employee {

  protected ArrayList<Client> clients;
  private String name;

  public Employee() {
    clients = new ArrayList<Client>();
  }

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
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  protected ArrayList returnClients() {
    return this.getClients();
  }
}
