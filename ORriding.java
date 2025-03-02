class A
{
int a,b;
A(int x,int y){
a=x;
b=y;
}
void show(){
System.out.println("super class values are:"+a+" "+b);
}
}
class B extends A{
int c;
B(int x,int y,int z){
super(x,y);
c=z;
}
void show(){
System.out.println("sub-class values are:"+a+" "+b+" "+c);
}
}
class ORriding
{
public static void main(String args[])
{
B o1=new B(7,14);
o1.show();
}
}

