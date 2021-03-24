package Screen;

import javax.swing.JPanel;

/**
*
* 家計簿アプリのメインフレーム
*/
public class ScreenMainApp  extends JPanel {

	public static void main(String args[]) {

		// ホーム画面
		HomeFrame homeFrame = new HomeFrame("ホーム");

		// 残高一覧画面
		BalListFrame balListFrame = new BalListFrame("残高一覧");

		// 記録画面
		ReportFrame reportFrame = new ReportFrame("記録");

	}

}
