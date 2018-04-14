package LinhLuan;

public class main2 {
	public static void main(String[] args) {
		
		System.out.print("info cua khach hang la ");
		customer nhoc = new customer("LockLinh ", " Ninh Binh");
		nhoc.SendOrder();
		System.out.print("\nSpecical Order duoc yeu cau ngay ");
		specicalOrder lock = new specicalOrder(13 ,3, " number 127925");
		lock.dispatch();
		System.out.print("\nNormalOrder duoc yeu cau ngay ");
		normalOrder op = new normalOrder(24, " number 12643");
		op.confirm();
		
	}
}
