import java.text.DecimalFormat;
import java.util.ArrayList;

public class Leaf implements Component {

    private String description ;
    protected Double price ;

    public Leaf ( String d, Double p )
    {
        description = d ;
        price = p ;
    }
    
    public Leaf ( String d ) 
    {
        description = d ;
        price = 0.0 ;
    }
    
    public void printDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println( " " + description + " " + fmt.format(price) ) ;
    }

    public ArrayList<Component> getComponents()
    {
        // no implementation
        return null;
    }

    public String getName()
    {
        return description;
    }
    
    public double getUnitPrice()
    {
        return 0.0;  // free of charge
    }
    
    public int getCount()
    {
        return 1;
    }

    public void addChild(Component c) {
        // no implementation
    }

    public void removeChild(Component c) {
        // no implementation
    }

    public Component getChild(int i) {
        // no implementation
        return null ;
    }
     
}
