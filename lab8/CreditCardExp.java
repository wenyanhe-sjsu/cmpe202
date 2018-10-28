/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */
package lab8;

import java.util.ArrayList;
import java.util.Calendar;

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{
	private IKeyEventHandler nextHandler ;
	private String date = "" ;
	private SetCharsDecorator scd = new SetCharsDecorator();
	
	private ArrayList<IObserver> observer = new ArrayList<IObserver>() ;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( date.equals("") )
			return "[MM/YY]" + "  " ;
		else
			return "[" + date + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt >= 17 && cnt <= 20  ) {
			if ((ch.charAt(0) == 'X') || ch.equals("Delete")) {
				date = scd.delChar(date, "/");
				cnt--;
			} else {
				date += ch ;
				date = scd.addChar4Exp(date, '/');
			}
		} else if ( nextHandler != null ) {
			nextHandler.key(ch, cnt) ;
		}
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}
	
	public boolean chkDate(String format) {
		Calendar calendar = Calendar.getInstance(); 
		int curYear = calendar.get(Calendar.YEAR);
		curYear %= 100;
		
		String[] values = format.split("/") ;
        String month = values[0] ;
        String year = values[1] ;
        System.out.println("intput year: " + year);
        System.out.println("cur year: " + curYear);
        System.out.println("month: " + month);
        if (Integer.parseInt(year) <= curYear ) {
        	
        	return false;
        }
        
		if (Integer.parseInt(month) < 1 || Integer.parseInt(month) > 12) {
			return false;
		}
		
		return true;
	}
	
	public void addObserver(IObserver iob) {
		observer.add(iob);
	}
}