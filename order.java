package LinhLuan;

public class order {
	public int date;
	public String number;
	
public order (int dd,String num){
	dd=date;
	//mm= month;
	num= number;
}
void confirm() {
	System.out.println("confrim request in date");
	order op= new order(12,"129172");
}
void close() {
	System.out.println("ham close nay de lam gi nhi ? ");
}
}
