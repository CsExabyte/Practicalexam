
public class Banking {
	String name,type;
	int accno;
	float balance;
	Banking(String name,String type,int accno,float balance){
		this.name=name;
		this.type=type;
		this.accno=accno;
		this.balance=balance;
	}
	void display() {
		System.out.println("Name:"+name);
		System.out.println("Type of Account:"+type);
		System.out.println("Account Number:"+accno);
		System.out.println("Balance:"+balance);
	}
	
}
