public abstract class GumballMachine {
 
    State soldOutState;
    State soldState;
    State enoughCoinState;
    State insufficientCoinState;
 
    State state = soldOutState;
    int count = 0;  // number of remaining gumballs
    int deposit = 0;// total amount of money inserted
 
    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        insufficientCoinState = new InsufficientCoinState(this);
        enoughCoinState = new EnoughCoinState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = insufficientCoinState;
        }
    }
 
    public void insertCoin(int coin) {
        state.insertCoin(coin);
    }
 
    public void ejectCoin() {
        state.ejectCoin();
    }
 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }
 
    int getCount() {
        return count;
    }
 
    void refill(int count) {
        this.count = count;
        state = insufficientCoinState;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int money) {
        deposit = money;
    }

    void setState(State state) {
        this.state = state;
    }
 
    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getInsufficientCoinState() {
        return insufficientCoinState;
    }

    public State getEnoughCoinState() {
        return enoughCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
