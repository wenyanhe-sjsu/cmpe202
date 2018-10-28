/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */


/*
    Sample Program Demonstrating the use of Patterns for an Input Mask
    Uses java.io.Console for Screen output and input.

    ref: https://docs.oracle.com/javase/7/docs/api/java/io/Console.html

*/

import java.io.Console ;
import java.util.Scanner;
import java.util.regex.Pattern;

class Main
{
    public static void main(String args[]) {
    	String pattern = "\\d|X|Delete";
    	boolean isMatch;
        App app = new App() ;
        app.getCreditCardExp().addObserver(app);
        //Console c = System.console() ;
        Scanner sca = new Scanner(System.in);
        for (;;) {
            System.out.print("\033[H\033[2J") ; // clear the screen
            System.out.flush() ;
            System.out.println( app.display() ) ;
            System.out.print( "Key (Digit or X or Delete) => " ) ;
            //String ch = c.readLine() ;
            String ch = sca.nextLine();
            ch = ch.replaceAll("\\s","") ;
            if ((ch.equals("q")) || (ch.equals("quit"))) {
                /* entering q or quite to exit without case sensitive */
                System.exit(0);
            }
            
            isMatch = Pattern.matches(pattern, ch);
            if (!isMatch) {
            	System.err.println("Input format error!");
            	
            	continue;
            }
            
            app.key(ch) ;
        }
    }
}
