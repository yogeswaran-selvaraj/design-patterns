package design.patterns.util;

import design.patterns.registry.Registry;

import java.util.HashMap;

public class Student implements Registry<StudenType, Student> {
    public int id;
    private HashMap<StudenType, Student> registry = new HashMap<>();

    public String name;
    public Student(){

    }

    public Student(Student student){
        this.id = student.id;
        this.name = student.name;
    }

    @Override
    public Student getClone(StudenType type) {
        return registry.get(type);
    }

    @Override
    public void addClone(StudenType key, Student value) {
        registry.put(key, value);
    }
}
