class Demo2
{
int i=1,j=2;
static void fun1()
{
System.out.println("I am inside fun1() of class Demo2");
}
public static void main(String[] args)
{
Demo2 d2=new Demo2();
System.out.println("Address of object of class Demo2" +d2);
d2.i=d2.i+1;
System.out.println("Variable I of Demo2 "+d2.i);
d2.j=d2.j+1;
System.out.println("Variable J of Demo2 "+d2.j);
  
fun1();
}
}

