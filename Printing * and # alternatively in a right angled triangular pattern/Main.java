import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int num = in.nextInt();
      int f =0;
      for(int row = 1;row<=num;row++)
      {
         for(int col=1;col<=row;col++)
         {
            f=f+1;
           if(f%2==0)
             System.out.print("#");
           else
             System.out.print("*");
         }
        System.out.print("\n");
      }
    }
}