public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
    public void insertCoin(int coin) {
        System.out.println("Please wait. We're already giving you a gumball");
    }
 
    public void ejectCoin() {
        System.out.println("Sorry, you already turned the crank. " +
                           " Can't eject a coin now.");
    }
 
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }
 
    public void dispense() {
        gumballMachine.releaseBall();
        gumballMachine.setDeposit(0);
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getInsufficientCoinState());
        } else {
            System.out.println("Oops, out of gumballs now!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
 
    public String toString() {
        return "Dispensing a gumball.";
    }
}
