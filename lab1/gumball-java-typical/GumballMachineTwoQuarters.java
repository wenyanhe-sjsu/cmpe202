/**
 * GumballMachineTwoQuarters is a type of gumball machine that only accepts two
 * quarters and ejects one gumball.  Price for each gumball is 50 cents.
 * Assumption: It is a customer's responsibility to insert exactly two quarters
 * for a gumball.  If he inserts more, the machine will simply eat up the
 * surplus without returning the change.
 */
public class GumballMachineTwoQuarters implements GumballMachine
{

    private int num_gumballs;
    private int deposit;  // number of inserted quarters
    private boolean hasTwoQuarters;

    public GumballMachineTwoQuarters( int size )
    {
        // initialize instance variables
        this.num_gumballs = size;
        this.deposit = 0;
        this.hasTwoQuarters = false;
    }

    public void insertCoin(int coin)
    {
        if ( coin == 25 )
        {
            this.deposit++;
        }
        if (this.deposit >= 2)  // Assumption: no change returned to customer
        {
            this.hasTwoQuarters = true ;
        }
        else
        {
            this.hasTwoQuarters = false;
        }
    }
    
    public void turnCrank()
    {
        if (this.num_gumballs == 0)
        {
            System.out.println( "No More Gumballs!  Sorry, "
                                + "can't return your money." ) ;
            this.deposit = 0;
            this.hasTwoQuarters = false;

            return;
        }

        if ( this.hasTwoQuarters )
        {
            this.num_gumballs-- ;
            this.hasTwoQuarters = false ;
            System.out.println("Thanks for your quarters.  Gumball Ejected!");
            if (this.deposit > 2)
            {
                System.out.println("And thank you for the extra money.  "
                                   + "No change.");
            }
            this.deposit = 0;
        }
    	else 
        {
            if (this.deposit == 0)
            {
                System.out.println( "Please insert two quarters." );
            }
            else  // this.deposit == 1 in this case
            {
                System.out.println("Please insert another quarter.");
            }
        }
    }
}
