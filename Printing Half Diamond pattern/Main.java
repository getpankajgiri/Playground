import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int x=1;
      int nume = num;
      for(int row=1;row<=num;row++)
      {
         for(int space=(nume-1);space!=0;space--)
         {
           System.out.print(" ");
         }
        for(int col=1;col<=x;col++)
        {
           System.out.print("*");
        }
        x=x+2;
        nume--;
        System.out.print("\n");
      }
	}
}