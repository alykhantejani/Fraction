#Fraction

An Fraction representation for Java to avoid floating point errors over multiple operations by representing numbers as fractions.

##Example:
Normally you would do this:
	double a = 1.2;
	double b = 2.4;
	double c = a + b;
	System.out.println(c);
and you would get this output:
	3.5999999999999996

Using fractions you can do this:
	Fraction a = new Fraction(6, 5);
	Fraction b = new Fraction(12, 5);
	Fraction c = Fraction.add(a, b);
	System.out.println(c.toDouble());
and you will get:
	3.6


##Build Instructions:

Fraction is built with Gradle, if you havent got this installed you can grab the latest copy from: http://www.gradle.org/downloads.html

To build simply type: gradle build
Or if you use eclipse, to set up an eclipse project type: gradle eclipse
