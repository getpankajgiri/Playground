import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    for(int i =0;i<n;i++)
    {
      list[i]=sc.nextInt();
    }
    arr(n,list);
  }
  public static void arr(int n, int list[])
  {
    int a=0,b=0,c=0;
   if(n==6)
   {
     a=list[0]+list[1]+list[2];
     b=list[3]+list[4]+list[5];
     if(a==b)
       System.out.println("Perfect Batch");
     else
       System.out.println("Not a Perfect Batch");
   }
    else if(n==9)
    {
    a=list[0]+list[1]+list[2];
     b=list[3]+list[4]+list[5];
      c=list[6]+list[7]+list[8];
     if(a==b&&b==c)
       System.out.println("Perfect Batch");
     else
       System.out.println("Not a Perfect Batch");
    }
  }
}