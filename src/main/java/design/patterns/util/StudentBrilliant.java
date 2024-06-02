package design.patterns.util;

import design.patterns.prototype.ProtoType;

public class StudentBrilliant extends Student implements ProtoType<StudentBrilliant> {
    public int brilliant;
    public StudentBrilliant(){

    }
    public StudentBrilliant(StudentBrilliant studentBrilliant){
        super(studentBrilliant);
        this.brilliant = studentBrilliant.brilliant;
    }

    public StudentBrilliant clone() {
        return new StudentBrilliant(this);
    }
}
