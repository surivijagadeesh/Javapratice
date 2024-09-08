package tightCoupling;

//if we create parameterized constructor in laptop then we will get error.
//this is called tight coupling.

public class Programmer {
	private Laptop L;
	public void coding() {
		L=new Laptop();  //Creating laptop object
		L.show();
		System.out.println("Code will write");
	}

}
