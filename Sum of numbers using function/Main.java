import java.util.Scanner;
class Main{
  public static int sum(int num)
  {
    int a=0;
    for(int i = 0;i<=num;i++)
    {
    a=a+i;
    }
    return a;
  }
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      int sod = sum(n);
      System.out.println(sod);
	}
}