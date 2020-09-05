# Singleton
The Singleton pattern ensures that a class has only one instance, and it provides a global access point to it. Singleton's advantages over declaring the class static are that it can implement interfaces and extend classes, and the Singleton object can be dynamically created so you aren't using up resources when you don't need to.

## The Example
This example shows a common scenario for using Singleton, a logger. The idea is that there is only one logger class as a Singleton. This example uses threading to show that the one logger instance is being used between two threads.

In order to make Singleton thread safe, there are three potential solutions. I have put each solution into its own Singleton class to demonstrate all three in the Test threads. The first solution is to make the getInstance() method synchronized, which will force every thread to wait for its turn to enter the method. The downside of this method is that after the first time setting the uniqueInstance the synchronization becomes unnecessary overhead. The second solution is to have an eagerly created instance of uniqueInstance. This relies on the JVM to create the unique instance of the logger, so that now getInstance() will already have something to return. The third solution is to perform double-checked locking by making the uniqueInstance volatile, then synchronizing only if an instance hasn't been created yet. This solution solves the problem of the first solution's overhead, while not forcing the JVM to create an instance upon loading the class. Each of these solutions are implemented respectively in LoggerSync, LoggerEager, and LoggerVolatile.

In order to run this simply download all the files into a package called singleton and run the main function of the LoggerTester class (I did this using the IntelliJ IDE).

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
