
package repeatadditionquiz1;


import javax.swing.JOptionPane;



public class RepeatAdditionQuiz1 {

    public static void main(String[] args) {
      
         
        int number1 = (int)(Math.random()*30);
        int number2 = (int)(Math.random()*20);
        int answer;
        
        answer = Integer.parseInt(JOptionPane.showInputDialog("What is "+ number1 +" + "+ number2 + " ?" ));
    
     while (number1+number2 != answer){
             answer = Integer.parseInt(JOptionPane.showInputDialog(null, "Wrong answer. Try Again. What is "+ number1 +" + "+ number2 + " ?" ));
            
      }
     
        JOptionPane.showMessageDialog(null, "Answer is correct" );
    }
    
}
