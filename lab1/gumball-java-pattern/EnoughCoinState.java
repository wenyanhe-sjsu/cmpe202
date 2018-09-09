import java.util.Random;

public class EnoughCoinState implements State {
    GumballMachine gumballMachine;
 
    public EnoughCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    public void insertCoin(int coin) {
        System.out.println("You can't insert another coin.");
    }
 
    public void ejectCoin() {
        System.out.println("Coins returned.");
        gumballMachine.setDeposit(0);
        gumballMachine.setState(gumballMachine.getInsufficientCoinState());
    }
 
    public void turnCrank() {
        System.out.println("You turned the crank.");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("No gumball dispensed.");
    }
 
    public String toString() {
        return "Waiting for turn of crank.";
    }
}
