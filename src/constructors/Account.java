package constructors;

public class Account {
  public int accountNumber;
  public int balance;
  public String costumerName;
  public String costumerEmailAddress;
  public String costumerPhoneNumber;

  public int getAccountNumber() {
    return this.accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public int getBalance() {
    return this.balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getCostumerName() {
    return this.costumerName;
  }

  public void setCostumerName(String name) {
    this.costumerName = name;
  }

  public String getCostumerEmailAddress() {
    return this.costumerEmailAddress;
  }

  public void setCostumerEmailAddress(String emailAddress) {
    this.costumerEmailAddress = emailAddress;
  }

  public String getCostumerPhoneNumber() {
    return this.costumerPhoneNumber;
  }

  public void setCostumerPhoneNumber(String phoneNumber) {
    this.costumerPhoneNumber = phoneNumber;
  }
}