/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author fanyuting
 */
public class Student {

    int studentID;
    String name;
    String program;
    String gender;
    int age;
    String nationality;
    String url;

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setNationality(String na){
        this.nationality=na;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getStudetID() {
        return this.studentID;
    }

    public String getName() {
        return this.name;
    }

    public String getProgram() {
        return this.program;
    }

    public String getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }

    public String getNationality() {
        return this.nationality;
    }
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
