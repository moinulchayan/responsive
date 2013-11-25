//Write a program that will take 5 numbers from user and print the smaller number.
import java.util.Scanner;
public class lec8Hw3 {

  public static void main (String[]args){
      Scanner sc = new Scanner(System.in);
    
    System.out.println("Give your Number");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    if(a>b){
      if(a>c){
        if(a>d){
        if(a>e)
        {
        System.out.println(a+"is the bigger");
        }
        else{
        System.out.println(e+"is the bigger");
        
        }}
        else{
          if(d>e){
          System.out.println(d+"is the bigger");
          
          }
          else{
          System.out.println(e+"is the bigger");
          }
        
        }
      
        
        
      }else{
        if(c > d)
        {
          if(c > e)
          {
          System.out.println(c+"is the bigger");
          }
          else{
          System.out.println(e+"is the bigger");
          }}
          else{
          if(d>e)
          {System.out.println(d+"is the bigger");}
          else{
          System.out.println(e+"is the bigger");}}
        }
    }
      
      
    
  
    else{
      if(b>c){
        if(b>d){
          if(b>e){
          System.out.println(b+"is the bigger");
          }}
        else{if(d>e){
        System.out.println(d+"is the bigger");}
        else{
        System.out.println(e+"is the bigger");
        
        }}} else{
      if(c > d){
        if(c > e)
        {
        System.out.println(c+"is the bigger");}
        else{
        System.out.println(e+"is the bigger");}
        }
      else{if(d>e){
      System.out.println(d+"is the bigger");}
      else{
      System.out.println(e+"is the bigger");}}
  }
    }
   
    }
}