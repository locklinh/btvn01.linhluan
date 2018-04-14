package LinhLuan;

public class customer {
	String name;
	String location;
	customer(String name, String location){
		 this.name= name;
	 this.location = location;
		//  contructor  can have name the same class
	}
	void SendOrder() {

		System.out.print(name+""+location);
		// create 1 ob  define by contructor
		// 1 ham kieu int, float, bloolean.... thi phai co gia tri tra ve sau return
		
	}
	
	void ReceiveOrder() {
		
	}
}
