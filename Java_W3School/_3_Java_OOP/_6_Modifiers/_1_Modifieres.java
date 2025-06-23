/*
Java OOP [Modifieres] : public
public : is an access modifier, meaning that it is use to set the access level for classes, attributes, methodes, and constructors.

Access Modifiers:
[class level access modifier]: 
public: it can allow the class to access from any other class
default: the class is accessible by the class in the same package

[attribute, method, constructor level access modifiers]:
public: the code is accessible for all classes
private: the code is only accessible in the same package
default: the code is only accessible in the same package
protected: the code is accessible in the same package

Non-Access Modifieres: 
[class level Modifieres]:
final: the class can not be inherited by other classes
abstract: the class can not be used to create object

final: attributes or method can not be override / modified
static: attributes and method belongs to the class rather than an objects
abstract: can only be used in abstract class, and can only be used on methods. The method does not have a body. For example, abstract void run();
transient: Attributes and methods are skipped when serializing the object containing them
synchronized: method can only be accessed by one thread at a time
volatile: The value of an attribute is not cached thread-locally, and is always read from the "main memory"
*/

package Java_W3School._3_Java_OOP._6_Modifiers;

public class _1_Modifieres {
    public int x = 10;
    public double PI = 3.14;

    public static void main(String[] args) {
        _1_Modifieres obj = new _1_Modifieres();
        obj.x = 100;
        obj.PI = 2.90;
        System.out.println(obj.x);  // 100
        System.out.println(obj.PI); // 2.90
    }
}
