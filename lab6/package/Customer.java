public class Customer
{
    public static void main(String args[])
    {
        Component theOrder = BuildOrder.getOrder() ;
        Receipt receipt = new Receipt(theOrder);
        receipt.printout();
        System.out.println("\n\n\n");
        PackingSlip slip = new PackingSlip(theOrder);
        slip.printout();

    }
}
 
