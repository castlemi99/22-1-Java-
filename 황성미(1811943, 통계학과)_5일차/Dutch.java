import java.util.Scanner;

public class Dutch
{
	private int money;
	private int peoplenum;
	private int moneyperperson;
	private String object;

	Scanner in = new Scanner(System.in);

	public Dutch(String object){
		this.object = object;
	}

	public void inputmoney() throws WorngformedMoney
	{
		System.out.println("더치페이하실 금액을 입력하세요.");
		money = in.nextInt();
		if(money < 0){
			throw new WorngformedMoney();
		}
		this.money = money;
		System.out.println(money + "원을 입력하셨습니다.");

	}

	public void inputpeoplenum() throws WorngformedPeoplenum
	{
		System.out.println("정산할 사람 수를 입력하세요.");
		peoplenum = in.nextInt();
		if(peoplenum <= 0){
			throw new WorngformedPeoplenum();
		}
		this.peoplenum = peoplenum;
		System.out.println(peoplenum + "명을 입력하셨습니다.");
	}

	public void check()
	{
		System.out.println(money + "원을 " 
			+ peoplenum + "명으로 더치페이하겠습니다.");
	}
	public void divide()
	{
		moneyperperson = money/peoplenum;
	}

	public void show()
	{
		System.out.println("1인당 " + moneyperperson +
			"원씩 정산하면 됩니다!");
	}
}
