package edu.wpi.teamname;

public class Client {

  private int clientID;
  private String clientName;
  private Employee salesEmployee;

  /**
   * constructs a client object
   *
   * @param clientID unique client id
   * @param clientName name of the client
   */
  public Client(int clientID, String clientName, Employee salesEmployee) {
    this.clientID = clientID;
    this.clientName = clientName;
    this.salesEmployee = salesEmployee;
    salesEmployee.addClient(this);
  }

  /** @return client id */
  protected int getClientID() {
    return clientID;
  }

  protected void setClientID(int clientID) {
    this.clientID = clientID;
  }

  protected String getClientName() {
    return clientName;
  }

  protected void setClientName(String clientName) {
    this.clientName = clientName;
  }

  protected Employee getSalesEmployee() {
    return salesEmployee;
  }

  protected void setSalesEmployee(Employee salesEmployee) {
    this.salesEmployee = salesEmployee;
  }

  private double totalSales() {
    return 0;
  }

  @Override
  public String toString() {
    return "Client: " + clientName + " Sales Employee: " + salesEmployee;
  }
}
