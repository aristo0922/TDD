package BankBusiness.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import BankBusiness.Account;
import org.junit.jupiter.api.Test;

public class AccountTest {
  @Test
  void testAccount() throws Exception {
    Account account = new Account();
  }

  @Test
  void testGetBalance() throws Exception{
    Account account = new Account(10000);
    assertEquals(10000, account.getBalance());

    account = new Account(1000);
    assertEquals(1000, account.getBalance());


    account = new Account(100);
    assertEquals(100, account.getBalance());

    account = new Account(0);
    assertEquals(0, account.getBalance());
  }
}
