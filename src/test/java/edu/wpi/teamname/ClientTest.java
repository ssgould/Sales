package edu.wpi.teamname;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class ClientTest {

  SalesManager managerKaren = new SalesManager("Karen", new ArrayList<Employee>(), null, 123);
  SalesAssociate associateBill = new SalesAssociate("Bill", managerKaren, 233);
  Client amyClient = new Client(2, "Amy", associateBill);
  Client danClient = new Client(21, "Dan", associateBill);
  Client fredClient = new Client(12, "Fred", associateBill);

  @Test
  public void addClient() {
    ArrayList<Client> expectedOutput = new ArrayList<>();
    expectedOutput.add(amyClient);
    expectedOutput.add(fredClient);
    expectedOutput.add(danClient);

    assertEquals(expectedOutput, associateBill.returnClients());
  }
}
