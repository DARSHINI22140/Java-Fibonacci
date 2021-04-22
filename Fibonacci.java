import java.util.*;

class Fibonacci{
  public static void main(String[] args){
  
  int a=0,b=1,c,i;
  
  System.out.println("Enter a number:");

  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  System.out.print(a+ " " +b);
  for (i=2;i<=n-1;i++){

   c=a+b;
   System.out.print(" " +c);
   a=b;
   b=c;

   
  }
    
  }
}