package service;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class DanceCourseService {

    public DanceCourse createDanceCourse(String name, String address, String founder,
                                         String taxNumber, String taxOffice) {
        DanceCourse danceCourse = new DanceCourse();
        danceCourse.setName(name);
        danceCourse.setAddress(address);
        danceCourse.setFounder(founder);
        danceCourse.setTaxNumber(taxNumber);
        danceCourse.setTaxOffice(taxOffice);
        return danceCourse;
    }

    public void addBankAccountToDanceCourse(DanceCourse danceCourse, BankAccount bankAccount) {
        if (danceCourse.getBankAccountList() != null) {
            danceCourse.getBankAccountList().add(bankAccount);
        } else {
            List<BankAccount> bankAccountList = new ArrayList<>();
            bankAccountList.add(bankAccount);
            danceCourse.setBankAccountList(bankAccountList);
        }
    }

    public void addPaymentMovementToDanceCourse(DanceCourse danceCourse, PaymentMovement paymentMovement) {
        if (danceCourse.getPaymentMovementList() != null) {
            danceCourse.getPaymentMovementList().add(paymentMovement);
        } else {
            List<PaymentMovement> paymentMovements = new ArrayList<>();
            paymentMovements.add(paymentMovement);
            danceCourse.setPaymentMovementList(paymentMovements);
        }
    }

    public void addInstructorToDanceCourse(DanceCourse danceCourse, Instructor instructor) {
        if (danceCourse.getInstructorList() != null) {
            danceCourse.getInstructorList().add(instructor);
        } else {
            List<Instructor> instructorList = new ArrayList<>();
            instructorList.add(instructor);
            danceCourse.setInstructorList(instructorList);
        }
    }

    public void addStudentToDanceCourse(DanceCourse danceCourse, Student student) {
        if (danceCourse.getStudentList() != null) {
            danceCourse.getStudentList().add(student);
        } else {
            List<Student> students = new ArrayList<>();
            students.add(student);
            danceCourse.setStudentList(students);
        }
    }

}
