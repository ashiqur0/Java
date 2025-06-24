/*
Java OOP : Practice Encapsulation
*/

package Java_W3School._3_Java_OOP._7_encapsulation;

class Student {
    private int roll;
    private String name;
    private double cgpa;
    
    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class practice {
    public static void main(String[] args) {
        Student student1 = new Student();       // creating object
        student1.setRoll(1);               // inserting data
        student1.setName("Samiul");
        student1.setCgpa(3.88);

        Student student2 = new Student();
        student2.setRoll(2);
        student2.setName("Nawshin");
        student2.setCgpa(3.78);

        Student student3 = new Student();
        student3.setRoll(3);
        student3.setName("Simanto");
        student3.setCgpa(3.83);

        Student[] students = new Student[3];    // creating array 
        students[0] = student1;                 // inserting data
        students[1] = student2;
        students[2] = student3;

        for (Student student : students) {      // fetch data
            System.out.println(student.getRoll() + " " + student.getName() + " " + student.getCgpa());
        }
    }
}
