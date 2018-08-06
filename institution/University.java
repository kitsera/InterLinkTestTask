package institution;

import person.Student;
import java.util.*;

public class University {
	private String name;
    private Collection<Student> students;

    public University(String name) {
        this.name = name;
        this.students = new ArrayList<Student>();
    }


    /**
    Update specific student knowledge
    */
    public void setStudent(Student student) {
        for (Student s: this.students){
            if (s.getName() == student.getName()){
                s.setKnowledge(student.getKnowledge());
                System.out.println(s.getKnowledge().getKnowledge());
            }
        }
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addStudents(String filename){
        //TODO: Implementation is needed
    }

    public Collection<Student> getStudents() {
        return this.students;
    }

    public float getAvgKnowledge(){
        float avg = 0;
        for (Student s: this.getStudents()){
            avg += s.getKnowledge().getKnowledge();
        }
        avg /= this.getStudents().size(); 
        return avg;
    }
}
