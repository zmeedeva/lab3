package controller;

import model.Faculty;
import model.Human;
import model.University;

import java.util.ArrayList;
import java.util.List;

public class UniversityCreator {


    public   University createUniversity(String name, int countOfFaculties, Human rector) {
        University university = new University();
        FacultyCreator facultyCreator = new FacultyCreator();
        university.setName(name);
        university.setHead(rector);
        List<Faculty> faculties = new ArrayList<>();
        for (int i = 1; i < countOfFaculties; i++) {
            faculties.add(facultyCreator.createTypicalFaculty());
        }
        university.setFaculties(faculties);

        return university;

    }

    public  University createTypicalUniversity() {
        HumanCreator humanCreator = new HumanCreator();
        University university = createUniversity("NTU DP", 3, humanCreator.createTypicalHuman());

        return university;
    }

}
