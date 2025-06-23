/*
Java OOP [Modifieres] : final
final: attributes or method can not be override / modified
*/

package Java_W3School._3_Java_OOP._6_Modifiers;

public class _2_final {
    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        _2_final obj = new _2_final();
        // obj.x = 100;    // generates an error: final value cannot be changed
        // obj.PI = 2.90;    // generates an error: final value cannot be changed
        System.out.println(obj.x);
    }
}
