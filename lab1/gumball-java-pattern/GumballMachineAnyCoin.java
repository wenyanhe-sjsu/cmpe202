public class GumballMachineAnyCoin extends GumballMachine
{
    public GumballMachineAnyCoin(int numberGumballs)
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
