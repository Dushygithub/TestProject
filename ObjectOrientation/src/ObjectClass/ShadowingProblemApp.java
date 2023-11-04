package ObjectClass;

public class ShadowingProblemApp {

	public static void main(String[] args) {
		ShadowingProblem c1=new ShadowingProblem("dush",22,22,83.3f);
		c1.Study();
		new ShadowingProblem("prerana",19,19,83.5f).Study();
		

	}

}
