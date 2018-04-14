package LinhLuan;

public class specicalOrder extends order{
	public int month;
	public specicalOrder(int dd,int mm, String num){
		super(dd,num);
		mm= month;
}// extends contructor @@ 
	void dispatch() {
		specicalOrder SO= new specicalOrder(13,3," number 189263");
	}
}

