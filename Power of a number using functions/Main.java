import java.util.Scanner;
class Main
{
   public static int power(int base, int expo)
   {
     int a=base;
     
     for(int i =1;i<expo;i++)
     {
       base=base*a;
     }
     
     return base;
     
   }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int b= sc.nextInt();
    int e = sc.nextInt();
    int sod = power(b,e);
    System.out.println(sod);
  }
}