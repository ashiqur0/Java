public class A_TypesOfVariable {

    static String Name = "Jack";    // Static variable/ Class variable
    int roll = 9;                   // Instance variable

    public String method() {        
        String department = "CSE";  // Local variable
        return department;
    }

    public static void main(String[] args) {

        String batch = "23th";      // Local variable
        A_TypesOfVariable a_TypesOfVariable = new A_TypesOfVariable();
        System.out.println(Name+" "+a_TypesOfVariable.roll+" "+a_TypesOfVariable.method()+" "+batch);
    }
}