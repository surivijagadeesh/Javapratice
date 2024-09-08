package dependencyConstructorInjection;

public class Desktop implements Device {
	
	public Desktop(String name) {
		System.out.println("Desktop name is:"+name);
	}
	public void show() {
		System.out.println("Desktop Will open");
	}
}
