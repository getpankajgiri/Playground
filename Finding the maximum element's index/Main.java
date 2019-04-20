import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int n =sc.nextInt();
    int a=0,b=0;
    int list[] =new int[n];
    for(int i=0;i<n;i++)
    {
     list[i]=sc.nextInt();
    }
    for(int j=0;j<n;j++)
    {
      if(list[j]>a)
      {
        a=list[j];
        b=j;
      }
    }
    System.out.println(b);
  }
}