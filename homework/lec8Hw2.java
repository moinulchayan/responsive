//Write a program that takes the range from user, preventing negative numbers and print all the even numbers of that range.
import java.util.Scanner;
public class lec8Hw2 {

  public static void main (String[]args){
      Scanner sc = new Scanner(System.in);
    
    System.out.println("Give your Number");
    int x = sc.nextInt();
    int y = sc.nextInt();
    if(x>0 && y>0)
    {while(x<=y){if(x%2==0){System.out.println(x);
      x=x+1;}else {x=x+1;}}
        
    } 
  

}
}
