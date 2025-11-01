import java.util.Scanner;


public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print(" Entrez a:");
    double a = sc.nextDouble();
    
    System.out.print(" Entrez b:");
    double b = sc.nextDouble();
    

    calculatrice(a,b,'+');
  }
  
  
  private static void calculatrice(double a,double b, char c){
      switch(c){
          case '+': 
              if( (a+b)%1 == 0 ){
                  System.out.println("Result:" + (int) (a+b));
              } else{
                  System.out.println("Result:" + (a+b));
              }
              break;
              
          case '-':
              if( (a-b)%1 == 0 ){
                  System.out.println("Result:" + (int) (a-b));
              } else{
                  System.out.println("Result:" + (a-b));
              }
              break;
              
          case '*':
              if( (a*b)%1 == 0 ){
                  System.out.println("Result:" + (int) (a*b));
              } else{
                  System.out.println("Result:" + (a*b));
              }
              
          case '/':
              if(b==0.00){
                  System.out.println("b can t be 0!");
                  break;
              } else{
                  if( (a/b)%1 == 0 ){
                  System.out.println("Result:" + (int) (a/b));
              } else{
                  System.out.println("Result:" + (a/b));
              }
                  break;
              }
          case '%':
              if(b==0.00){
                  System.out.println("b can t be 0!");
                  break;
              } else{
                  if( (a%b)%1 == 0 ){
                  System.out.println("Result:" + (int) (a%b));
              } else{
                  System.out.println("Result:" + (a%b));
              }
                  break;
              }
          default: System.out.println("invalid operator");
      }
  }

}
