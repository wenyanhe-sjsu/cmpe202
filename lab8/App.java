/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App implements IObserver{

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
    	if (ch.charAt(0) != 'X') { 
    		count++;
    	}
    	
        screen.key(ch, count);
        
        if (ch.charAt(0) == 'X') { 
    		count--;
    	}
        
    }
    
    public CreditCardExp getCreditCardExp () {
    	return exp;
    }

	@Override
	public void update(int x) {
		count = x;
	}


}

