import java.util.Scanner;
class P1{
public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("");
    int totalrows=sc.nextInt();
    for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n;j++)
          {
            if(i==1 || i==totalrows || j==1 || j==totalcols)
            {
              System.out.print("*");
            }
            else
            {
               System.out.print("  ");
            }
          }
        System.out.println("\n");       
      }
  }
  
}
