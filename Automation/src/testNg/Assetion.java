package testNg;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Assetion {

	String name= "sujith";

	@Test
	void isthatequal(){

		Assert.assertEquals(name, "Sujith");

	}

}
