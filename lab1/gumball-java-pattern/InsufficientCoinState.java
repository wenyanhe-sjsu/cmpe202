public class InsufficientCoinState implements State {
    GumballMachine gumballMachine;
 
    public InsufficientCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoin(int coin) {
        System.out.println("You inserted a coin.");
        gumballMachine.setDeposit(gumballMachine.getDeposit() + coin);
        if (gumballMachine.getClass() == GumballMachineOneQuarter.class)
        {
            if (gumballMachine.getDeposit() >= 25 && coin == 25)
            {
                gumballMachine.setState(gumballMachine.getEnoughCoinState());
            }
        }
        else if (gumballMachine.getClass() == GumballMachineTwoQuarters.class)
        {
            if (gumballMachine.getDeposit() >= 50 && coin == 25)
            {
                gumballMachine.setState(gumballMachine.getEnoughCoinState());
            }
        }
        else  // any-coin type of gumball machine
        {
            if (gumballMachine.getDeposit() >= 50)
            {
                gumballMachine.setState(gumballMachine.getEnoughCoinState());
            }
        }

    }
 
    public void ejectCoin() {
        if (gumballMachine.getDeposit() == 0)
        {
            System.out.println("You haven't inserted a coin.");
        }
        else
        {
            System.out.println("Coins in the amount of " +
                                gumballMachine.getDeposit() + " returned.");
        }
    }
 
    public void turnCrank() {
        System.out.println("You turned. But there's insufficent money.");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "Waiting for more coins.";
    }
}
