import java.text.NumberFormat;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

class Rectangle {
	protected int length;
	protected int width;

	public Rectangle (int l, int w) {
	
	length = l; width = w;

	}

	public int Area() {

	return length*width;

	}

}
