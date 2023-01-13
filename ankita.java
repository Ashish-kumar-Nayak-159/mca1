import java.util.Scanner;
class A
{
int n1,n2;
void input()
{
Scanner obj=new Scanner(System.in);
System.out.println("enter 2 nos");
n1=obj.nextInt();
n2=obj.nextInt();
}
}
class B extends A
{
int res1;
void sum()
{
res1=n1+n2;
System.out.println(res1);
}
}
class C extends B
{
int res2;
void sub()
{
res2=n1-n2;
System.out.println(res2);
}
}
class ankita
{
public static void main(String agrs[])
{
C obj=new C();
{
obj.input();
obj.sum();
obj.sub();
}
}
}
