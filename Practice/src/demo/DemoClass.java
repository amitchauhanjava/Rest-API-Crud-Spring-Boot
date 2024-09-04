package demo;

public class DemoClass {
	
	public static void main(String[] args) {
		
		String name = "Ahmedabad";
		String reverse = "";
		
		for (int i = name.length()-1; i >= 0; i--) {
			reverse += name.charAt(i);
		}
		
		System.out.println(reverse);
	}

}
