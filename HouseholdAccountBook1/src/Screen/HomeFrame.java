package Screen;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * ホーム画面のフレーム
 */
public class HomeFrame extends JFrame {

	public  static final String Cmd_moveBal = "残高";

	HomeFrame(String title) {
		setTitle(title);
		setSize(400, 300);
		setLocation(100, 100); //後で消す
		setLocationRelativeTo(null); // フレームを中央に表示
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //閉じるボタン押下時にアプリケーション終了
		setVisible(true);

		// ボタン
		JPanel panel = new JPanel() {
			@Override
		    public Dimension getPreferredSize() {
		        return new Dimension(300, 300);
		    };
		};

		JButton balBtn = new JButton("残高");
		JButton reportBtn = new JButton("記録");

		// 使ったお金
		JLabel moneySpentLabel = new JLabel("使ったお金");

		// 金額
		JLabel thisMonthLabel = new JLabel("今月");
		JTextField text = new JTextField(20);
		JLabel yenLabel = new JLabel("円");

		// JPanelの大まかな配置
		Container contentPane = getContentPane();
		contentPane.add(panel, BorderLayout.CENTER);

		// 座標とサイズ設定
		panel.setLayout(null); // レイアウトマネージャを無効にする
		balBtn.setBounds(95, 70, 100, 35);
		reportBtn.setBounds(195, 70, 100, 35);

		balBtn.setActionCommand(Cmd_moveBal);

		panel.add(balBtn);
		panel.add(reportBtn);
		panel.add(moneySpentLabel);
		panel.add(thisMonthLabel);
		panel.add(text);
		panel.add(yenLabel);

		// ボタンアクション
//		public void HomeAction(ActionEvent e) {
//
//	        String cmd = e.getActionCommand();

//	        if(cmd.equals(Cmd_GameStart)){
//
//	        }
//		}

	}

}
