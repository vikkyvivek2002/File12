
package Oops;
// multiple inheritance -> interface
interface A2 // purely abstract class
{
	public void show1(); // abstract method
}
interface B2
{
	public void show2();	
}
class C2 implements A2,B2 // child class
{
	public void show1()
	{
		System.out.println("Interface - A");
	}
	public void show2()
	{
		System.out.println("Interface - B");
	}
}
public class File12 {
	public static void main(String[] args) {
		C2 obj = new C2();
		obj.show1();
		obj.show2();
	}
}