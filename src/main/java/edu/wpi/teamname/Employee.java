package edu.wpi.teamname;

import java.util.ArrayList;

public abstract class Employee {

  protected ArrayList<Client> clients;

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

        } else {
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

  protected ArrayList returnClients() {
    return this.getClients();
  }
}
