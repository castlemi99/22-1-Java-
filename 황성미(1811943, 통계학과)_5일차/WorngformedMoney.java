public class WorngformedMoney extends RuntimeException
{
	public WorngformedMoney(){
		super("음수의 금액은 계산할 수 없습니다. 0 이상의 수를 입력해주세요:)");
	}
}
