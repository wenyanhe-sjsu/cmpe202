public class PremiumToppings extends LeafDecorator
{
    private String[] options;
 
    public PremiumToppings( String d )
    {
        super(d);
    }
 
    public void setOptions( String[] options )
    {
        this.options = options;
        for (int i = 0; i < options.length; i++)
        {
            if ( "Marinated Tomatoes".equals(options[i]) ) this.price += 3.0;
            else this.price += 1.0;
        }
    }
    
    public String getDescription() 
    {
        String desc = "" ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
    }
    
}
