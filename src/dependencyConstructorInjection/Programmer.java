package dependencyConstructorInjection;


public class Programmer {
	private Device d1;
	
	public Programmer(Device d1) {
		this.d1 = d1;
	}
	
	public void coding() {
		d1.show();
		System.out.println("Code will write");
	}

}
