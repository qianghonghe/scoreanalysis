package cn.scoreanalysis.system.model;

public class Teacher {
    private Integer id;

    private String teachernumber;

    private String teachername;

    private Integer teacherage;

    private String teachergender;

    private String teacheridentitycard;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeachernumber() {
        return teachernumber;
    }

    public void setTeachernumber(String teachernumber) {
        this.teachernumber = teachernumber == null ? null : teachernumber.trim();
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    public Integer getTeacherage() {
        return teacherage;
    }

    public void setTeacherage(Integer teacherage) {
        this.teacherage = teacherage;
    }

    public String getTeachergender() {
        return teachergender;
    }

    public void setTeachergender(String teachergender) {
        this.teachergender = teachergender == null ? null : teachergender.trim();
    }

    public String getTeacheridentitycard() {
        return teacheridentitycard;
    }

    public void setTeacheridentitycard(String teacheridentitycard) {
        this.teacheridentitycard = teacheridentitycard == null ? null : teacheridentitycard.trim();
    }
}