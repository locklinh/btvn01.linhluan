package LinhLuan;

public class specicalOrder extends order{
	public int month;
	public specicalOrder(int date,int month, String number){
		super(date,number);
		 this.month= month;
}// extends contructor @@ 
	void dispatch() {
		System.out.print(date+""+month+""+number);
		//specicalOrder SO= new specicalOrder(13,3," number 189263");
	}
}

