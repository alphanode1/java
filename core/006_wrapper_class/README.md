### WRAPPER CLASS ### 

***
- This class is mainly used to convert primitive type into class/object type and vide-versa.
- 8 wrapper classes are available in Java.
- All are available in 'java.lang' package.
***

| **Data type**  | **Wraper Class** |
| :------------- | :--------------- |
| byte           | Byte             |
| short          | Short            |
| int            | Integer          |
| long           | Long             |
| float          | Float            |
| double         | Double           |
| char           | Character        |
| boolean        | Boolean          |

---------------------------------------------------------------------------------------------------------------------------------
**INTEGER CLASS :-** This class represent integer value.		

**Constructors :**
(a) *Integer();* e.g.
```java
Integer i = new Integer();
i = 10;
```
(b) *Integer(int value);* e.g.
```java
Integer i = new Integer(10);
System.out.println(i);  // 10
```
	
**Methods :**	
+ *parseInt()* :- This method is used to convert string value into int datatype.It is static method of Integer class.
Syntax:-  static int parseInt(String value);
e.g.
   ```java
   int a = "100"; // Error
   int a = Integer.parseInt("100");
   ```
	
+ *valueOf()* :- This method is used to convert string value into Integer type object. It is of static nature.	
	Syntax:- static Integer valueOf(string value);	
	e.g.
	```java
	Integer i = Integer.valueOf("100");
	int i = Integer.valueOf("100"); // Error in lower version ( <= JDK 1.5 )
	```
	
+ *intValue()* :- This method is used to convert integer object into int datatype.	
	Syntax:- int intValue();	
	e.g.
	```java
	Integer i = Integer.valueOf("100");
	int a = i; // works above ( JDK 1.4 )
	int a = i.intValue(); // Now works in ( JDL 1.4 )
	```
	
+ *toString()* :- This method is used to convert integer type data into value into string. It is of static nature.	
	Syntax:- static String toString(int value);		
	e.g.
	```java
	String s = 100; // Error
	String s = Integer.toString(100);
   ```
+ toBinaryString() :- This method convert integer value to binary.
	Syntax:- static String toBinaryString(int value);
	e.g.
	```java
	String s = Integer.toBinaryString(5); // 101
	```
+ toHexString() :- This method convert integer value to hexadecimal.
	Syntax:- static String toHexString(int value);
	```java
	String s = Integer.toHexString(5); //
	```
+ toOctalString() :- This method convert integer value to octal.
	Syntax:- static String toOctalString(int value);
	e.g.
	```java
	String s = Integer.toOctalString(5); //
	```

**Constant of Integer class**
+ MAX_VALUE :- maximum range of int data type
+ MIN_VALUE :- minimum range of int data type
	e.g.
	```java
	System.out.println("Maximum value of int datatype : " +Integer.MAX_VALUE());
	System.out.println("Minimum value of int datatype : " +Integer.MIN_VALUE());
	```

---------------------------------------------------------------------------------------------------------------------------------
**FLOAT CLASS :-** This class represent float value.








---------------------------------------------------------------------------------------------------------------------------------
**CHARACTER CLASS :-** This class represent character value.

**Constructors :**
(a) *Character();* e.g
```java
Character ch = new Character();
ch = 'A';
```
(b) *Character(char ch);* e.g.
```java
Character ch = new Character('A');
```

**Methods :**
+ isLower();
+ isDigit();
+ isLetter();
+ isSpaceChar();
+ isUpperCase();
+ isLetterOrDigit();
+ toString();
+ toLowerCase();
+ toUpperCase();
+ toTitleCase();
