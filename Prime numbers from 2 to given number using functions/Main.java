import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      prime(n);
     
	}
  public static void prime(int num)
  {
    
    int count = 0;
   for(int i=2;i<=num;i++)
   {
     for(int j=2;j<i;j++)
     {
       if(i%j==0)
       {
         count=count+1;
       }
     // System.out.println(i); 
     }
     if(count==0)
     {
       System.out.println(i);
     }
     count=0;
   }
  }

}