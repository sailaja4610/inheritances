package multiple;

public class Parent {
	int moneyp=100000;
	void parentmoney()
	{
		System.out.println("parent="+moneyp);
	}

}
class child extends Parent{
int moneyc=10000;
void childmoney()
{
	System.out.println("child="+moneyc);
}
	
}
class child1 extends child{
	int moneyc1=1000;
	void moneychild1()
	{
		System.out.println("child1="+moneyc1);
	}
}
class child2 extends child1{
	int moneyc2=100;
	void moneychild2()
	{
		System.out.println("child2="+moneyc2);
	}
	public static void main(String[] args) {
		System.out.println("..........parent..............");
		Parent p=new Parent();
		p.parentmoney();
		System.out.println(".......child........");
		child c=new child();
		c.childmoney();
		c.parentmoney();
		
		System.out.println(".......child1.......");
		child1 c1=new child1();
		c1.moneychild1();
		c1.childmoney();
		c1.parentmoney();
		System.out.println(".....................child2.............");
		child2 c2=new child2();
		c2.moneychild2();
		c2.moneychild1();
		c2.childmoney();
		c2.parentmoney();
				
	}
}
