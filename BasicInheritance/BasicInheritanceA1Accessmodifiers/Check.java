package BasicInheritanceA1Accessmodifiers;

public class Check {
	int h=10;
	private int i=11;
	protected int j=12;
	public int k=13;
	public void disp() {
		System.out.println("Default is accesible within the same class,same package subclass,same package non subclass- "+h);
		System.out.println("Protected is accesile within the same class,same package subclass,same package non subclass and different package subclass- "+j);
		System.out.println("public is accessible everywhere - "+k);
		System.out.println("private only within the class but using getter and setter we can access them- "+i);
	}
}
