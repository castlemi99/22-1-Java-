import java.awt.*;

public class  LoginUIHW
{
	Frame f;
	//UI 관련 변수
	Label llg , lpw, lok;
	TextField login, passwd;
	Button ok;

	public LoginUIHW(String msg){
		f = new Frame(msg);
		f.setLayout(new FlowLayout());
		
		//UI 관련 컴포넌트 객체 생성
		llg = new Label("Login");
		lpw = new Label("Password");
		lok = new Label("press");

		login = new TextField(50);
		passwd = new TextField(50);
		passwd.setEchoChar('*');

		ok = new Button("OK");
	
		//생성된 컴포넌트 객체의 배치
		f.add(llg);
		f.add(login);
		f.add(lpw);
		f.add(passwd);
		f.add(lok);
		f.add(ok);

		f.setSize(900,400);
		f.setVisible(true);
	}
}
