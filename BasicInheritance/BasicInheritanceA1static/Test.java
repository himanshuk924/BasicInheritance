package BasicInheritanceA1static;
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First1 f1=new First1();
		System.out.println("Print number using non static function");
		f1.nonstaticfunc(10);
		System.out.println("Print number using static function");
		First1.staticfunc(20);
	}

}
