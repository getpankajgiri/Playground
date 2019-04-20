import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      int a =0;
      int arr_size = sc.nextInt();
      int arr[] = new int[arr_size];
      for(int i = 0;i<arr_size;i++)
      {
         arr[i]=sc.nextInt();
      }
      for(int j=0;j<arr_size;j++)
      {
         if(arr[j]>a)
           a=arr[j];
      }
      System.out.println(a);
    }
}