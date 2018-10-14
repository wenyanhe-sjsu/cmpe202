import java.util.ArrayList;

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
        for (Component obj : components)
        {
            if (obj.getName().contains("LBB"))
            {
                System.out.println( 1 + "    " + obj.getName() +
                    "                              " +
                    5.59);

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
                System.out.println( 1 + "  " + obj.getName() +
                    "                            " +
                    2.79);
                    
                for (Component obj1 : obj.getComponents())
                {
                    System.out.println(obj1.getName());
                }
            }
        }
    }
}
