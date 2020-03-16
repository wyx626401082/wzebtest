import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class java_test3 {
    public static void main(String[] args) {
        /**
         * 建立两个list保持学生信息
         */
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();
        list1.add(new Student("张三", 18, 80, "1班"));
        list1.add(new Student("李四", 19, 100, "1班"));
        list1.add(new Student("王五", 17, 59, "1班"));
        list2.add(new Student("赵六", 18, 85, "2班"));
        list2.add(new Student("刘七", 19, 93, "2班"));
        list2.add(new Student("孙八", 17, 55, "2班"));
        /**
         * 整合两个list学生信息成一个新的list
         */
        List<Student> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);

        /**
         * 按照分数给出学生排名信息
         */
        List<Student> temp = new ArrayList<>();
        /**
         * 冒泡排序法
         * if判断出成绩较高的学生
         */
        for (int i = 0; i < list3.size(); i++) {
            for (int j = 0; j < list3.size() - i - 1; j++) {
                if (list3.get(j).getGrade() < list3.get(j + 1).getGrade()) {
                    /**
                     * 调换顺序
                     */
                    temp.add(list3.get(j));
                    list3.set(j, list3.get(j + 1));
                    list3.set(j + 1, temp.get(0));
                    temp.remove(0);
                }
            }
        }

        for (Student element : list3) {
            System.out.println(element.getName() + "\t" + element.getAge() + "\t" + element.getGrade() + "\t" + element.getStudentClass());
        }

        /**
         * 输出不及格学生
         */
        System.out.println("不及格学生信息如下：");
        for (Student element : list3) {
            if (element.getGrade() < 60) {
                System.out.println(element.getName() + "\t" + element.getAge() + "\t" + element.getGrade() + "\t" + element.getStudentClass());
            }
        }

        /**
         * 查找张三信息
         */
        System.out.println("查找的学生信息如下：");
        for (Student element : list3) {
            if (element.getName() == "张三") {
                System.out.println(element.getName() + "\t" + element.getAge() + "\t" + element.getGrade() + "\t" + element.getStudentClass());
            }
        }

        /**
         * 从list剔除年龄大于18岁的学生信息
         */
        System.out.println("剔除年龄大于18岁的学生信息后如下：");
        /**
         * 利用迭代器剔除list中的学生信息
         */
        Iterator<Student> it = list3.iterator();
        while(it.hasNext()) {
            Student item = it.next();
            if (item.getAge() > 18) {
                it.remove();
            }
            else {
                System.out.println(item.getName()+"\t"+item.getAge()+"\t"+item.getGrade()+"\t"+item.getStudentClass());
            }
        }
    }
}
