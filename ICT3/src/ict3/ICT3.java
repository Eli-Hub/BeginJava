
package ict3;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ICT3 {

    public static void main(String[] args) {

        NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
        DecimalFormat df = new DecimalFormat ("0.00");
        
      int a, b;
      
      a = Integer.parseInt(JOptionPane.showInputDialog("Enter Length"));
      
      b = Integer.parseInt(JOptionPane.showInputDialog("Enter Width"));
      
      Box myObject = new Box (a,b);
      
      JOptionPane.showMessageDialog(null, "Area = "+ df.format(myObject.Area())+ "\n" +
              "Perimeter = "+ df.format(myObject.perimeter())+ "\n" + "Cost = "+ fmt1.format(myObject.cost())
      );
      
      //        int a = 10; int b = 5;
//        Box newobject = new Box (a,b);
//        System.out.println("Area of Box = " + newobject.Area() + "\n" + "Perimeter = "+ newobject.perimeter()+ "\n" + "Cost = "+newobject.cost());
    }
    
}
