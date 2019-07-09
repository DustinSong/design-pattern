package cn.zenyatta.learn.designpattern.mvc;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mingming.song
 */
public class MvcPatternTest {

    @Test
    public void testMvc() {
        Student model = receiveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("John");

        controller.updateView();
    }

    private Student receiveStudentFromDatabase() {
        Student student = new Student();

        student.setName("Robert");
        student.setRollNo("10");

        return student;
    }

}