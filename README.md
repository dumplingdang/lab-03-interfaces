# lab-03-interfaces (lab-02 continues)
## Sort Guppy objects using implementations of the Comparator interface.
1. Let’s define a total ordering for Guppies. The total ordering should be based on ID number. A Guppy
with a larger ID number comes "before" a Guppy with a smaller ID number. Modify **Guppy** so that
it implements **Comparable<Guppy>**.
2. Test this. Create a class called **Lab03**. This class needs a main method. Inside the main method,
create an array of size 100 and fill it with Guppies. Then shuffle them. Be creative.
3. After you shuffle them, use the utility method **Arrays.sort()** to sort the Guppies. Write code to prove
that the IDs in the list are sorted correctly.
4. What if we decide to sort Guppies in a different way? We can define different ways to sort by creating
new classes that implement the Comparator interface. Let’s do that now.
5. Create a new class called **GuppyComparatorHealthCoefficient**. This class must implement
**Comparator<Guppy>**. Let’s sort the Guppies so the highest health coefficient is first,
and the lowest is last.
6. In the **Lab03** class’ main method, instantiate a **GuppyComparatorHealthCoefficient** and pass it as
the second parameter to a new call to **Arrays.sort()** using the array as the first parameter. Prove it
sorted correctly.
7. Sort Guppies by their age. Create a new **GuppyComparatorAgeWeeks** and implement
a compare method that sorts by age – this time, younger Guppies come first!
