## Comparison between original decorator code and lambda style code
1. The lambda style solution introduces a new class Lambda.java, which essentially declares a method for the lambda expression.
```
public interface Lambda
{
    String addTag(String tag, String str);
}
```
2. The lambda style solution uses only one decorator (*ConcreteDecorator*) as opposed to two (*ConcreteDecoratorA* and *ConcreteDecoratorB*) in the original solution.  This improves code reusability.  The price for elimination of one decorator class is an extra input parameter.  In this case, it is the tag.  Accordingly, in the Tester class, the runTest method has to be modified to account for this extra parameter.
3. The *addedBehavior* method of ConcreteDecorator class uses a lambda expression.
