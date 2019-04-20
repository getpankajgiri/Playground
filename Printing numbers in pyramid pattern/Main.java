import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int x=num;
      int set = 0;
      for(int row=1;row<=num;row++)
      {
        for(int space=1;space<=(x-1);space++)
        {
           System.out.print(" ");
        }
        x=x-1;
        for(int col=1;col<=row;col++)
        {
         set=set+1;
           System.out.print(set+" ");
        }
        System.out.print("\n");
      }
    }    
}