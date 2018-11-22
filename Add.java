import java.util.Scanner;
class Add
{
 public static void main(String[] args)
{
int a, b, sum;
System.out.println("Enter two number:");
Scanner add= new Scanner(System.in);
a= add.nextInt();
b= add.nextInt();
sum= a-~b-1;
System.out.println("Addition of "+a+" and "+b+" is:"+sum);

  }
 }