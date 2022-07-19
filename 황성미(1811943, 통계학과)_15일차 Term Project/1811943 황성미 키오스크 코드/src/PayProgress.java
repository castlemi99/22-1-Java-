import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PayProgress extends JPanel{

	public PayProgress(final Frame owner) {
		
		//화면구성

		//현금결제, 카드 결제 버튼
		ImageIcon cashimg = new ImageIcon();
		ImageIcon cardimg = new ImageIcon();

		cashimg = new ImageIcon("../MenuImg/imgcash.png");
		cardimg = new ImageIcon("../MenuImg/imgcard.png");

		JButton cashbtn = new JButton("현금", cashimg);
		cashbtn.setVerticalTextPosition(JButton.BOTTOM);  // 텍스트 아래로
		cashbtn.setHorizontalTextPosition(JButton.CENTER); // 텍스트 가운데
		
		JButton cardbtn = new JButton("카드", cardimg);
		cardbtn.setVerticalTextPosition(JButton.BOTTOM);  // 텍스트 아래로
		cardbtn.setHorizontalTextPosition(JButton.CENTER); // 텍스트 가운데

		add(cashbtn);
		add(cardbtn);

		//현금 결제 버튼 이벤트
		cashbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JDialog dialog = new JDialog(owner, "현금 결제중..", true);
				BoundedRangeModel model = new DefaultBoundedRangeModel();
				JProgressBar progressBar = new JProgressBar(model);
				dialog.add(progressBar);
				dialog.setResizable(false);
				dialog.pack();
				dialog.setLocationRelativeTo(owner);
				Task task = new Task(model);
				task.go(new Runnable() {
					public void run() {
						dialog.setVisible(false);
						
						
					}
				});
				System.out.println("현금 결제 dialog...");
				dialog.setVisible(true);
				
				System.out.println("현금 결제 setVisible(boolean) call returned");
			}
		});
		
		//카드 결제 버튼 이벤트
		cardbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JDialog dialog = new JDialog(owner, "카드 결제중..", true);
				BoundedRangeModel model = new DefaultBoundedRangeModel();
				JProgressBar progressBar = new JProgressBar(model);
				dialog.add(progressBar);
				dialog.setResizable(false);
				dialog.pack();
				dialog.setLocationRelativeTo(owner);
				Task task = new Task(model);
				task.go(new Runnable() {
					public void run() {
						dialog.setVisible(false);
					}
				});
				System.out.println("카드 결제 dialog...");
				dialog.setVisible(true);
				System.out.println("카드 결제 setVisible(boolean) call returned");
			}
		});

	}

	
	private static class Task {
		
		private final BoundedRangeModel model;
		
		public Task(BoundedRangeModel model) {
			this.model = model;
		}
		
		public void go(final Runnable doneCallback) {
			Thread thread = new Thread(new Runnable() {
				public void run() {
					int progress = 0;
					while (progress < 100) { //결제창 
						System.out.println(progress);
						progress++;
						model.setValue(progress);
						try {
							Thread.sleep(50);
						} catch (InterruptedException e) {
							e.printStackTrace(System.err);
						}
					}
					SwingUtilities.invokeLater(doneCallback);
				}
			});
			thread.start();
		}
		
	}
	
	
	
}