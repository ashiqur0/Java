/*
Java Methods : Scope Variable
Scope : 
Local scope: The variable inside of block of code {}, mehtod(){}, if-else block, switch-case etc, can not be accessible from outside of the block. 
Global scop: The variable declared inside the class but outside of any code block is called global scop variable. They can be accessible from anywhere from the class. But need to create object first.
*/

package Java_W3School._2_Java_Methods._2_Methods_Parameters;

public class _5_scope {
    int x = 5;
    public static void main(String[] args) {
        int y = 2;
        System.err.println(y);
        
        _5_scope obj = new _5_scope();
        System.out.println(obj.x);
    }
}
