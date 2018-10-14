import java.util.ArrayList;

public interface Component {

     void printDescription() ;
     void addChild(Component c);
     void removeChild(Component c);
     Component getChild(int i);
     ArrayList<Component> getComponents();
     String getName();
}
 
