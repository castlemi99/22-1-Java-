import PenP.Pen2;

class PenUser2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello Pen!");

		Pen2 mypen1 = new Pen2();
		mypen1.write();

		Pen2 mypen2 = new Pen2("IT 공학전공");
		mypen2.write();

		Pen2 mypen3 = new Pen2("HSM", "BLUE", 1000);
		mypen3.write();

		Pen2 mypen4 = new Pen2(2022);
		mypen4.write();
	}
}
