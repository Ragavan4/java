class Operators{
  public static void main(String[] args) {
    
    // declare variables
    int a = 12, b = 5,c;
    int var;
    var = a;
    c=a++;
    char res;
    res=(a>15 && b>4)?'p':'f';
    System.out.println("a is " + a + " and b is " + b);
    System.out.println("a + b = " + (a + b));
    System.out.println("var using =: " + var);
    System.out.println(a == b);
    System.out.println(!(5 == 3));
    System.out.println(a+" "+b+" "+c);
    System.out.println(a|b);
    System.out.println("result is "+res);
}
}
