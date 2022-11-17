import java.util.Scanner;
class StudentDetails
{ 
public static void main(String[]args)
{
int id;
String name;
double att;
System.out.println("Enter Student Details");
Scanner SC=new Scanner(System.in);
id=SC.nextInt();
name=SC.next();
att=SC.nextDouble();
System.out.println(id+" "+name+" "+att);
}
}
