package LinhLuan;

public class normalOrder extends order {
	public normalOrder(int dd, String num){
		super(dd,num);
}
	void dispatch1() {
		normalOrder SO= new normalOrder(24," number 1892715");
	}
	void receive() {
		normalOrder SO= new normalOrder(11," number 189263");
	}
}