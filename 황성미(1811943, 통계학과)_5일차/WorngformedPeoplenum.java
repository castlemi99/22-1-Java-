public class WorngformedPeoplenum extends RuntimeException
{
	public WorngformedPeoplenum(){
		super("0 이하의 사람 수는 더치페이를 할 수 없습니다. 1 이상의 사람 수를 입력해주세요:)");
	}
}
