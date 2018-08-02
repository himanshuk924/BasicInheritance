package BasicInheritanceA1ModifyShape;

public class ModifyShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shape []s1=new Shape[3];
		 
			 s1[0] =new Circle(); 
			 s1[1] =new Polygon();
			 s1[2] =new Rectangle();
		for(int i=0;i<3;i++) {
			s1[i].draw();
		}
	}

}
