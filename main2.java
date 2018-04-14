package LinhLuan;

public class main2 {
public static void main(String args []) {
	customer nhoc=new customer();
	specicalOrder lock=new specicalOrder();
	normalOrder op= new  normalOrder();
	
	nhoc.SendOrder();
	nhoc.ReceiveOrder();
	lock.confirm();
	lock.close();
	lock.dispatch();
	op.close();
	op.dispatch1();
	op.confirm();
	
}
}
