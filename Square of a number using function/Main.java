import java.util.Scanner;
class Main
{
  public static int square(int num)
  {
    num=num*num;
    return num;
  }
	public static void main (String[] args)
    {
	  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sod = square(n);
      System.out.println(sod);
	} 
}