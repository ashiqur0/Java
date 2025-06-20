/*
Java Array : Array of Objects
এটা তখন কাজে লাগবে যখন ডাটাবেইস থেকে ডাটা ফেটচ করা হবে।
*/
package Java_Telusko._7_array;
class Student {
    int roll;
    String name;
    int marks;
}

public class _2_array_with_object {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.roll = 1;
        student1.name = "Samiul";
        student1.marks = 98;
        
        Student student2 = new Student();
        student2.roll = 2;
        student2.name = "Nawshin";
        student2.marks = 88;

        Student student3 = new Student();
        student3.roll = 3;
        student3.name = "Simanto";
        student3.marks = 87;

        Student[] st = new Student[3];
        st[0] = student1;
        st[1] = student2;
        st[2] = student3;

        for (Student s : st) {
            System.out.println(s.roll + " " + s.name + " " + s.marks);
        }
        /*
        output : 
        1 Samiul 98
        2 Nawshin 88
        3 Simanto 87
        */
    }
}
