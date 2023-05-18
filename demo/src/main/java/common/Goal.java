package common;

/**********
 * 目标的基本属性：创建时间，完成情况（百分比），目标名称，目标描述，结束日期，状态（正在进行，完成，未开始）
 * 可以继承的类：课程、书本、作业、任务（pre、essay）
 */
public class Goal {
    private String setUpTime;
    private double finish;
    private String name;
    private String description;
    private String finishTime;
    private String status;
    private GoalType type;
    public void Goal(String setUpTime, double finish, String name, String description, String finishTime, String status,
                     GoalType type){
        this.setUpTime = setUpTime;
        this.finish = finish;
        this.name = name;
        this.description = description;
        this.finishTime = finishTime;
        this.status = status;
        this.type = type;
    }


    public double getFinish() {
        return finish;
    }

    public void setFinish(double finish) {
        this.finish = finish;
    }

    public String getSetUpTime() {
        return setUpTime;
    }

    public void setSetUpTime(String setUpTime) {
        this.setUpTime = setUpTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setType(GoalType type) {
        this.type = type;
    }

    public GoalType getType() {
        return type;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
