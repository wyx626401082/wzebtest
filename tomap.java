import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 利用Map完成练习1的习题
 */
public class tomap {
    public static void main(String[] args) {
        /**
         * 建立两个map保存学生信息
         */
        Map<Integer,Student> map1 = new HashMap<>();
        Map<Integer,Student> map2 = new HashMap<>();
        map1.put(0,new Student("张三", 18, 80, "1班"));
        map1.put(1,new Student("李四", 19, 100, "1班"));
        map1.put(2,new Student("王五", 17, 59, "1班"));
        map2.put(3,new Student("赵六", 18, 85, "2班"));
        map2.put(4,new Student("刘七", 19, 93, "2班"));
        map2.put(5,new Student("孙八", 17, 55, "2班"));

        /**
         * 整合两个map学生信息成一个新的map
         */
        Map<Integer,Student> map3 = new HashMap<>();
        map3.putAll(map1);
        map3.putAll(map2);

        /**
         * 按照分数给出学生排名信息
         * 冒泡排序
         * if判断出成绩较高的学生
         */
        Map<Integer,Student> temp = new HashMap<>();
        for (int i = 0; i < map3.size(); i++) {
            for (int j = 0; j < map3.size() - i - 1; j++) {
                if (map3.get(j).getGrade() < map3.get(j + 1).getGrade()) {
                    /**
                     * 调换顺序
                     */
                    temp.put(0,map3.get(j));
                    map3.put(j,map3.get(j+1));
                    map3.put(j+1,temp.get(0));
                    temp.remove(0);
                }
            }
        }
        System.out.println("学生信息如下：");
        for(Map.Entry<Integer,Student> entry : map3.entrySet()){
            System.out.println(entry.getValue().getName()+"\t"+entry.getValue().getAge()+"\t"+entry.getValue().getGrade()+"\t"+entry.getValue().getStudentClass());
        }

        /**
         * 输出不及格学生
         */
        System.out.println("不及格学生信息如下：");
        for (Map.Entry<Integer,Student> entry : map3.entrySet()) {
            if (entry.getValue().getGrade() < 60) {
                System.out.println(entry.getValue().getName()+"\t"+entry.getValue().getAge()+"\t"+entry.getValue().getGrade()+"\t"+entry.getValue().getStudentClass());
            }
        }

        /**
         * 查找张三信息
         */
        System.out.println("查找的学生信息如下：");
        for (Map.Entry<Integer,Student> entry : map3.entrySet()) {
            if (entry.getValue().getName() == "张三") {
                System.out.println(entry.getValue().getName()+"\t"+entry.getValue().getAge()+"\t"+entry.getValue().getGrade()+"\t"+entry.getValue().getStudentClass());
            }
        }

        /**
         * 从list剔除年龄大于18岁的学生信息
         */
        System.out.println("剔除年龄大于18岁的学生信息后如下：");
        /**
         * 利用迭代器剔除以及打印相关学生信息
         */
        for(Iterator<Map.Entry<Integer,Student>> it = map3.entrySet().iterator();it.hasNext();) {
            Map.Entry<Integer,Student> item = it.next();
            if (item.getValue().getAge() > 18) {
                it.remove();
            }
            else {
                System.out.println(item.getValue().getName()+"\t"+item.getValue().getAge()+"\t"+item.getValue().getGrade()+"\t"+item.getValue().getStudentClass());
            }
        }
    }
}
