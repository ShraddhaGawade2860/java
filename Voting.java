import java.util.Scanner;
import java.io.*;
class Voting
{
public static void main(String[] args)
{
int age,shrt;
Scanner sc = new Scanner(System.in);
age = sc.nextInt();
System.out.println("Enter the age:");
if(age>=18)
{
System.out.println("You are old enough to vote for national election");
}
else 
{
shrt=age-18;
System.out.println("You can old enough to vote after "+shrt+" age fot national election");
}
}
}
