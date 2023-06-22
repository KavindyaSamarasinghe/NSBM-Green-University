package com.mycompany.p4q3;
public class P4Q3 
{

    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.setName("Abc");
        s1.setID(12345);
        s1.setCourse("Computer Science");

        Lecturer l1 = new Lecturer();
        l1.setName("Xyz");
        l1.setID(20);
        l1.setProgramme("Software Engineering");

        System.out.println("Student Details:");
        System.out.println("Name: " + s1.getName());
        System.out.println("ID: " + s1.getID());
        System.out.println("Course: " + s1.getCourse());

        System.out.println("\nLecturer Details:");
        System.out.println("Name: " + l1.getName());
        System.out.println("ID: " + l1.getID());
        System.out.println("Programme: " + l1.getProgramme());
        
    }
}
