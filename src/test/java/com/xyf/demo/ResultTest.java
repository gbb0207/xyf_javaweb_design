package com.xyf.demo;

import com.xyf.demo.bean.Student;
import com.xyf.demo.bean.Subject;
import com.xyf.demo.service.ResultsService;
import com.xyf.demo.service.StudentService;
import com.xyf.demo.service.SubjectService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ResultTest {

    @Autowired
    private StudentService studentService;

    @Autowired
    private SubjectService subjectService;

    @Autowired
    private ResultsService resultsService;

    @Test
    public void updateResultsStuIdAndSubName() {
        List<Student> students = studentService.getAllStudent();
        List<Subject> subjects = subjectService.getAllSubject();
        int res_id = 1; //起始
        String stuId;
        String subName;

        while(res_id < students.size() * subjects.size()) {
            for (Student student : students) {
                stuId = student.getStuId();

                for (Subject subject : subjects) {
                    subName = subject.getSubName();
                    resultsService.updateStuIdAndSubNameByResId(stuId, subName, res_id);
                    res_id++;
                }
            }
        }
        System.out.println("成功");
    }

    public int CreateRandom() {
        Random random = new Random();
        int randomNumber = random.nextInt(101);
        return randomNumber;
    }
}
