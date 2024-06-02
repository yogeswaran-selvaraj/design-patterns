package design.patterns.util;

import design.patterns.prototype.ProtoType;

public class StudentExcellent extends Student implements ProtoType<StudentExcellent> {
    public int excellent;
    public StudentExcellent(){
        super();
    }
    public StudentExcellent(StudentExcellent student){
        super(student);
        this.excellent = student.excellent;
    }

    @Override
    public StudentExcellent clone() {
        return new StudentExcellent(this);
    }
}
