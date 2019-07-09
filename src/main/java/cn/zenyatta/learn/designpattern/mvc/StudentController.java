package cn.zenyatta.learn.designpattern.mvc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author mingming.song
 */
@Getter
@Setter
@ToString
public class StudentController {
    private Student student;
    private StudentView studentView;

    public StudentController(Student student, StudentView studentView) {
        this.student = student;
        this.studentView = studentView;
    }

    public String getStudentName() {
        return this.student.getName();
    }

    public void setStudentName(String name) {
        this.student.setName(name);
    }

    public String getStudentRollNo() {
        return this.student.getRollNo();
    }

    public void setStudentRollNo(String rollNo) {
        this.student.setRollNo(rollNo);
    }

    public void updateView() {
        studentView.printStudentDetail(student.getName(), student.getRollNo());
    }

}
