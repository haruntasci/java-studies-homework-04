package service;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class LectureService {


    public Lecture createLecture(String name, Instructor instructor, Branch branch, int capacity) {
        Lecture lecture = new Lecture();
        lecture.setName(name);
        lecture.setInstructor(instructor);
        lecture.setBranch(branch);
        lecture.setCapacity(capacity);
        return lecture;
    }

    public void addLectureScheduleTimeToLecture(Lecture lecture, LectureScheduleTime lectureScheduleTime){
        if(lecture.getLectureScheduleTimeList()==null){
            List<LectureScheduleTime> scheduleTimes = new ArrayList<>();
            scheduleTimes.add(lectureScheduleTime);
            lecture.setLectureScheduleTimeList(scheduleTimes);
        }
        else{
            lecture.getLectureScheduleTimeList().add(lectureScheduleTime);
        }
    }

    public void addStudentToLecture(Lecture lecture, Student student){
        if(lecture.getStudentList()==null){
            List<Student> students = new ArrayList<>();
            students.add(student);
            lecture.setStudentList(students);
        }
        else{
            lecture.getStudentList().add(student);
        }
    }

}
