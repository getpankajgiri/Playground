import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int l = num;
      int y = 0;
      int j = 1;
      int o=0;
      while(num!=0)
      {
         y=num%10;
        num=num/10;
        for(int k =1;k<=y;k++)
        {
          j=j*k;
        }
        o=o+j;
        j=1;
      }
      if(l==o)
      System.out.println("Yes");
      else
        System.out.println("No");
	}
}