package Screen;

import javax.swing.JFrame;

/**
 *
 * 記録画面のフレーム
 */
public class ReportFrame extends JFrame {

	ReportFrame(String title) {
		setTitle(title);
		setSize(600, 400);
		setLocation(300, 300); //後で消す
		//setLocationRelativeTo(null); // フレームを中央に表示
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //閉じるボタン押下時にアプリケーション終了
		setVisible(true);
	}
}
