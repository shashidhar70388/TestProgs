package TestPrograms;

class Example {
	Example a=null;
	Example b=null;
	Example c=null;
	public Example getA() {
		return a;
	}
	public void setA(Example a) {
		this.a = a;
	}
	public Example getB() {
		return b;
	}
	public void setB(Example b) {
		this.b = b;
	}
	public Example getC() {
		return c;
	}
	public void setC(Example c) {
		this.c = c;
	}
}
public class ExpressionProgram {

	public static void main(String[] args) {
		Example a=new Example();
		Example b=new Example();
		Example c=new Example();
		b.setA(a);
		b.setC(c);
		c.setB(b);
		a.setB(b);
		a.b.c=c.b.a;
		System.out.println(a.b.c);
		System.out.println(c.b.a);
	}

}
