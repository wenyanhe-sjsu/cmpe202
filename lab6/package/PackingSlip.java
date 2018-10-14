import java.util.ArrayList;

public class PackingSlip
{
    private ArrayList<Component> components = new ArrayList<Component>();

    public PackingSlip( Component c )
    {
        /* for (int i = 0; i < c.getComponents().size(); i++)
        {
            components.set(i, c.getComponents().get( i ));
        } */
        components = c.getComponents();
    }
      

    public void printout()
    {
        System.out.println("\n\n\n");
        System.out.println("Patties - 1\n\n");
        System.out.println("Order number:  45\n");
        System.out.println("          12/1/2016 1:46:54 PM");
        System.out.println("              FIVE GUYS\n");
        System.out.println("Sandwich#  1");
        
        for (Component obj : components)
        {
            if (obj.getName().contains("LBB"))
            {
                System.out.println( obj.getCount() + "      " + obj.getName() );

                ArrayList<Component> alc = obj.getComponents();
                alc.add(alc.remove(0));
                for (Component obj1 : alc)
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
                System.out.println( obj.getCount() + "    " + obj.getName() );
                    
                for (Component obj1 : obj.getComponents())
                {
                    System.out.println(obj1.getName());
                }
            }
        }
        
        System.out.println("Register: 1" + "          " + "Tran Seq No:  57845");
        System.out.println("Cashier: Sakda* S");
    }
}
