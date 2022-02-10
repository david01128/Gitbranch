package GitBranchApp;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//這是組長第一次分享
		System.out.println("1st version");
		//這是家數學類別的版本
		Math cMath = new Math();
		System.out.println();
		System.out.println(cMath.add(4, 10));

	}

}

class Math{
	int add(int a, int b) {
		return a+b;
	}
	
}
