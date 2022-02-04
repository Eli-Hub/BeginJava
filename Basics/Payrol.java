import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
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
    public double getBasicSalary()
    {
        return Basic_Salary;
    }
    
     public double getTaxRelief()
    {
        return Tax_Relief;
    }
    public double getTaxableIncome()
    {
        double TaxableInc=Basic_Salary - (getSSNIT()+Tax_Relief);
        return TaxableInc;
    }
    
    
    public double getIncomeTax()
    {
        double IncTax=0.0;
        if (getTaxableIncome()>0 && getTaxableIncome()<100){
            IncTax=0.0*getTaxableIncome();
        }
        else if (getTaxableIncome()>100 && getTaxableIncome()<500){
             IncTax=9.8*getTaxableIncome();
        }
        else{
            IncTax = 17.5*getTaxableIncome();
        }
        
        return IncTax;
    }
    
    
    public double getTotalDeduction(){
        return getSSNIT()+Tax_Relief;
    }
    
    public double getNetIncome(){
        return Basic_Salary-getTotalDeduction();
    }
    
    
    
    public static void main (String []args){
        double basicSal=0.0, taxRelief=0.0;
         NumberFormat fmt1 = NumberFormat.getCurrencyInstance();

	basicSal = Double.parseDouble(JOptionPane.showInputDialog("What is your Basic Salary?" ));
	taxRelief = Double.parseDouble(JOptionPane.showInputDialog("What is your Tax Relief?" ));
	Payrol kkPayrol = new Payrol(basicSal,taxRelief);
        
        
        JOptionPane.showMessageDialog(null, "Basic Salary = "+ fmt1.format(basicSal)+
                            	"\n"+"Tax Relief = "+ fmt1.format(taxRelief)+
                		"\n"+"SSNIT Contribution = "+ fmt1.format(kkPayrol.getSSNIT())+
                		"\n"+"Taxable Income = "+ fmt1.format(kkPayrol.getTaxableIncome())+
                		"\n"+"Income Tax = "+ fmt1.format(kkPayrol.getIncomeTax())+
                		"\n"+"Total Deduction = "+ fmt1.format(kkPayrol.getTotalDeduction())+
                		"\n"+"Net Income = "+ fmt1.format(kkPayrol.getNetIncome()));
}
}