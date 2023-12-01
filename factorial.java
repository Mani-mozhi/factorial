import java.util.*;
class Main{
public static void main(String[] args){
System.out.println("PROGRAM TO FIND THE FACTORIAL OF A GIVEN NUMBER
USING RECURSION");
System.out.println("ENTER THE NUMBER TO FIND THE FACTORIAL OF A GIVEN
NUMBER USING RECURSION");
Scanner in = new Scanner(System.in);
int number = in.nextInt();
System.out.println("FACTORIAL OF A GIVEN NUMBER IS: " +
factorial(number));
}
static int factorial(intnumber){
//factorial program
if(number<=1)
{
return 1;
}
else
{
return number*factorial(number-1);
}
}
} 