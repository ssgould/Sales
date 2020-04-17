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

  /**
   * sets the id of the client
   *
   * @param clientID new id value
   */
  protected void setClientID(int clientID) {
    this.clientID = clientID;
  }

  /** @return client name */
  protected String getClientName() {
    return clientName;
  }

  /**
   * sets clients name to new value
   *
   * @param clientName new name value
   */
  protected void setClientName(String clientName) {
    this.clientName = clientName;
  }

  /** @return the sales employee associated with the client */
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
    return "Client: " + clientName + " Sales Employee: " + salesEmployee.getName();
  }
}
