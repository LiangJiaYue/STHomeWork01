/**
  * @Author: Liang Jiayue
  * @Description:学生实体类
  * @Date: 16:21 2020/4/23
 */
public class Student {

    /**
     * 学生学号
     */
    public int id;

    /**
     * 学生姓名
     */
    public String name;

    /**
     * 学生生日
     */
    public String birDate;

    /**
     * 学生性别
     */
    public String gender;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirDate() {
        return birDate;
    }

    public void setBirDate(String birDate) {
        this.birDate = birDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birDate='" + birDate + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
