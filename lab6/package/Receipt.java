import java.util.ArrayList;
import java.text.DecimalFormat;

public class Receipt
{
    private ArrayList<Component> components = new ArrayList<Component>();

    public Receipt( Component c )
    {
        /* for (int i = 0; i < c.getComponents().size(); i++)
        {
            components.set(i, c.getComponents().get( i ));
        } */
        components = c.getComponents();
    }

    public void printout()
    {
        double sum = 0.0;
        DecimalFormat fmt = new DecimalFormat("0.00");
        
        System.out.println("                 FIVE GUYS");
        System.out.println("             BURGERS AND FRIES");
        System.out.println("              STORE # CA-1294");
        System.out.println("            5353 ALMADEN EXPY N60");
        System.out.println("             SAN JOSE, CA 95118");
        System.out.println("              (P) 408-264-9300\n\n");
        System.out.println("            12/1/2016 1:46:54 PM\n");
        System.out.println("                 FIVE GUYS");
        System.out.println("Order numer:       45\n");
        
        for (Component obj : components)
        {
            sum += obj.getUnitPrice() * obj.getCount();
            if (obj.getName().contains("LBB"))
            {
                System.out.println( obj.getCount() + "    " + obj.getName() +
                    "                              " +
                    (obj.getCount() * obj.getUnitPrice()));

                for (Component obj1 : obj.getComponents())
                {
                    if (obj1.getName().contains("BACON"))
                        System.out.println("      " + "{{{{ BACON }}}}");
                    else if (obj1.getName().contains("G ONION") ||
                             obj1.getName().contains("JALA Grilled") )
                        System.out.println("      " + "->|" + obj1.getName());
                    else
                        System.out.println("      " + obj1.getName());
                }
            }

                //System.out.println(obj.getName());
                
            if (obj.getName().contains("LTL"))
            {
                System.out.println( obj.getCount() + "  " + obj.getName() +
                    "                            " +
                    (obj.getCount() * obj.getUnitPrice()));
                    
                for (Component obj1 : obj.getComponents())
                {
                    System.out.println(obj1.getName());
                }
            }
        }
        
        System.out.println("   " + "Sub. Total:" + "                       $"
            + fmt.format(sum));
    }
}
