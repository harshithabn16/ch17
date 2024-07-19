class Sample
{
int disp(int a,int b)
{
int c=a+b;
return c;
}
public static void main(String[] args)
{
Sample s1=new Sample();
int m=s1.disp(1,3);
System.out.println(m);
}
}