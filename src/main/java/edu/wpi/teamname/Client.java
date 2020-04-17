package edu.wpi.teamname;

public class Client {

    private String clientID;
    private String clientName;
    private Employee salesEmployee;

    /**
     * constructs a client object
     * @param clientID unique client id
     * @param clientName name of the client
     */
    public Client(String clientID, String clientName, Employee salesEmployee){
        this.clientID = clientID;
        this.clientName = clientName;
        this.salesEmployee = salesEmployee;
    }

    /**
     *
     * @return client id
     */
    protected String getClientID() {
        return clientID;
    }

    protected void setClientID(String clientID) {
        this.clientID = clientID;
    }

    /**
     *
     * @return client name
     */
    protected String getClientName(){
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

    private double totalSales(){
        return 0;
    }
}
