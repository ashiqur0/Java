/*
Java OOP : Inner Classes [private inner]
private inner Classe: an inner class can be private, protected that can not be accessible from outside of the class
*/

package Java_W3School._3_Java_OOP._12_Inner_Classes;

class OuterClass2 {
    int x = 5;
    private class InnerClass2 {   // private inner class cannot access from outside
        int y = 10;
        public void printY() {
            System.out.println(y);
        }
    }

    public class PClass {
        public void printPrivate() {    // but I can access like this way
            InnerClass2 innerClass2 = new InnerClass2();
            innerClass2.printY();
        }
    }
}

public class _2_private_inner {
    public static void main(String[] args) {
        OuterClass2 outer2 = new OuterClass2();
        // OuterClass2.InnerClass2 inner2 = outer2.new InnerClass2();// cannot access
        System.out.println(outer2.x);

        OuterClass2.PClass inner2 = outer2.new PClass();            // can be access
        inner2.printPrivate();
    }
}
