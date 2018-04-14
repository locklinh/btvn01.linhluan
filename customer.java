package LinhLuan;

public class customer {
	String name;
	String location;
	customer(String n, String local){
		n= name;
		local= location;
		//  contructor  can have name the same class
	}
	int SendOrder() {
		customer a1 = new customer ("locklinh","NinhBinh");
		// create 1 ob  define by contructor
		// 1 ham kieu int, float, bloolean.... thi phai co gia tri tra ve sau return
		return 0;
	}
	int ReceiveOrder() {
		System.out.println("ham nay receive nay lam gi nhi ? ");
		
		return 0;
		
	}
}
