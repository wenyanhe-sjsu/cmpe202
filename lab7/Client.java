public class Client {

    public static void runTest()
    {
        Component theOrder = BuildOrder.getOrder() ;
        System.out.println();
        theOrder.printDescription();

    }
}
 
