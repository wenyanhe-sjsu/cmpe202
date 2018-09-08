/**
 * Test cases for all three types of gumball machines.
 * No coin inserted for all three types
 * Insufficent coins inserted for two-quarter type and any-coin type
 * Exact amount worth of coins inserted for one-quarter and two-quarter
 * Excessive coins inserted for all three types
 * Gumballs depleted for two-quarter type
 */
public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachineOneQuarter(5);

        System.out.println(gumballMachine + " started");

        // no quarters inserted yet
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        // extra quarter inserted
        gumballMachine.insertCoin( 25 );
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank();
        System.out.println(gumballMachine + " finished\n");

        GumballMachine gumballMachine2 = new GumballMachineTwoQuarters(2);
        System.out.println(gumballMachine2 + " started");

        gumballMachine2.turnCrank();
        System.out.println(gumballMachine2);

        gumballMachine2.insertCoin( 25 );
        gumballMachine2.turnCrank();
        gumballMachine2.insertCoin( 25 );
        gumballMachine2.turnCrank();
        System.out.println(gumballMachine2);

        gumballMachine2.insertCoin( 25 );
        gumballMachine2.insertCoin( 25 );
        gumballMachine2.insertCoin( 25 );
        gumballMachine2.turnCrank();
        System.out.println(gumballMachine2);

        gumballMachine2.insertCoin( 25 );
        gumballMachine2.turnCrank();
        System.out.println(gumballMachine2 + " finished\n");

        GumballMachine gumballMachine3 = new GumballMachineAnyCoin(7);
        System.out.println(gumballMachine3 + " started");

        gumballMachine3.turnCrank();
        System.out.println(gumballMachine3);

        gumballMachine3.insertCoin(10);
        gumballMachine3.turnCrank();
        gumballMachine3.insertCoin(10);
        gumballMachine3.turnCrank();
        gumballMachine3.insertCoin(25);
        gumballMachine3.turnCrank();
        gumballMachine3.insertCoin(25);
        gumballMachine3.turnCrank();
        System.out.println(gumballMachine3 + " finished\n");
    }
}
