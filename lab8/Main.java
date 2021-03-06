/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */


/*
    Sample Program Demonstrating the use of Patterns for an Input Mask
    Uses java.io.Console for Screen output and input.

    ref: https://docs.oracle.com/javase/7/docs/api/java/io/Console.html

*/
package lab8;

import java.io.Console ;
import java.util.Scanner;
import java.util.regex.Pattern;

class Main
{
    public static void main(String args[]) {
    	String pattern = "\\d|X|Delete";
    	boolean patternMatch;
        App app = new App() ;
        //Console c = System.console() ;
        Scanner sca = new Scanner(System.in);
        for (;;) {
            System.out.print("\033[H\033[2J") ; // clear the screen
            System.out.flush() ;
            System.out.println( app.display() ) ;
            System.out.print( "Key (Digit or X or Delete) => " ) ;
            //String ch = c.readLine() ;
            String ch = sca.nextLine();
            ch = ch.toUpperCase();
            ch = ch.replaceAll("\\s","") ;
            
            patternMatch = Pattern.matches(pattern, ch);
            if (!patternMatch) {
            	continue;
            }
            
            app.key(ch) ;
        }
    }
}