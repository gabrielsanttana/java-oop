package constructors;

public class Account {
  public int accountNumber;
  public double balance;
  public String costumerName;
  public String costumerEmailAddress;
  public String costumerPhoneNumber;

  public Account() {
    this(99999, 0, "Default name", "Default email", "Default phone number");
  }

  public Account(int accountNumber, double balance, String costumerName, String costumerEmailAddress, String costumerPhoneNumber) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.costumerName = costumerName;
    this.costumerEmailAddress = costumerEmailAddress;
    this.costumerPhoneNumber = costumerPhoneNumber;
  }

  public void deposit(double value) {
    this.balance += value;
  }

  public void withdrawal(double value) {
    if(this.balance - value < 0) {
      System.out.println("It wasn't possible to withdrawal this value. Insufficient balance!");
      return;
    }

    this.balance -= value;
    System.out.println("Withdrawal done! Your remaining balance: "+ balance);
  }

  public int getAccountNumber() {
    return this.accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
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