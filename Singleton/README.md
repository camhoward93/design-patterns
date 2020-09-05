# Singleton
The Singleton pattern ensures that a class has only one instance, and it provides a global access point to it. Singleton's advantages over declaring the class static are that it can implement interfaces and extend classes, and the Singleton object can be dynamically created so you aren't using up resources when you don't need to.

## The Example
Work in Progress

### Expected Output
Creating new Test Thread with ID:1<br/>
Creating new Test Thread with ID:2<br/>
Testing Synchronized Logger in thread: 1<br/>
Testing Synchronized Logger in thread: 2<br/>
Thread: 1 writes message 1 to synchronized logger log.<br/>
Thread: 2 writes message 1 to synchronized logger log.<br/>
Thread: 2 writes message 2 to synchronized logger log.<br/>
Thread: 1 writes message 2 to synchronized logger log.<br/>
Thread: 2 writes message 3 to synchronized logger log.<br/>
Thread: 1 writes message 3 to synchronized logger log.<br/>
Thread: 2 writes message 4 to synchronized logger log.<br/>
Thread: 1 writes message 4 to synchronized logger log.<br/>
Thread: 2 writes message 5 to synchronized logger log.<br/>
Thread: 1 writes message 5 to synchronized logger log.<br/>
Thread: 1 writes message 6 to synchronized logger log.<br/>
Thread: 2 writes message 6 to synchronized logger log.<br/>
Thread: 2 writes message 7 to synchronized logger log.<br/>
Thread: 1 writes message 7 to synchronized logger log.<br/>
Thread: 2 writes message 8 to synchronized logger log.<br/>
Thread: 1 writes message 8 to synchronized logger log.<br/>
Thread: 1 writes message 9 to synchronized logger log.<br/>
Thread: 2 writes message 9 to synchronized logger log.<br/>
Thread: 1 writes message 10 to synchronized logger log.<br/>
Thread: 2 writes message 10 to synchronized logger log.<br/>
Testing Eager Logger in thread: 2<br/>
Testing Eager Logger in thread: 1<br/>
Thread: 2 writes message 1 to eager logger log.<br/>
Thread: 1 writes message 1 to eager logger log.<br/>
Thread: 1 writes message 2 to eager logger log.<br/>
Thread: 2 writes message 2 to eager logger log.<br/>
Thread: 2 writes message 3 to eager logger log.<br/>
Thread: 1 writes message 3 to eager logger log.<br/>
Thread: 1 writes message 4 to eager logger log.<br/>
Thread: 2 writes message 4 to eager logger log.<br/>
Thread: 2 writes message 5 to eager logger log.<br/>
Thread: 1 writes message 5 to eager logger log.<br/>
Thread: 2 writes message 6 to eager logger log.<br/>
Thread: 1 writes message 6 to eager logger log.<br/>
Thread: 1 writes message 7 to eager logger log.<br/>
Thread: 2 writes message 7 to eager logger log.<br/>
Thread: 1 writes message 8 to eager logger log.<br/>
Thread: 2 writes message 8 to eager logger log.<br/>
Thread: 1 writes message 9 to eager logger log.<br/>
Thread: 2 writes message 9 to eager logger log.<br/>
Thread: 1 writes message 10 to eager logger log.<br/>
Thread: 2 writes message 10 to eager logger log.<br/>
Testing volatile Logger in thread: 2<br/>
Testing volatile Logger in thread: 1<br/>
Thread: 1 writes message 1 to volatile logger log.<br/>
Thread: 2 writes message 1 to volatile logger log.<br/>
Thread: 1 writes message 2 to volatile logger log.<br/>
Thread: 2 writes message 2 to volatile logger log.<br/>
Thread: 2 writes message 3 to volatile logger log.<br/>
Thread: 1 writes message 3 to volatile logger log.<br/>
Thread: 1 writes message 4 to volatile logger log.<br/>
Thread: 2 writes message 4 to volatile logger log.<br/>
Thread: 2 writes message 5 to volatile logger log.<br/>
Thread: 1 writes message 5 to volatile logger log.<br/>
Thread: 1 writes message 6 to volatile logger log.<br/>
Thread: 2 writes message 6 to volatile logger log.<br/>
Thread: 1 writes message 7 to volatile logger log.<br/>
Thread: 2 writes message 7 to volatile logger log.<br/>
Thread: 2 writes message 8 to volatile logger log.<br/>
Thread: 1 writes message 8 to volatile logger log.<br/>
Thread: 2 writes message 9 to volatile logger log.<br/>
Thread: 1 writes message 9 to volatile logger log.<br/>
Thread: 2 writes message 10 to volatile logger log.<br/>
Thread: 1 writes message 10 to volatile logger log.
