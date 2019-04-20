import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc= new Scanner(System.in);
      int num = sc.nextInt();
      int x= num;
      int y = num;
      int count = 0;
      int k = 0;
      int j = 0;
     while(x!=0)
     {
       count = count+1;
       x=x/10;
     }
      while(y!=0)
      {
         x= y%10;
        y = y/10;
        if(count == 3)
         j = x*x*x;
         k = k+j;
      }
       if(k==num)
      System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
     
      
	}
}