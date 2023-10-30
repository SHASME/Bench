package hackerrank;

import java.util.Scanner;

public class BankAccount {
int balance;
int previousTransaction;
String customerName;
String customerId;
public BankAccount(String cName, String cId) {
	customerName=cName;
	customerId=cId;
}

void deposit(int amount)
{
	if(amount !=0) {
		balance=balance+amount;
		previousTransaction=amount;
	}
	}
void withdraw(int amount) {
	if(amount !=0)
	{
		balance=balance-amount;
		previousTransaction= -amount;
	}
}

void showMenu() {
	char option='\0';
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Welcome : "+customerName);
	System.out.println("Your Id is : "+customerId);
	System.out.println("\n");
	System.out.println("A.Check Balance");
	System.out.println("B. Deposit");
	System.out.println("C.Withdraw");
	System.out.println("D.previousTransaction");
	System.out.println("E. exit");
	
	do
	{
		System.out.println("-------------------------------------------");
		System.out.println("Enter your option");
		System.out.println("--------------------------------------------");
		option=sc.next().charAt(0);
		System.out.println("\n");
		
		
		switch(option) {
		
		case 'A':
			System.out.println("----------------------------");
			System.out.println("Balance ="+balance);
			System.out.println("----------------------------");
			System.out.println("\n");
			break;
			
		case 'B':
			System.out.println("-----------------------------");
			System.out.println("Enter an amount to deposit");
			System.out.println("-----------------------------");
			int amount1 = sc.nextInt();
			deposit(amount1);
			System.out.println("\n");
			break;
			
		case 'C':
			System.out.println("-------------------------------");
			System.out.println("Enter an amount to Withdraw");
			System.out.println("-----------------------------");
			int amount=sc.nextInt();
			withdraw(amount);
			System.out.println("\n");
		     break;
		
		case 'D':
			System.out.println("-------------------------------");
			getPreviousTransaction();
			System.out.println("-----------------------------");
			System.out.println("\n");
			
			default:
			System.out.println("Invalid option!! please enter again");
		}
} 
while(option !='E');
	System.out.println("Thank you for using our service");
}

private void getPreviousTransaction() {
	// TODO Auto-generated method stub
	if(previousTransaction>0) {
		System.out.println("Deposited :  "+previousTransaction);
	}
	else if(previousTransaction<0) {
		System.out.println("Withdraw: "+Math.abs(previousTransaction));
	}
	else
	{
		System.out.println("No transaction is occured");
	
}
}
}
	
