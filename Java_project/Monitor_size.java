import java.awt.*;

public class Monitor_size {
	public static void main(String args[]) {
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension dim=tk.getScreenSize();
		System.out.println("Width: "+dim.width+" Height: "+dim.height);
	}
}