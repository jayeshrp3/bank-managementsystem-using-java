
import java.io.*;
import java.util.*;



class account
{
	long acc_no;
	String acc_name;
	double balance;
	
	account(long a, String n, double b)
	{
		acc_no=a;
		acc_name=n;
		balance=b;
	}
	
	void display()
	{
		 System.out.println("\nAcc_no:\t"+acc_no);
		 System.out.println("Name:\t"+acc_name);
		 System.out.println("Initial balance:\t"+balance);
	}
}

class savings extends account
{
	double amt,amtw,savings_bal1,savings_bal;
	savings(long a, String n, double b, double am,double amw)
	{
		super(a,n,b);
		amt=am;
		amtw=amw;
		savings_bal=(amt+balance);
		savings_bal1=(balance-amtw);
	}	
	
	void displayd()
	{
		super.display();
		System.out.println("\nSavings amount:\t"+amt);
		System.out.println("Final balance:\t"+savings_bal);
			
	}
	void displayw()
	{
		System.out.println("\nWithdraw balance:\t"+amtw);
		System.out.println("Final balance:\t"+savings_bal1);
	}	
}

class current extends account
{
	double amtc,amtcw,amcw,current_bal1,current_bal;
	current(long a, String n, double b, double amc)
	{
		super(a,n,b);
		amtc=amc;
		amtcw=amcw;
		current_bal=(amtc+balance);
		current_bal1=(balance-amtcw);
	}	
	void displayd()
	{
		super.display();
		System.out.println("\nCurrent Acc amount:\t"+amtc);
		System.out.println("Final balance:\t"+current_bal);
			
	}
	void displayw()
	{
		System.out.println("\nWithdraw balance:\t"+amtcw);
		System.out.println("Final balance:\t"+current_bal1);
	}	
	
}

class fd extends account
{
	int year;
	double fd_interset,fd_amt,fd_bal,fd_in,tot;
	fd(long a, String n, double b, int y,double fd_am)
	{
		super(a,n,b);
		
		fd_amt=fd_am;
		year=y;
		if(year==3)
		{
			fd_in=0.05;
		}
		else if(year==5)
		{
			fd_in=0.08;
		}
		else if(year==10)
		{
			fd_in=0.1;
		}
		fd_bal=(fd_in*fd_amt+fd_amt);
		tot=(fd_bal+balance);
	}
	
	void display()
	{
		super.display();
		System.out.println("\nFD amount:\t"+fd_amt);
		System.out.println("FD balance after "+year	+" years is:\t"+fd_bal);
		System.out.println("Total balance:"+tot);
		
		
	}
}

class loan
{
	long acc_no1;
	String acc_name1;
	
	loan(long a1, String n1)
	{
		acc_no1=a1;
		acc_name1=n1;
	}
	
	void display1()
	{
		 System.out.println("\nAcc_no:\t"+acc_no1);
		 System.out.println("Name:\t"+acc_name1);
	}
}

class perloan extends loan
{	
	int year1;
	double pl_interest, pl_amt, pl_in, tot1;
	perloan(long a, String n, int y1, double pl_am)
	{
		super(a,n);
		pl_amt=pl_am;
		year1=y1;
		
		if(year1==3)
		{
			pl_in=0.015;
		}
		else if(year1==5)
		{
			pl_in=0.086;
		}
		else if(year1==10)
		{
			pl_in=0.150;
		}
		tot1=(pl_in*pl_amt+pl_amt);

	}	
	
	void display1()
	{
		super.display1();
		System.out.println("\nPersonal Loan amount");
		System.out.println("Personal Loan amount after"+year1+" years is:\t"+tot1);	
	}	
}

class homeloan extends loan
{
	int year2;
	double hl_interest, hl_amt, hl_in, tot2;
	homeloan(long a, String n, int y2, double hl_am)
	{
		super(a,n);
		hl_amt=hl_am;
		year2=y2;
		
		if(year2==3)
		{
			hl_in=0.045;
		}
		else if(year2==5)
		{
			hl_in=0.086;
		}
		else if(year2==10)
		{
			hl_in=0.120;
		}
		tot2=(hl_in*hl_amt+hl_amt);

	}	
	
	void display1()
	{
		super.display1();
		System.out.println("\nHome Loan amount");
		System.out.println("Home Loan amount after"+year2+" years is:\t"+tot2);	
	}
}


class bank
{
	

 static int n=100;
	static
{
	
	System.out.println("\n==============================================================================\n");
	System.out.println(".............................Welcome To MJSV Bank.............................\n");
	System.out.println("==============================================================================\n");
}
	
	public static void main(String args[])throws IOException
	{	
		Scanner s=new Scanner(System.in);
	
	while(n!=0)
		{
			System.out.println("\n1.Accounts\n2.Loan\n3.Exit\n\nEnter your choice\n");
			int choice=s.nextInt();
			switch(choice)
			{
				case 1:
				Scanner s1=new Scanner(System.in);
				long  acc_no;
				String acc_name;
				double balance;
			
				System.out.println("\nEnter   Account name\n\tAccount Number\n\tBalance\n");
			
				acc_name=s1.nextLine();
				acc_no=s1.nextInt();
				balance=s1.nextDouble();
			
				System.out.println("\nEnter \n1. Savings\n2. FD\n3. Current\n");
				int choicea=s1.nextInt();
			
					switch(choicea)
					{
						case 1:System.out.println("\n1.Deposit\n2.Withdraw\n");
							int num=s1.nextInt();
							switch(num)
							{
								case 1:
								 System.out.println("\nEnter amount to deposit in savings Acc");
							  double am=s1.nextDouble();
							  double amw=0;
							  savings  s5=new savings(acc_no,acc_name,balance,am,amw);
							  s5.displayd();
							  break;
								case 2:System.out.println("\nEnter amount to Withdraw in savings Acc");
							   amw=s1.nextDouble();
							   am=0;
							  savings  s6=new savings(acc_no,acc_name,balance,am,amw);
							  s6.displayw();
							  
							  break;
					  		}
					  		break;
						case 2:System.out.println("\nEnter amount of Fixed deposit\n");
							double fd_am=s1.nextDouble();
							System.out.println("\nEnter number of years 3, 5 or 10");
							int y=s1.nextInt();
							fd f=new fd(acc_no,acc_name,balance,y,fd_am);
							f.display();
							break;
						
						case 3:System.out.println("\n1.Deposit\n2.Withdraw\n");
							 num=s1.nextInt();
							switch(num)
							{
								case 1:
								 System.out.println("\nEnter amount to deposit in Current Acc");
							  double amc=s1.nextDouble();
							  double amcw=0;
							  savings  s5=new savings(acc_no,acc_name,balance,amc,amcw);
							  s5.displayd();
							  break;
								case 2:System.out.println("\nEnter amount to Withdraw in Current Acc");
							   amcw=s1.nextDouble();
							   amc=0;
							  savings  s6=new savings(acc_no,acc_name,balance,amc,amcw);
							  s6.displayw();
							  
							  break;
					  		}
							break;
						}
					    break;
				case 2:
					Scanner s3=new Scanner(System.in);
					long  acc_no1;
					String acc_name1;
			
					System.out.println("\nEnter   Account name\n\tAccount Number\n");
			
					acc_name1=s3.nextLine();
					acc_no1=s3.nextInt();
			
					System.out.println("\nEnter \n1.Personal Loan\n2.Home Loan\n");
					int choicel=s3.nextInt();
				
	
						switch(choicel)
						{
							case 1:BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
								System.out.println("\nReason for applying Loan");
								String reason=br.readLine();
								System.out.println("Enter your amount for Personal loan\n");
								double pl_am=s3.nextDouble();
									System.out.println("\nEnter number of years 3, 5 or 10");
									int y1=s3.nextInt();
									perloan pl=new perloan(acc_no1,acc_name1,y1,pl_am);
									pl.display1();
									break;
							case 2:System.out.println("Enter your amount for Home loan\n");
								double hl_am=s3.nextDouble();
									System.out.println("\nEnter number of years 3, 5 or 10");
									int y2=s3.nextInt();
									homeloan hl=new homeloan(acc_no1,acc_name1,y2,hl_am);
									hl.display1();
									break;
				
				
						}
					break;
				case 3:n=0;
				break;
			}	
		}	
	}			
}
		
/*
OUTPUT

student@lab:~/Desktop$ javac bank1.java
student@lab:~/Desktop$ java bank

==============================================================================

.............................Welcome To MJSV Bank.............................

==============================================================================


1.Accounts
2.Loan
3.Exit

Enter your choice

1

Enter   Account name
	Account Number
	Balance

mandar
35756
6000

Enter 
1. Savings
2. FD
3. Current

1

1.Deposit
2.Withdraw

1

Enter amount to deposit in savings Acc
500

Acc_no:	35756
Name:	mandar
Initial balance:	6000.0

Savings amount:	500.0
Final balance:	6500.0

1.Accounts
2.Loan
3.Exit

Enter your choice

1

Enter   Account name
	Account Number
	Balance

saurav
3587
10000

Enter 
1. Savings
2. FD
3. Current

3

1.Deposit
2.Withdraw

2

Enter amount to Withdraw in Current Acc
500

Withdraw balance:	500.0
Final balance:	9500.0

1.Accounts
2.Loan
3.Exit

Enter your choice

1

Enter   Account name
	Account Number
	Balance

vaibhav
456677  
50000 

Enter 
1. Savings
2. FD
3. Current

2

Enter amount of Fixed deposit

5000

Enter number of years 3, 5 or 10
10

Acc_no:	456677
Name:	vaibhav
Initial balance:	50000.0

FD amount:	5000.0
FD balance after 10 years is:	5500.0
Total balance:55500.0

1.Accounts
2.Loan
3.Exit

Enter your choice

2

Enter   Account name
	Account Number

jayesh
46688

Enter 
1.Personal Loan
2.Home Loan

1

Reason for applying Loan
Party deni hai
Enter your amount for Personal loan

10000

Enter number of years 3, 5 or 10
3

Acc_no:	46688
Name:	jayesh

Personal Loan amount
Personal Loan amount after3 years is:	10150.0

1.Accounts
2.Loan
3.Exit

Enter your choice

3
student@lab:~/Desktop$ 
*/
		
		
		
		
		
		
		
		
	
