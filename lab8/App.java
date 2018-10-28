/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */
package lab8;
/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private int count;

    public App() {

        screen = new Screen();
        num = new CreditCardNum();
        exp = new CreditCardExp();
        cvc = new CreditCardCVC();

        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);

        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
    	if ((count >= 0 && count <= 23)) {
    		if (ch.charAt(0) != 'X') {
    			count++;
    		}
    	
    		screen.key(ch, count);
    	}
    	
        if (ch.charAt(0) == 'X') { 
    		count--;
    	}   
        
        System.out.println("Flag:" + count);
    }
    
    public CreditCardExp getCreditCardExp () {
    	return exp;
    }
}

