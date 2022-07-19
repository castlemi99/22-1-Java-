import java.awt.*;

public class  LoginUIHWSol
{
	Frame f;
	//UI 관련 변수
	Label llg , lpw, lnote, lok;
	TextField login, passwd;
	TextArea note;
	Button ok;
	//흩어져있는 변수들을 묶어주는 변수
	Panel p1, p2, p3, p12;

	public LoginUIHWSol(String msg){
		f = new Frame(msg);
		f.setLayout(new BorderLayout());
		
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		p12 = new Panel(new GridLayout(2,1));

		//UI 관련 컴포넌트 객체 생성
		llg = new Label("Login");
		lpw = new Label("Password");
		lok = new Label("press");

		login = new TextField(50);
		passwd = new TextField(50);
		passwd.setEchoChar('*');

		ok = new Button("OK");
	
		//생성된 컴포넌트 객체의 배치
		p1.add(llg);
		p1.add(login);
		p2.add(lpw);
		p2.add(passwd);
		p3.add(lok);
		p3.add(ok);

		p12.add(p1);
		p12.add(p2);

		f.add(p12, "North");
		f.add(p3, "South");

		f.setSize(900,400);
		f.setVisible(true);
	}
}
