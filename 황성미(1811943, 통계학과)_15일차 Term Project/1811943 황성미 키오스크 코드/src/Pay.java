import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.Timer;
import java.util.TimerTask;

public class Pay extends JPanel {
	JButton[] MBtn = new JButton[12];
	ImageIcon[] menuimg = new ImageIcon[12];

	String[] menu = {
			"프리미엄 아메리카노","아메리카노","카페라떼","바나나라떼","카페모카","핫초코",
			"아이스 아메리카노","아이스 카페라떼", "아이스 초코","아이스 바닐라라떼","복숭아 아이스티","자몽에이드"};
	int[] price = {
			1900,1400,2300,2200,2300,1900,
			1900,2500,2300,2300,2300,2300};
	JTextField tf = new JTextField(15);
	JButton[] SBtn = new JButton[3];
	String[] Str = {"선택\n취소","전체\n취소","결제"};
	String [] ColName = {"메뉴","수량","가격"};
	String [][] Data ;
	int count =1;
	DefaultTableModel model = new DefaultTableModel(Data,ColName);
	JTable table = new JTable(model);
	
	//화면 구성
	
	//메뉴창
	class MenuBtn extends JPanel{
		MenuBtn(){
			setLayout(new GridLayout(2,6,4,8));
			setBackground(Color.WHITE);
			for(int i=0;i<MBtn.length;i++) {
				menuimg[i] = new ImageIcon("../MenuImg/menu" + i +".png");
				MBtn[i]= new JButton(price[i]+"원", menuimg[i]);
				MBtn[i].setVerticalTextPosition(JButton.BOTTOM);  // 텍스트 아래로
				MBtn[i].setHorizontalTextPosition(JButton.CENTER); // 텍스트 가운데
				
			}

			for (int i = 0;i < 6 ; i++)
			{
				MBtn[i].setBackground(new Color(204,102,102));
				add(MBtn[i]);
			}

			for (int i = 6;i < MBtn.length ; i++)
			{
				MBtn[i].setBackground(new Color(102,102,153));
				add(MBtn[i]);
			}

		}
	}

	//주문창
	class Screen extends JPanel{
		Screen(){
			setBackground(Color.WHITE);
			DefaultTableModel m = (DefaultTableModel)table.getModel();
			table.setRowHeight(50);
			table.getColumn("메뉴").setPreferredWidth(100);
			table.getColumn("수량").setPreferredWidth(5);
			table.getColumn("가격").setPreferredWidth(20);
			table.getTableHeader().setFont(new Font("맑은고딕", Font.BOLD, 15));
			JScrollPane tablesc = new JScrollPane(table);
			tablesc.setPreferredSize(new Dimension(300,350));
			add(tablesc);
		}
	}
	
	//선택취소, 전체취소, 결제
	class StrBtn extends JPanel{
		StrBtn(){
			setBackground(Color.WHITE);
			setLayout(new GridLayout(1,3,3,3));
			
			for(int i=0;i<Str.length;i++) {
				SBtn[i]= new JButton(Str[i]);
				add(SBtn[i]);
			}
		}
	}
	
	public Pay() {
		setLayout(null);
		setBackground(Color.WHITE);
		MenuBtn mbtn = new MenuBtn();
		StrBtn sbtn = new StrBtn();
		Screen sc = new Screen();
		
		//메뉴
		mbtn.setSize(600, 500);
		mbtn.setLocation(50, 50);
		add(mbtn);
		
		//주문
		sc.setSize(300, 350);
		sc.setLocation(670, 50);
		add(sc);

		//총 금액
		tf.setSize(300, 70);
		tf.setLocation(670, 400);
		add(tf);

		//선택취소, 전체취소, 결제
		sbtn.setSize(300, 50);
		sbtn.setLocation(670, 490);
		add(sbtn);
		
		//메뉴추가 기능
		for(int i=0;i<MBtn.length;i++) {
			final int index =i;
			MBtn[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton MBtn = (JButton)e.getSource();
					DefaultTableModel m = (DefaultTableModel)table.getModel();
					m.addRow(new Object[]{menu[index],count,price[index]});

					ShowMoney();

				}
			});
		}
				
		//선택취소 기능
		SBtn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton MBtn = (JButton)e.getSource();
				DefaultTableModel m = (DefaultTableModel)table.getModel();
				
				m.removeRow(table.getSelectedRow());

				ShowMoney();

			}
		});
		
		
		//전체취소 기능
		SBtn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton MBtn = (JButton)e.getSource();
				DefaultTableModel m = (DefaultTableModel)table.getModel();
				
				m.setRowCount(0);
				tf.setText(String.valueOf(""));

				
			}
		});
		
		//결제버튼 기능
		SBtn[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel m = (DefaultTableModel)table.getModel();
				

				if (table.getRowCount() > 0){
	
					//결제
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							JFrame frame = new JFrame("결제중...");
							frame.setSize(400,350);
							frame.setContentPane(new PayProgress(frame));
							frame.pack();
							frame.setLocation(370,280);
							frame.setVisible(true);
							
							//결제가 완료되면 결제 창이 닫히게 함
							//지금 코드는 일정 시간이 지나면 자동으로 닫히게끔 되어있지만
							//실제로 사용할 때에는 결제 완료가 되면 자동으로 닫히게 구현해야할 것
							Timer timer = new Timer();
							TimerTask timertask = new TimerTask(){
								@Override
								public void run(){
									frame.dispose();
									//받은 주문 초기화			
									m.setRowCount(0);
									tf.setText(String.valueOf(""));
								}
							};
							
							timer.schedule(timertask, 10000);


						}					
					});	

					
		
				}else{//주문할 음료를 선택하지 않은 경우 결제버튼을 눌러도 동작하지 않음
				}
			}
		});
	}


	//총 금액 창
	public void ShowMoney(){

		int rowCount = table.getRowCount();
		int sum =0;
		for(int i=0;i<rowCount;i++) {
			sum += (int)table.getValueAt(i, 2);
		}
		tf.setText(String.valueOf(" 총 금액 : "+sum+"원"));
		tf.setFont(new Font("맑은고딕", Font.BOLD, 20));
		tf.setHorizontalAlignment(JTextField.CENTER);
	}
}


