/**
 * 学生信息实体类
 */
public class Student {
    /**
     * 学生姓名
     */
    private String name;
    /**
     * 学生年龄
     */
    private int age;
    /**
     * 学生成绩
     */
    private int grade;
    /**
     * 学生班号
     */
    private String studentClass;

    public Student(){};

    /**
     * 构造学生名字，年龄，成绩，班号
     * @param name 名字
     * @param age 年龄
     * @param grade 成绩
     * @param studentClass 班号
     */
    public Student(String name, int age, int grade, String studentClass) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.studentClass = studentClass;
    }

    /**
     * 获取学生名字
     * @return 学生名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置学生名字
     * @param name 名字
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 获取学生年龄
     * @return 学生年龄
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置学生年龄
     * @param age 年龄
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * 获取学生成绩
     * @return 学生成绩
     */
    public int getGrade() {
        return grade;
    }

    /**
     * 设置学生成绩
     * @param grade 成绩
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }
    /**
     * 获取学生班号
     * @return 学生班号
     */
    public String getStudentClass() {
        return studentClass;
    }

    /**
     * 设置学生班号
     * @param studentClass 班号
     */
    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    /**
     * 设置学生信息
     * @param name 名字
     * @param age 年龄
     * @param grade 成绩
     * @param studentClass 班号
     */
    public void setData(String name, int age, int grade, String studentClass) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.studentClass = studentClass;
    }
}
