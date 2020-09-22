package cn.scoreanalysis.system.model;

public class Score {
    private Integer id;

    private Integer studentid;

    private Integer courseid;

    private Float usualscore;

    private Float middlescore;

    private Float endscore;

    private Float finalscore;

    private Float supplementaryscore;

    private Float rebuildscore;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Float getUsualscore() {
        return usualscore;
    }

    public void setUsualscore(Float usualscore) {
        this.usualscore = usualscore;
    }

    public Float getMiddlescore() {
        return middlescore;
    }

    public void setMiddlescore(Float middlescore) {
        this.middlescore = middlescore;
    }

    public Float getEndscore() {
        return endscore;
    }

    public void setEndscore(Float endscore) {
        this.endscore = endscore;
    }

    public Float getFinalscore() {
        return finalscore;
    }

    public void setFinalscore(Float finalscore) {
        this.finalscore = finalscore;
    }

    public Float getSupplementaryscore() {
        return supplementaryscore;
    }

    public void setSupplementaryscore(Float supplementaryscore) {
        this.supplementaryscore = supplementaryscore;
    }

    public Float getRebuildscore() {
        return rebuildscore;
    }

    public void setRebuildscore(Float rebuildscore) {
        this.rebuildscore = rebuildscore;
    }
}