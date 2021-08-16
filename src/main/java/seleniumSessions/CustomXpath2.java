package seleniumSessions;

public class CustomXpath2 {

	public static void main(String[] args) {
		// //ul[@class='footer-nav']/li
		//single slash == / -->direct child elements
		//double slash == //==> direct+indirect child
		//body/div---5 found
		//body//div---33 both direct & indirect childs
		//input[@id='username']/../../../../..---backward diversing its feature only in xpath
		//in css backward diversing is not there 
		//div[@id='value']//child::input[@id='username']
		//input[@id='username']//parent::div
		//input[@id='username']//ancestor::div

		//**********CSS********
		//      input[id='username']
		//      input[id='input-email'][type='text']
		//div.className > input
		//div.className input
		//ul.class > li > a
		//ul.class li a
		//  input[id*='username'] -- contains
		//    input[id^='user'] --- starts with
		//	    input[id$='user'] --- ends with
		//******comma in CSS*****
		//   input#username,input#password,button#loginBtn,.className -- with tags
		//   #username,#password,#loginBtn,.className -- with tags
		//div.classNmae + div -- for following siblings
		
		
		
	}

}
