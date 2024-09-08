package dependencyConstructorInjection;

public class Laptop implements Device {
	
	public Laptop(String name) {
		System.out.println("Laptop name is:"+name);
	}

	public void show() {
		System.out.println("Laptop Will open");
	}

}
