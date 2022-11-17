import java.util.*;
class StudentDetails1
{
	int sid;
	String sname;
	double marks;
}
public class Student
{
	public static void main(String[]args)
	{
		StudentDetails s1 = new StudentDetails();
		s1.sid = 24;
		s1.sname = "Ragava";
		s1.marks = 95;
		System.out.println(s1.sid+" "+s1.sname+" "+s1.marks);
	}
}