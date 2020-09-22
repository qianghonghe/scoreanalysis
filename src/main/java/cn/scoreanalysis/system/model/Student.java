package cn.scoreanalysis.system.model;

import java.util.Date;

public class Student {
    private Integer id;

    private Integer classid;

    private Integer professionid;

    private Integer gradeid;

    private String studentnumber;

    private String studentname;

    private Integer studentage;

    private String studentgender;

    private Date enrollmentdate;

    private String studentidentitycard;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Integer getProfessionid() {
        return professionid;
    }

    public void setProfessionid(Integer professionid) {
        this.professionid = professionid;
    }

    public Integer getGradeid() {
        return gradeid;
    }

    public void setGradeid(Integer gradeid) {
        this.gradeid = gradeid;
    }

    public String getStudentnumber() {
        return studentnumber;
    }

    public void setStudentnumber(String studentnumber) {
        this.studentnumber = studentnumber == null ? null : studentnumber.trim();
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public Integer getStudentage() {
        return studentage;
    }

    public void setStudentage(Integer studentage) {
        this.studentage = studentage;
    }

    public String getStudentgender() {
        return studentgender;
    }

    public void setStudentgender(String studentgender) {
        this.studentgender = studentgender == null ? null : studentgender.trim();
    }

    public Date getEnrollmentdate() {
        return enrollmentdate;
    }

    public void setEnrollmentdate(Date enrollmentdate) {
        this.enrollmentdate = enrollmentdate;
    }

    public String getStudentidentitycard() {
        return studentidentitycard;
    }

    public void setStudentidentitycard(String studentidentitycard) {
        this.studentidentitycard = studentidentitycard == null ? null : studentidentitycard.trim();
    }
}