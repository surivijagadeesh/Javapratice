package dependencySetterInjection;

//Constructor Injection
public class MainClass {
 public static void main(String[] args) {
	 
	System.out.println("Programmer1 uses Laptop");
	Laptop l=new Laptop("Dell");
	Programmer p1 = new Programmer();
	p1.setD1(l);
	p1.coding();
	
	System.out.println("============================");
	System.out.println("Programmer2 uses Desktop");
	Desktop d=new Desktop("Hp");
	Programmer p2 = new Programmer();
	p2.setD1(d);
	p2.coding();
}
}
