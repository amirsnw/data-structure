The algorithm determines the steps we have to take to reach a specific goal.
Example: Algorithm for making tea.

There can be several algorithms for a task.
An example of sorting data for which there is only one algorithm.
Some sorting algorithms have a series of assumptions for the data they are sorting, 
and some algorithms do not.

The algorithm is not an implementation.
Algorithm is just a set of steps to perform a task.
Implementation is the same code that we write to execute the steps of the algorithm.

There can be several implementations for only one algorithm.
There can be different implementations even for one step.

**The fact is, there aren't just two sides to any issue, there's almost always 
a range of responses, and "it depends" is almost always the right answer in any bug question.**

In order to measure the optimality of an algorithm, we cannot draw conclusions based on the start and end time (due to hardware), so instead we look at the algorithm's execution steps and call this method time complexity.

We have two types of complexity:
1. The number of steps to execute the algorithm
2. memory complexity to run the algorithm
   The importance of the second type is less, so we use the first type as our criterion.

We usually start from the worst case for the analysis, because the best case usually does not exist.
So, to compare the algorithms, we compare the worst case and scenario of one algorithm with the worst scenario of another algorithm.

Another method of analysis can be how well each algorithm can be implemented on a larger scale.
In fact, the higher the number of items, the lower the algorithm execution speed.

**Big O Notation is a way to express the complexity of the items that the algorithm has to work on.**

The Big O types:
O(1): called Constant
O(logn): called Logarithmic
O(n): called Linear
O(nlogn): called n log-star n
O(n^2): called Quadratic
