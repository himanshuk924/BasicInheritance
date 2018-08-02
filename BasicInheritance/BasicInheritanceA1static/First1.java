package BasicInheritanceA1static;

public class First1 {
	static int i;
	int j;
	public void nonstaticfunc(int num) {
		j=num;
		System.out.println(j);
	}
	static void staticfunc(int num) {
		i=num;
		System.out.println(i);
	}
}
