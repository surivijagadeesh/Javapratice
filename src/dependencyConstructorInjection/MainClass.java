package dependencyConstructorInjection;

//Constructor Injection
public class MainClass {
 public static void main(String[] args) {
	 
	System.out.println("Programmer1 uses Laptop");
	Programmer p1 = new Programmer(new Laptop("Dell"));
	p1.coding();
	
	System.out.println("============================");
	System.out.println("Programmer2 uses Desktop");
	Programmer p2 = new Programmer(new Desktop("Hp"));
	p2.coding();
}
}
