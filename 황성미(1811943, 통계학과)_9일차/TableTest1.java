import javax.swing.*;
import java.awt.*;

public class TableTest1
{
	public TableTest1(String msg){
		JFrame jf = new JFrame(msg);

		//Table column 설정
		String columnName[] = {
			"이름", "전화번호", "E-Mail"
		};
		
		//Data 생성
		String data[][]= {
				{"김눈송", "010-1234-1234", "nabi@sm.ac.kr"},
				{"이눈송", "010-4567-4567", "nabi@sookmyung.ac.kr"},
				{"황눈송", "010-1234-4567", "nabi@gmail.com"},
		};

		//Table 생성
		JTable table = new JTable(data, columnName);
		//Table의 내용이 많은 경우 Scrollpane
		JScrollPane sp = new JScrollPane(table);

		//Table 붙이기
		jf.getContentPane().add(sp, BorderLayout.CENTER);

		jf.setSize(400,400);
		jf.setVisible(true);
	}
}  
