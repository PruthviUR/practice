package banking;

public class BankAccount {
private int acctNo;
private String name;
private String type;
private double balance;
public BankAccount(int acctNo, String name, String type,double balance) {
	super();
	this.acctNo = acctNo;
	this.name = name;
	this.type = type;
	this.balance=balance;
	
}
@Override
public String toString() {
	return "BankAccount [acctNo=" + acctNo + ", name=" + name + ", type=" + type + ",balance="+balance+"]";
}
public boolean equals(Object o)
{
	System.out.println("in acct equals");
	if(o instanceof BankAccount)
	return this.acctNo==((BankAccount)o).acctNo;
	return false;
}

}
