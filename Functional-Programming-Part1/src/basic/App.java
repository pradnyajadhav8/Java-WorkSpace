package basic;

public class App {
	
	public static void main(String[] args) {
		
		Addable add=new Addable() {
			
			@Override
			public void doAdd(int a, int b) {
				System.out.println(a+b);
			}
		};
		
		add.doAdd(22, 11);
		
		System.out.println("-------------------------");
		
	}	
}
