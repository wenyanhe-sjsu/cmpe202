public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" );
        
        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" );
        
        Burger b = new Burger( "Burger Options" );
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" };
        b.setOptions( bo );
        
        Cheese c = new Cheese( "Cheese Options" );
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" };
        c.setOptions( co );
        c.wrapDecorator( b );
        
        PremiumCheese pc = new PremiumCheese( "Premium Cheese Options" );
        String[] pco = { "Danish Blue Cheese" };
        pc.setOptions( pco );
        pc.wrapDecorator( c );
        
        Sauce s = new Sauce( "Sauce Options" );
        String[] so = { "Mayonnaise", "Thai Peanut Sauce" };
        s.setOptions( so );
        s.wrapDecorator( pc );
        
        Toppings t = new Toppings( "Toppings Options" );
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" };
        t.setOptions( to );
        t.wrapDecorator( s );

        PremiumToppings pt = new PremiumToppings( "Premium Toppings Options" );
        String[] pto = { "Marinated Tomatoes" };
        pt.setOptions( pto );
        pt.wrapDecorator( t );
        
        Bun bun = new Bun( "Bun Options" );
        String[] bunop = { "Ciabatta (Vegan)" };
        bun.setOptions( bunop );
        bun.wrapDecorator( pt );
        
        Side side = new Side( "Side Options" );
        String[] sdo = { "Shoestring Fries" };
        side.setOptions( sdo );
        side.wrapDecorator( bun );

        customBurger.setDecorator( side ) ;
        customBurger.addChild( b );
        customBurger.addChild( c );
        customBurger.addChild( pc );
        customBurger.addChild( s );
        customBurger.addChild( t );
        customBurger.addChild( pt );
        customBurger.addChild( bun );
        customBurger.addChild( side );
        
        // Add Custom Burger to the Order
        order.addChild( customBurger );        
        
        CustomBurger customBurger2 = new CustomBurger( "Build Your Own Burger" );
        
        Burger b2 = new Burger( "Burger Options" );
        String[] bo2 = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" };
        b2.setOptions( bo2 );
        
        Cheese c2 = new Cheese( "Cheese Options" );
        String[] co2 = { "Smoked Gouda", "Greek Feta" };
        c2.setOptions( co2 );
        c2.wrapDecorator( b2 );
        
        PremiumCheese pc2 = new PremiumCheese( "Premium Cheese Options" );
        String[] pco2 = { "Fresh Mozzarella" };
        pc2.setOptions( pco2 );
        pc2.wrapDecorator( c2 );
        
        Sauce s2 = new Sauce( "Sauce Options" );
        String[] so2 = { "Habanero Salsa" };
        s2.setOptions( so2 );
        s2.wrapDecorator( pc2 );
        
        Toppings t2 = new Toppings( "Toppings Options" );
        String[] to2 = { "Crushed Peanuts" };
        t2.setOptions( to2 );
        t2.wrapDecorator( s2 );

        PremiumToppings pt2 = new PremiumToppings( "Premium Toppings Options" );
        String[] pto2 = { "Sunny Side Up Egg*", "Marinated Tomatoes" };
        pt2.setOptions( pto2 );
        pt2.wrapDecorator( t2 );
        
        Bun bun2 = new Bun( "Bun Options" );
        String[] bunop2 = { "Gluten-Free Bun" };
        bun2.setOptions( bunop2 );
        bun2.wrapDecorator( pt2 );
        
        Side side2 = new Side( "Side Options" );
        String[] sdo2 = { "Shoestring Fries" };
        side2.setOptions( sdo2 );
        side2.wrapDecorator( bun2 );

        customBurger2.setDecorator( side2 ) ;
        customBurger2.addChild( b2 );
        customBurger2.addChild( c2 );
        customBurger2.addChild( pc2 );
        customBurger2.addChild( s2 );
        customBurger2.addChild( t2 );
        customBurger2.addChild( pt2 );
        customBurger2.addChild( bun2 );
        customBurger2.addChild( side2 );
        
        // Add Custom Burger to the Order
        order.addChild( customBurger2 );

        return order;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/
