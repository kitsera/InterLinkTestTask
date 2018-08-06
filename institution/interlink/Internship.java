package institution.interlink;

import person.Student;
import java.util.*;

public class Internship {
    private String name;
    private Collection<Student> students;

    public Internship(String name) {
        this.name = name;
        this.students = new ArrayList<Student>();
    }

    public void setStudent(Student student) {
        this.students.add(student);
    }

    public Collection<Student> getStudents() {
        return this.students;
    }
}
