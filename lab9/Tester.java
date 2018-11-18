public class Tester {

    public static void runTest()
    {
        Component obj = new ConcreteDecorator( "h1", new ConcreteDecorator(
            "em", new ConcreteComponent() ) );
        String result = obj.operation() ;
        System.out.println( result );
    }

    public static void main( String [] args )
    {
        Tester t = new Tester() ;
        t.runTest() ;
    }    
    
}
