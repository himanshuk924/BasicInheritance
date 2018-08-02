package BasicInheritanceA2DynamicPolymorphism;

public class Test {

	public static void main(String[] args) {
		
		// Instantiate Bottom1 with reference b1 and reference type Top1(upcasting)
		Top1 b1 = new Bottom1();
		b1.disp1();// override disp1 of Top1
		
		// Instantiate Bottom2 with reference b1 and reference type Top1(upcasting)
		b1 = new Bottom2();
		b1.disp1();// override disp1 of Top1
		
		// Instantiate Bottom3 with reference b1 and reference type Top1(upcasting)
		b1 = new Bottom3();
		b1.disp1();// override disp1 of Top1
	}

}
