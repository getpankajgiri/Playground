import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner sc =new Scanner(System.in);
      int num = sc.nextInt();
      int x = 0;
      for(int i = 1;i<=num ; i++)
      {
         x=x+i;
      }
      System.out.println(x);
	}
}