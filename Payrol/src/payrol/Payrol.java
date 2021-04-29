
package payrol;
import java.util.Scanner;
import java.text.NumberFormat;


public class Payrol {
    private double Basic_Salary;
    private double Tax_Relief;
    
    
    public Payrol(){
        Basic_Salary=0.0;
        Tax_Relief=0.0;
    }
    
     public Payrol(double basic, double tax){
       Basic_Salary=basic;
       Tax_Relief=tax;
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
        double Tax=0.0;
        if (getTaxableIncome()>=0 && getTaxableIncome()<=100){
            Tax=0.0*getTaxableIncome();
        }
        else if (getTaxableIncome()>100 && getTaxableIncome()<=500){
             Tax=0.098 * getTaxableIncome();
        }
        else{
            Tax = 0.175*getTaxableIncome();
        }
        
        return Tax;
    }
    
    
    public double getTotalDeduction(){
        return getSSNIT()+Tax_Relief;
    }
    
    public double getNetIncome(){
        return Basic_Salary-getTotalDeduction();
    }
    
    
    
    public static void main (String []args){
        double salary=0.0, tax=0.0;
         NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
         Scanner amount = new Scanner(System.in);
        
      
    
        
        System.out.println ("Enter Basic Salary");
        salary = amount.nextDouble();
        
        System.out.println ("Enter Tax Relief");
        tax = amount.nextDouble();
       
       
        Payrol kkPayrol = new Payrol(salary,tax);
        

        System.out.println("Basic Salary = "+ fmt1.format(salary)+
                "\n"+"Tax Relief = "+ fmt1.format(tax)+
                "\n"+"SSNIT Contribution = "+ fmt1.format(kkPayrol.getSSNIT())+
                "\n"+"Taxable Income = "+ fmt1.format(kkPayrol.getTaxableIncome())+
                "\n"+"Income Tax = "+ fmt1.format(kkPayrol.getIncomeTax())+
                "\n"+"Total Deduction = "+ fmt1.format(kkPayrol.getTotalDeduction())+
                "\n"+"Net Income = "+ fmt1.format(kkPayrol.getNetIncome()));
        

    }
}
