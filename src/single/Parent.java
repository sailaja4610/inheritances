package single;

public class Parent {
	int moneyp=10000;
	 void moneyparent()
	{
	System.out.println("parent="+moneyp);	
	}

}
class child extends Parent {
	int moneyc=1000;
	void moneychld()
	{
		System.out.println("child="+moneyc);
	}
	public static void main(String[] args) {
		
		Parent p=new Parent();
		p.moneyparent();
	
	child c=new child();
	c.moneychld();
	c.moneyparent();
	
	
	
}
}

