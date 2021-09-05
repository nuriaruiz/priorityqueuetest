package com.nuria;

import java.util.Comparator;

public class ComparatorStudents implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        // Compare cgpa
        if (o1.getCgpa()<o2.getCgpa()){
            return 1;
        }else if (o1.getCgpa()>o2.getCgpa()){
            return -1;
        }else{
            // compare names
            if (o1.getName().compareTo(o2.getName()) > 0){
                return 1;
            }else if (o1.getName().compareTo(o2.getName()) < 0){
                return -1;
            }else{
                // compare Ids
                return o2.getId().compareTo(o1.getId());
            }
        }
    }
}
