package BasicInheritanceA2parameterized;

public class Sub1 extends Base1 {
	Sub1(String sub1) {
		super("Base1");//Invoking parent class constructor 
		System.out.println(sub1);
	}

	Sub1(int a, int b) {
		super("Base1");//Invoking parent class constructor 
		System.out.println("sum-" + a + b);
	}
}
