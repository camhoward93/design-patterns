# Observer
The Observer design pattern defines a one to many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.

## The Example
In this example I have created two baby monitors that can monitor the crying status of a baby. The simple monitor observes only whether the baby is crying or not. The advanced monitor also gives the severity of the crying, and it can monitor two babies at once.

So, in this case the babies are the subject and the monitors are the observers that will need to be updated when the state of crying is changed. First, I make my interfaces: Subject, which must be able to register, remove, and update observers, Observer, which must be able to update itself, and a DisplayElement that will display the state. The one to many dependency in this case is that one baby can have many different monitors observing its crying state. The MonitorSimple and MonitorAdvanced classes implement both the Observer and the DisplayElement interface because they have to observe the crying state and meaningfully display what that state is. The Baby class implements the Subject interface with the added properties of crying state and severity, an ArrayList of observers, and the setCryingStatus method that will change the crying status and notify all the observers. The Main class demonstrates this example by creating 2 babies, one of each monitor assigned to the babies, and then changing the crying statuses of the babies (which will notify the monitors and display the change to screen).

In order to run this simply download all the files into a package called observer and run the main function of the Main class (I did this using the IntelliJ IDE).
