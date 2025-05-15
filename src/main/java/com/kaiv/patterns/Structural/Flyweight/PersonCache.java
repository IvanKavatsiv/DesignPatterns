package com.kaiv.patterns.Structural.Flyweight;

import java.util.WeakHashMap;

public class PersonCache {

    WeakHashMap<String, StudentUnivercityInfo> stringStudentUnivercityInfoMap = new WeakHashMap<>();

    public StudentUnivercityInfo getStudentUnivercityInfo(String name) {

        StudentUnivercityInfo studentUnivercityInfo = stringStudentUnivercityInfoMap.get(name);

        if (studentUnivercityInfo == null) {

            studentUnivercityInfo = createStudentInfo(name);
            stringStudentUnivercityInfoMap.put(name, studentUnivercityInfo);

        }

        return studentUnivercityInfo;

    }

    private StudentUnivercityInfo createStudentInfo(String faculty) {

        switch (faculty) {

            case "informatics":
                return new StudentUnivercityInfo(faculty, "New York", "address 1");

            case "management":
                return new StudentUnivercityInfo(faculty, "Los Angeles", "address 2");

            default:
                throw new IllegalArgumentException("no faculty");

        }
    }
}
