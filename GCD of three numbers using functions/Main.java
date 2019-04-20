import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	   Scanner sc = new Scanner(System.in);
      int n1=sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
      int sod = gcd(n1,n2);
      int sod1 = gcd(sod,n3);
      System.out.println(sod1);
	}
  public static int gcd(int num1,int num2)
  {
     int i,j,x,y,a=0,b=0;
    
    if(num1<num2)
      x=num1;
    else
      x=num2;
    for(i=1;i<=x;i++)
    {
      if((num1%i==0)&&(num2%i==0))
        a=i;
    }
    
    return a;
  }
}