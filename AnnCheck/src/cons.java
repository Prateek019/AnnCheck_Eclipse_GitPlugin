
public class cons {
	public cons(){
		System.out.println("1");
		new cons(10);
		System.out.println("5");
	}
	public cons(int d){
		System.out.println("2");
		new cons(10,10);
		System.out.println("4");
	}
	public cons(int d,int a){
		System.out.println("3");
		
	}
}
