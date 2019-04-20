import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc= new Scanner(System.in);
      int num = sc.nextInt();
      int x=0;
      for(int row = num;row!=0;row--)
      {
        
        x=row;
         for(int col = 1;col<=row;col++)
         { 
           
           System.out.print(x);
           x=x-1;
           
         }
        System.out.print("\n");
      }
	}
}