package testNg;

import org.testng.annotations.Test;

public class Groping {
	@Test(groups={"apple"})
	void apple(){
		System.out.println("apple");
	}
	@Test(groups={"moto"})
	void moto(){
		System.out.println("moto");

	}
	@Test(groups={"vivo"})
	void vivo(){

		System.out.println("vivo");
	}
	@Test(groups={"redmi"})
	void redmi(){
		System.out.println("redmi");

	}
	@Test(groups={"oneplus"})
	void oneplus(){
		System.out.println("oneplus");

	}


}
