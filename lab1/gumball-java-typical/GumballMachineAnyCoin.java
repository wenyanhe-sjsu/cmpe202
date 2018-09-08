/**
 * GumballMachineAnyCoin is a type of gumball machine that accepts a combination
 * of nickels, dimes and quarters.  Once the total amount exceeds 50 cents, one
 * gumball is ejected.  Price for each gumball is 50 cents.
 * Assumption: It is a customer's responsibility to insert exactly 50 cents
 * for a gumball.  If he inserts more, the machine will simply eat up the
 * surplus without returning the change.
 */
public class GumballMachineAnyCoin implements GumballMachine
{

    private int num_gumballs;
    private int amount;  // total amount of inserted coins

    public GumballMachineAnyCoin( int size )
    {
        // initialize instance variables
        this.num_gumballs = size;
        this.amount = 0;
    }

    public void insertCoin(int coin)
    {
        switch (coin)
        {
            case 5:
                this.amount += 5;
                break;
            case 10:
                this.amount += 10;
                break;
            case 25:
                this.amount += 25;
                break;
            default:
                break;
        }

    }
    
    public void turnCrank()
    {
        if (this.num_gumballs == 0)
        {
            System.out.println( "No More Gumballs!  Sorry, "
                                + "can't return your money." ) ;
            this.amount = 0;

            return;
        }

        if ( this.amount >= 50 )
        {
            this.num_gumballs-- ;
            System.out.println("Thanks for your purchase.  Gumball Ejected!");
            if (this.amount > 50)
            {
                System.out.println("And thank you for the extra money.  "
                                   + "No change.");
            }
            this.amount = 0;
        }
    	else 
        {
            System.out.println( "Please insert another " + (50 - this.amount)
                                + " cents." );
        }
    }
}
