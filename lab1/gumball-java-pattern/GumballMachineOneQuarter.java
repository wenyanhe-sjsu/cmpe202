public class GumballMachineOneQuarter extends GumballMachine
{
    public GumballMachineOneQuarter(int numberGumballs)
    {
        super(numberGumballs);
    }

    public boolean hasEnoughMoney()
    {
        if (this.getDeposit() >= 25)
            return true;
        else
            return false;
    }
}
