class ScoresTwo {
public static void main (String[]args){

int mark[]= new int [13];
mark [11] = 100;
mark [12] = 0;

java.util.Scanner kk = new java.util.Scanner(System.in);

for(int i=0; i<10; i++){

System.out.println("Enter score - "+ (i+1) +":");

mark[i] = kk.nextInt();

mark[10]+=mark[i];

if(mark[i]<mark[11]){
mark[11]=mark[i];
}

if(mark[i]>mark[12])
{
mark[12]=mark[i];
}
}

System.out.println("\nTotal mark - "+ mark[10]+"\n"+
		"Avg Mark - "+ (int)mark[10]/25 + "\n" +
		"Min Mark - "+ mark[11]+ "\n" + "Max Mark = " + mark[12]);

}










}