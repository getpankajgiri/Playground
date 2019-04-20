import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int c=0;
    for(int k =1;k<=m;k++)
    {
      System.out.print(k);
      ++c;
      if(c==3)
      {
         System.out.print(",");
        c=0;
      }
    }
  }
}