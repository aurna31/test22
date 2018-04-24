package model;

import controller.student;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "abc")
public class conClass extends student {
    public conClass() {
    }

    student student=new student();

    public controller.student getStudent() {
        return student;
    }

    public void setStudent(controller.student student) {
        this.student = student;
    }
    public String getN(){
        return student.name;
    }
}
