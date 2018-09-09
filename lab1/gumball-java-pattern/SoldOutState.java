public class SoldOutState implements State {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoin(int coin) {
        System.out.println("You can't insert a coin. The machine is sold out.");
    }
 
    public void ejectCoin() {
        System.out.println("You can't eject any coin because you haven't "
                           + "inserted a coin yet.");
    }
 
    public void turnCrank() {
        System.out.println("Crank turned. But there are no gumballs.");
    }
 
    public void dispense() {
        System.out.println("No gumball dispensed.");
    }
 
    public String toString() {
        return "All gumballs sold out.";
    }
}
