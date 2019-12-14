In this assignment, you will implement ```bucket sort.```

First, implement the method ```fillBuckets()``` which sorts the elements from an array into an array of buckets. For simplicity, the input array only contains keys but no associated values. The output is an array of buckets, where each bucket is represented as a Queue.

First determine the minimum and maximum values of array and store them in variables vmin and vmax. You should return an array of buckets of size ```vmax-vmin+1```. Each bucket should be represented as a Queue of values, where **bucket[i]**
 stores values ```v = vmin + i```.

Do not implement the Queue interface yourself. You can use any data structure from the Java libraries, which implement the Queue interface.

After filling the buckets, implement the method ```readBuckets()```, which turns the buckets that you have created in ```fillBuckets()``` into a sorted array.