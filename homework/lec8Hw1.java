//Write a program to read a number N and print all its odd divisors sum.
import java.util.Scanner;
public class lec8Hw1 {

  public static void main (String[]args){
      Scanner sc = new Scanner(System.in);
    
    System.out.println("Give your Number");
    int n = sc.nextInt();
    
    int x = 1;
    int sum = 0;
    while(x<n){
      if(n % x == 0 && x%2 != 0){
     sum = sum + x;
     x = x + 1;
      }else{
       x = x + 1;
      }
  
  }
System.out.println("Result is " + sum);
}
}