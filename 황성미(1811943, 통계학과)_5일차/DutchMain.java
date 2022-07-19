public class DutchMain 
{
	public static void main(String[] args) 
	{
		int condition = 0;
		Dutch example = new Dutch("tteokbokki");

		while(true){
			try{
				condition = 1;
				example.inputmoney();
			}catch(WorngformedMoney wfm){
				wfm.printStackTrace();
				condition = 2;
			}finally{
				if (condition == 2)
				{
					System.out.println("금액을 다시 입력해주세요.");
				}else{
					System.out.println("금액이 정상적으로 입력되었습니다.");
					break;
				}
			}
		}


		while(true){
			try{
				condition = 1;
				example.inputpeoplenum();
			}catch(WorngformedPeoplenum wfp){
				wfp.printStackTrace();
				condition = 2;
			}finally{
				if (condition == 2)
				{
					System.out.println("더치페이할 인원을 다시 입력해주세요.");
				}else{
					System.out.println("인원 수가 정상적으로 입력되었습니다.");
					break;
				}
				
			}

		}


		example.check();
		example.divide();
		example.show();

	}
}
