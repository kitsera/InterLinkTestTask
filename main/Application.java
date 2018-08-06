package main;

import institution.University;
import institution.interlink.Internship;
import person.consciousness.Knowledge;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");

        university.addStudent(new Student("Andrew Kostenko", new Knowledge(90)));
        university.addStudent(new Student("Julia Veselkina", new Knowledge(87)));
        university.addStudent(new Student("Maria Perechrest", new Knowledge(68)));

        university.setStudent(new Student("Andrew Kostenko", new Knowledge(89)));

        Internship internship = new Internship("Interlink");

        for (Student s: university.getStudents()){
        	if (s.getKnowledge().getKnowledge() > university.getAvgKnowledge()){
        		internship.setStudent(s);
        	}
        }

        System.out.println("List of internship's students:");

        for (Student s: internship.getStudents()){
        	System.out.println(s.getName());
       	}
    }
}