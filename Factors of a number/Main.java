import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      for(int k = 1; k<=num;k++)
      {
         if(num%k==0)
           System.out.println(k);
      }
	}
}