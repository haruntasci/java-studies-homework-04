package service;

import model.Branch;
import model.Instructor;
import model.Sex;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class InstructorService {
    public Instructor createInstructor(String name, int age, Sex sex, BigDecimal salary){
        Instructor instructor = new Instructor();
        instructor.setName(name);
        instructor.setAge(age);
        instructor.setSex(sex);
        instructor.setSalary(salary);
        return instructor;
    }
    public void addBranchToInstructor(Instructor instructor, Branch branch){

        List<Branch> branches = new ArrayList<>();

        if(instructor.getBranchList()!=null){
            branches = instructor.getBranchList();
        }
        
        branches.add(branch);
        instructor.setBranchList(branches);
    }
}
