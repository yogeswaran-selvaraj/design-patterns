package design.patterns;

import design.patterns.builder.Builder;
import design.patterns.singleton.Singleton;
import design.patterns.util.StudenType;
import design.patterns.util.Student;
import design.patterns.util.StudentBrilliant;
import design.patterns.util.StudentExcellent;

public class Client {
    public static void test(){
        Builder builder = Builder
                .getBuilderHelper()
                .setParam1(1)
                .setParam2(1L)
                .setParam3("test")
                .setParam4(1.1d)
                .setParam5(1.1f)
                .build();
        Singleton singleton =  Singleton.getSingletonInstance2();
        StudentBrilliant studentBrilliant = new StudentBrilliant();
        studentBrilliant.id = 1;
        studentBrilliant.name = "yoges";
        studentBrilliant.brilliant = 9;

        StudentExcellent studentExcellent = new StudentExcellent();
        studentExcellent.id = 1;
        studentExcellent.name = "yoges";
        studentExcellent.excellent = 1;

        Student student = new Student();
        student.addClone(StudenType.EXCELLENT, studentExcellent);
        student.addClone(StudenType.BRILLIIANT, studentBrilliant);
        StudentBrilliant studentBrilliant1 =  (StudentBrilliant) student.getClone(StudenType.BRILLIIANT);
        studentBrilliant1 = studentBrilliant1.clone();
        studentBrilliant1.brilliant = 10;
        System.out.println("this is brilliant "+ studentBrilliant1.brilliant);
        System.out.println("this is brilliant original "+ studentBrilliant.brilliant);
    }
}
