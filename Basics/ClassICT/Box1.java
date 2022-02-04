import java.text.NumberFormat;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

class Box1 {

	 NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
        DecimalFormat df = new DecimalFormat ("0.00");
        
      int a,b;
      
      a = Integer.parseInt(JOptionPane.showInputDialog("Enter Length"));
      
      b = Integer.parseInt(JOptionPane.showInputDialog("Enter Width"));
      
      Box myObject = new Box (a,b);
      
      JOptionPane.showConfirmDialog(null, "Area = "+ df.format(myObject.Area())+ "\n" +
              "Perimeter = "+ df.format(myObject.perimeter())+ "\n" + "Cost = "+ fmt1.format(myObject.cost())
      );


	
	}
}