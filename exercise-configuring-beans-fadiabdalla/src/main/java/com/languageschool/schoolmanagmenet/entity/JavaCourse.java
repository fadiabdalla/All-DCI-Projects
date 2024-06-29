package com.languageschool.schoolmanagmenet.entity;

public class JavaCourse implements Course{
    @Override
    public String getCurriculum() {
        return "Java Curriculum";
    }

    @Override
    public String getSchedule() {
        return null;
    }
}
