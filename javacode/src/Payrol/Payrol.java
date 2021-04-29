
package Payrol;


import java.text.NumberFormat;
import javax.swing.JOptionPane;


public class Payrol {
        private double Basic_Salary=0.0;
        private double Tax_Relief=0.0;
    
    
    public Payrol(){
        
    }
    
     public Payrol(double b, double t){
       Basic_Salary=b;
       Tax_Relief=t;
    }
    
    public double getSSNIT()
    {
        return 0.05*Basic_Salary;
    }
    
    
     
    public double getTaxableIncome()
    {
        double TaxableInc=Basic_Salary - (getSSNIT()+Tax_Relief);
        return TaxableInc;
    }
    
    
    public double getIncomeTax()
    {
        double IncomeTax=0.0;
        if (getTaxableIncome()>=0 && getTaxableIncome()<=100){
            IncomeTax=0.0*getTaxableIncome();
        }
        else if (getTaxableIncome()>100 && getTaxableIncome()<=500){
             IncomeTax=0.098 * getTaxableIncome();
        }
        else{
            IncomeTax = 0.175*getTaxableIncome();
        }
        
        return IncomeTax;
    }
    
    
    public double getTotalDeduction(){
        return getSSNIT()+Tax_Relief;
    }
    
    
    
    public double getNetIncome(){
        return Basic_Salary-getTotalDeduction();
    }
    
    

    public static void main(String[]args){

            double basicSal=0.0, taxRelief=0.0;
            NumberFormat money = NumberFormat.getCurrencyInstance();

try{
        basicSal = Double.parseDouble(JOptionPane.showInputDialog("What is your Basic Salary?"));

        taxRelief = Double.parseDouble(JOptionPane.showInputDialog("What is your Tax Relief?"));

        Payrol kkPayrol = new Payrol(basicSal,taxRelief);

        JOptionPane.showMessageDialog(null,"Basic Salary = "+ money.format(basicSal)+
                "\n"+"Tax Relief = "+ money.format(taxRelief)+
                "\n"+"SSNIT Contribution = "+ money.format(kkPayrol.getSSNIT())+
                "\n"+"Taxable Income = "+ money.format(kkPayrol.getTaxableIncome())+
                "\n"+"Income Tax = "+ money.format(kkPayrol.getIncomeTax())+
                "\n"+"Total Deduction = "+ money.format(kkPayrol.getTotalDeduction())+
                "\n"+"Net Income = "+ money.format(kkPayrol.getNetIncome()));
        
    }
catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}

    }
}
    
