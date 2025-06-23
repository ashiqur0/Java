/*
OOP [Class Methods] : Access Method Through Object
*/

package Java_W3School._3_Java_OOP._3_Class_Methods;

public class _3_access_method_through_object {

    public void fullSpeed() {
        System.out.println("The car is going as fast it can ...");
    }

    public void maxSpeed(int maxSpeed) {
        System.out.println("Max speed: " + maxSpeed);
    }

    public static void main(String[] args) {
        _3_access_method_through_object obj = new _3_access_method_through_object();
        obj.fullSpeed();
        obj.maxSpeed(200);
    }
}
