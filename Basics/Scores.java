class Scores {
public static void main (String[]args){

int mark, sum=0, avg, min=100, max=0;

java.util.Scanner kk = new java.util.Scanner(System.in);
for(int i=1; i<=25; i++){
System.out.println("Enter score - "+ i +":");
mark = kk.nextInt();
sum+=mark;
if(mark<min){
min=mark;

}

if(mark>max)

{
max=mark;
}
}

System.out.println("\nTotal mark - "+ sum +"\n"+
		"Avg Mark - "+ (int)sum/25 + "\n" +
		"Min Mark - "+ min + "\n" + "Max Mark = " + max);

}










}