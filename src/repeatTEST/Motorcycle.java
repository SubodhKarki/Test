package repeatTEST;

public class Motorcycle extends Bicycle {
	
	private static Motorcycle m;

	String define_me(){
		
		return "a cycle with an engine.";
		
	}
	
	Motorcycle () {
		System.out.println("Hello I am a Motorcycle, I am "+ define_me());
		
		String temp=super.define_me();
		
		System.out.println("My ancestor is a cycle who is "+temp);
	}
	
	public static void main (String[]args) {
		m = new Motorcycle();
	}

}
