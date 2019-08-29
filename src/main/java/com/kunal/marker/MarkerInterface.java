package com.kunal.marker;

public class MarkerInterface {
}
/*
Where Should I use Marker interface in Java
Apart from using built in marker interface for making a class Serializable or Clonnable. One can also develop his own marker interface. Marker interface is a good way to classify code. You can create marker interface to logically divide your code and if you have your own tool than you can perform some pre-processing operation on those classes. Particularly useful for developing API and framework like Spring or Struts.
After introduction of Annotation on Java5, Annotation is better choice than marker interface and JUnit is a perfect example of using Annotation e.g. @Test for specifying a Test Class. Same can also be achieved by using Test marker interface.


Another use of marker interface in Java

One more use of marker interface in Java can be commenting. a marker interface called Thread Safe can be used to communicate other developers that classes implementing this marker interface gives thread-safe guarantee and any modification should not violate that. Marker interface can also help code coverage or code review tool to find bugs based on specified behavior of marker interfaces.
Again Annotations are better choice @ThreadSafe looks lot better than implementing ThraedSafe marker interface.

In summary marker interface in Java is used to indicate something to compiler, JVM or any other tool but Annotation is better way of doing same thing.


Read more: https://javarevisited.blogspot.com/2012/01/what-is-marker-interfaces-in-java-and.html#ixzz5xco0WZpO
 */