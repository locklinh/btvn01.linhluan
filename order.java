package LinhLuan;

public class order {
	public int date;
	public String number;

	public order(int date, String number) {
		this.date = date;
		this.number = number;
	}

	void confirm() {
		System.out.print(date+""+number);
	}

	void close() {
		
	}
}
