import java.awt.*;
import javax.swing.*;

public class Window_test extends JFrame {
	Toolkit tk=Toolkit.getDefaultToolkit();
	Dimension dim=tk.getScreenSize();


	public Window_test() {
		super("window...");
		setSize(dim.width,dim.height);
		setVisible(true);
	}

	public static void main(String args[]) {
		Window_test wt=new Window_test();
		wt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}