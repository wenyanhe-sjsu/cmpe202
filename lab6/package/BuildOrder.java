public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite();

        Burger burger = new Burger("LBB", 5.59, 1);
        Meat meat = new Meat( "BACON" );
        Topping t1 = new Topping( "LETTUCE" );
        Topping t2 = new Topping( "TOMATO" );
        Topping t3 = new Topping( "G ONION" );
        Topping t4 = new Topping( "JALA Grilled" );

        // Setup burger Ingredients
        burger.addChild( meat );
        burger.addChild( t1 );
        burger.addChild( t2 );
        burger.addChild( t3 );
        burger.addChild( t4 );

        // Add burger to the order
        order.addChild( burger );

        Fry fry = new Fry("LTL CAJ", 2.79, 1);
        // Add fries to the order
        order.addChild( fry );
        order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        order.addChild(new Leaf("The Purist", 8.00 ));

        
        return order ;
    }

}
