package common;

/**********
 * 作业特征：课程代码，作业来源
 */
public class Assignment extends Goal{
    private String courseCode;
    private String source;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
