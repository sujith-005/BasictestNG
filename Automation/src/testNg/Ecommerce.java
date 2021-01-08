package testNg;

import org.testng.annotations.Test;
public class Ecommerce {

	
	
@Test(priority=0)	
void openpplicatpion(){
	System.out.println("the application name is flipcart");
}
@Test(priority=1)
void product(){
	System.out.println("select the product");
}

//skip operation
@Test(priority=2,enabled=false)
void warranty(){
	System.out.println("warranty");
}
@Test(priority=3)
void buynow(){
	System.out.println("buy now clicked");
}
@Test(priority=4)
void addresseclection(){
	System.out.println("addres is filled");
}
@Test(priority=5)
void proceedpayment(){
	System.out.println("finally proceedthe payment");
}

}
