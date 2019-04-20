import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc = new Scanner (System.in);
        int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
      int sod  =  greatest(n1,n2,n3);
      System.out.println(sod);
	}
  public static int greatest(int num1, int num2, int num3)
  {
    int a=0;
    if(num1>num2)
    {
       if(num1>num3)
        a=num1;
      else
        a=num3;
    }
    else
    {
       if(num2>num3)
         a=num2;
      else
        a=num3;
    }
    return a;
  }
}