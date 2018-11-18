public class ConcreteDecorator extends Decorator {

    private String addedState;
    private String tag;

    public ConcreteDecorator( String tag, Component c)
    {
        super( c ) ;
        this.tag = tag ;
    }

    public String operation()
    {
        addedState = super.operation() ;
        return addedBehavior( addedState ) ;
    }

    private String addedBehavior(String in) {
        // return "<em>" + addedState + "</em>" ;
        // return "<h1>" + addedState + "</h1>" ;
        // Lambda taggedContent = (tag1, str, tag2) -> tag1 + str + tag2;
        Lambda taggedContent = (tag, str) -> "<" + tag + ">" + str + "</" + tag
            + ">";
        return taggedContent.addTag(this.tag, addedState);
    }

}
