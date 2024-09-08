package dependencySetterInjection;


public class Programmer {
	private Device d1;

	public void setD1(Device d1) {
		this.d1 = d1;
	}


	public void coding() {
		d1.show();
		System.out.println("Code will write");
	}

}
