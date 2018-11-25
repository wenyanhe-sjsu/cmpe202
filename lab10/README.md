## Comparison between Different Solutions
Here we try to make a comparison between a solution to the gumball machine
problem with FeatureIDE/AspectJ flavors and the one without.  The former is
presented in Lab 10 while the latter in Lab 1.

Looking back at Lab 1, we can easily observe that the solution without
FeatureIDE/AspectJ requires defining multiple very similar classes for a gumball
machine itself together with many other supporting classes.  From software
engineering perspective, this is always a bad idea as it
has more code to maintain, lowers code reusability, entails more testing work,
to name just a few drawbacks.

The FeatureIDE/AspectJ solution in Lab 10, on the other hand, has much leaner
code.  Other than minimal object-oriented programming for the very core of a
gumball machine, the rest of the coding is done in AspectJ to account for its
many aspects, such as its type (crank or slot), coin feed (one quarter or two),
gumball price, etc.

To test the solution with FeatureIDE/AspectJ, one can simply write small modules
using AspectJ based on a certain feature model configuration.  This improves
coding efficiency and flexibility.  It is cleary desirable compared to the
solution without FeatureIDE/AspectJ.

## Feature Model
![model image](images/model.png?raw=true)
## Feature Model Configuration and Its Output 
1. CRANKMODEL, ONEQTR, and COST25

![Configuration](images/crank25.png?raw=true) \
![Configuration](images/crank25output.png?raw=true)

2. CRANKMODEL, TWOQTR, and COST50

![Configuration](images/crank50.png?raw=true) \
![Configuration](images/crank50output.png?raw=true)

3. SLOTMODEL, ONEQTR, and COST25

![Configuration](images/slot25.png?raw=true) \
![Configuration](images/slot25output.png?raw=true)

4. SLOTMODEL, TWOQTR, and COST50

![Configuration](images/slot50.png?raw=true) \
![Configuration](images/slot50output.png?raw=true)
