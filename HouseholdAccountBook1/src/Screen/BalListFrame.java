package Screen;

import javax.swing.JFrame;

/**
 *
 * 残高一覧画面のフレーム
 */
public class BalListFrame extends JFrame {

	BalListFrame(String title){
		// フレームの基本設定
	    setTitle(title);
		setSize(600, 400);
		setLocation(200, 200); //後で消す
		//setLocationRelativeTo(null); // フレームを中央に表示
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //閉じるボタン押下時にアプリケーション終了
		setVisible(true);
		

	  }
}
