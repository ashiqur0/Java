/*
Java OOP : Inner Classes [access outer by inner class]
*/


package Java_W3School._3_Java_OOP._12_Inner_Classes;
class Outer4 {
    int x = 5;
    class Inner4 {
        public int myInner() {
            return x;
        }
    }
}
public class _4_outer_by_inner {
    public static void main(String[] args) {
        Outer4 outer4 = new Outer4();
        Outer4.Inner4  inner4 = outer4.new Inner4();
        System.out.println(inner4.myInner());
    }
}
