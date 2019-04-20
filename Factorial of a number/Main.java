import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int y = 1;
      for(int x = num;x!=0;x--)
      {
         y = y*x;
      }
      System.out.println(y);
	}
}