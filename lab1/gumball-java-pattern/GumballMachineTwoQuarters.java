public class GumballMachineTwoQuarters extends GumballMachine
{
    public GumballMachineTwoQuarters(int numberGumballs)
    {
        super(numberGumballs);
    }

    public boolean hasEnoughMoney()
    {
        if (this.getDeposit() >= 50)
            return true;
        else
            return false;
    }
}
