class VariableType
{
int a=20;//instance variable

static int b=30;//static variable

public int m1()

{
	
int c = 35;//local variable

System.out.println("c="+c);

return 0;

}

public static void main (String[]args)

{
	
VariableType variable = new VariableType();

System.out.println("a="+variable.a+"b ="+b);

variable.m1();//invoke the m1 method

}

}