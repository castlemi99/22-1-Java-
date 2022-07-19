public class Bank
{
	public static void main(String[] args) 
	{
		Account hong = new Account("홍길동");

		//hong.deposit(20);
		hong.deposit(-100); //MalformedData 예외 발생

		try{
			//1st try
			hong.withdraw(15);
			//hong.deposit(-20);
			
			//2nd try
			//hong.withdraw(-50); //MalformedData 예외 발생
			
		}catch (BalanceOutOfBoundsException be){
			be.printStackTrace();
		}catch (MalformedData me){
			me.printStackTrace();
		}
		
		
		//1st try
		hong.check();
		//hong.withdraw(1); //BalanceOutOfBoundsException 예외 발생
		
		//2nd try
		try
		{
			hong.withdraw(10);//BalanceOutOfBoundsException 예외 발생
		}
		catch (BalanceOutOfBoundsException be)
		{
			be.printStackTrace();
		}

		System.out.println("normal termination");
	}
}
