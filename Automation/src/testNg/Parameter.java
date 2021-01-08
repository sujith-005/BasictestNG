package testNg;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Parameter {

@Test
@Parameters("name")
void parameter(String name){
	
	System.out.println("the name is:"+name);
}	
	
}
