class BankServices 
{
	String userid=" ";
	int accbal;
	int usernumber;
	
	public String getuid() {
		return userid;
	}

	public void setuid(String userid) {
		this.userid = userid;
	}

	public int getab() {
		return accbal;
	}

	public void setab(int accbal) {
		this.accbal = accbal;
	}

	public int getunum() {
		return usernumber;
	}

	public void setunum(int usernumber) {
		this.usernumber = usernumber;
	}

	public void displayDetail()
	{
		System.out.println("User ID: "+ userid+", Account Balance: "+accbal+", User Number: "+usernumber);
	}
}
public class BankServices_main 
{
	public static void main(String[] args) 
	{
		BankServices b1=new BankServices();
		b1.setuid("Naga Srivani");
		b1.setab(20000);
		b1.setunum(708012836);
		b1.displayDetail();
	}
}