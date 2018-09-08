/**
 * GumballMachineOneQuarter is a type of gumball machine that only accepts one
 * quarter and ejects one gumball.  Price for each gumball is 25 cents.
 */
public class GumballMachineOneQuarter implements GumballMachine
{

    private int num_gumballs;
    private boolean has_quarter;

    public GumballMachineOneQuarter( int size )
    {
        // initialize instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
    }

    public void insertCoin(int coin)
    {
        if ( coin == 25 )
            this.has_quarter = true ;
        else 
            this.has_quarter = false ;
    }
    
    public void turnCrank()
    {
        if ( this.has_quarter )
        {
    	    if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                System.out.println( "Thanks for your quarter.  "
                                    + "Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry,  "
                                    + "can't return your quarter." ) ;
            }
        }
    	else 
        {
            System.out.println( "Please insert a quarter" ) ;
        }
    }
}
