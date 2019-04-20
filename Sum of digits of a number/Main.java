import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int x= 0;
      while(num!=0)
      {
        x=x+(num%10);
        num=num/10;
      }
      System.out.println(x);
	}
}