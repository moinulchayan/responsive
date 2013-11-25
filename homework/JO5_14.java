/* Using while statement to find "The Greatest common divisor" */
import java.io.*;
class JO5_14
{
  public static void main(String arg[]) throws IOException
  {
  int N1=0,N2=0,GCD=0;
  String S1,S2;
  InputStreamReader IN = new InputStreamReader(System.in);
  BufferedReader BR = new BufferedReader(IN);
  System.out.println("Enter two nonnegative integers : ");
  S1 = BR.readLine();
  S2 = BR.readLine();
  N1 = Integer.parseInt(S1);
  N2 = Integer.parseInt(S2);
  while(N2 != 0)
  {
  GCD = N1 % N2;
  N1 = N2;
  N2 = GCD;
  }
  System.out.print("The Greatest common divisor is : " + N1);
  }
}