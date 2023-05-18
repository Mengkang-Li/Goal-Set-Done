package common;

/**********
 * 课程的特有属性是：来源，课程节数，课程材料，课程类型
 */
public class Course extends Goal{
    private int numberOfLectures;
    private String source;
    private String material;
    private String courseType;
    private int finishLectures;

    public int getNumberOfLectures() {
        return numberOfLectures;
    }

    public void setNumberOfLectures(int numberOfLectures) {
        this.numberOfLectures = numberOfLectures;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public int getFinishLectures() {
        return finishLectures;
    }

    public void setFinishLectures(int finishLectures) {
        this.finishLectures = finishLectures;
    }
}
