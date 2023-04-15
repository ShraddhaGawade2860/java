import java.util.Scanner;
import java.util.*;
public class Multiply
 {
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
int num = sc.nextInt();
System.out.println("Enter the number:");
for(int i = 1; i <= 10; ++i)
{
System.out.println("%d * %d = %d \n", num, i, num * i);
}
}
}
