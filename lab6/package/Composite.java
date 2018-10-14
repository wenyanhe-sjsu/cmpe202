import java.util.ArrayList;
import java.lang.*;

public class Composite implements Component
{
    protected ArrayList<Component> components = new ArrayList<Component>();
    protected String name = "";
    protected double unitPrice = 0.0;
    protected int count = 0;
    
    public Composite()
    {
        this.name = "";
        this.unitPrice = 0.0;
        this.count = 0;
    }

    public Composite( String name )
    {
        this.name = name;
        this.unitPrice = 0.0;
        this.count = 1;
    }

    public Composite ( String name, double unitPrice, int count )
    {
        this.name = name;
        this.unitPrice = unitPrice;
        this.count = count;
    }

    // abstract public void printDescription();
    public void printDescription() 
    {
        System.out.println( Integer.toString(count) + "    " + name +
            "                              " +
            Double.toString( unitPrice * count ));
        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }
    

    public int getCount()
    {
        return count;
    }

    public String getName()
    {
        return name;
    }

    public double getUnitPrice()
    {
        return unitPrice;
    }

    public ArrayList<Component> getComponents()
    {
        return components;
    }

    public void addChild(Component c)
    {
        components.add( c ) ;
    }
     
    public void removeChild(Component c)
    {
        components.remove(c) ;
    }
     
    public Component getChild(int i)
    {
        return components.get( i ) ;
    }
}
 
