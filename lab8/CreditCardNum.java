/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler {
	private IKeyEventHandler nextHandler ;
	private String number = "" ;
	private SetCharsDecorator scd = new SetCharsDecorator();
	final int spacer = 4;
	
    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( number.equals("") )
			return "[4444 4444 4444 4444]" + "  " ;
		else
			return "[" + number + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt <= 16 ) {
			if ((ch.charAt(0) == 'X') || ch.equals("Delete")) {
				number = scd.delSpace(number, " ");
			} else {
				number += ch ;
				number = scd.addChar(number, ' ', spacer);
			}
		} else if ( nextHandler != null ) {
			nextHandler.key(ch, cnt) ;
		}
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}
}
