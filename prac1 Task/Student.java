package prac1;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private Integer age;
    private Group group;

    public Student(String name, Integer age, Group group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }



    public Group getGroup() {
        return group;
    }

    public void setDepartment(Group group) {
        this.group = group;
    }

    public String toString(){
        return "Имя студента:"+this.name;
    }

}