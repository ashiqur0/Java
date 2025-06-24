/*
Java OOP : Inner Classes [static inner]
static inner Classe: can be assess without creating outer object
*/

package Java_W3School._3_Java_OOP._12_Inner_Classes;
class Outer3 {
    int x = 5;
    static class Inner3 {
        int y = 10;
    }
}
public class _3_static_inner {
    public static void main(String[] args) {
        Outer3.Inner3 inner3 = new Outer3.Inner3(); //but access, parent.child manner
        System.out.println(inner3.y);
    }
}
