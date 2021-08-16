package seleniumSessions;

public class CustomXpath {

	public static void main(String[] args) {
		// xpath : locator not attribute
		//address of the element
		//type: 
		//Absolute Xpath ://html/body/div/div/div[5]/div/input
		//Relative xpath : //htmltag[@attr1='value']
		//input[@id='username']
		//htmltag[@attr1='value' and @attr2='value']
		//input[@id='username' and @type='email']
		//input[@class='form-control private-form_control login-email']
		//text()-->::://tagname[text()='text value']
		//(//taganame[@attr])[1] && (//taganame[@attr])[position()=1]
		//(//taganame[@attr])[last()] points to last one
		//contains(): is used for the dynamic atributes
		//htmltag[contains(@id,'username')]
		//htmltag[contains(@id,'user')]
		//htmltag[contains(@id,'name')]
		//htmltag[contains(text(),'value']
		//htmltag[starts-with(@id,'value')]
		//(//htmaltag[starts-with(text(),'value')])[position()=1]
		//(//htmaltag[starts-with(text(),'value')])[last()]
		
		//**********CSS Selector************
		
		//-no forward slashes for CSS Selector
		//--------htmltag[attr = 'value']
		//      input[id='username']
		//           input[id='input-email'][type='text']
		// for using ID --- use as   #id //  tagname#id
		//for class ---  .className or  tagname.className
		//for one class -- .classNmae // for multiple class-- .c1.c2.c2---
		// input#input-email.form-control-->>tag#id.class--.tag.class#id
		
		
		
		

	}

}
