package BasicInheritanceA2Sports;

public class Demo {
	static void perform(Game game) {
		game.play();//INVOKING PLAY METHOD 
	}
	public static void main(String[] args) {
		Cricket cricket=new Cricket();//INSTANTIATING Cricket CLASS
		perform(cricket);
		Tennis tennis=new Tennis();//INSTANTIATING Tennis CLASS
		perform(tennis);
		FootBall football=new FootBall();//INSTANTIATING Football CLASS
		perform(football);
	}
}

