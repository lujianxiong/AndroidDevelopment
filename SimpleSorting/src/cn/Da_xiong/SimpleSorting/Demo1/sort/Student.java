package cn.Da_xiong.algorithm.Demo1.sort;
//Comparable接口  对对象进行排序（根据属性）
//1.定义一个学生类Student ,具有年龄age和姓名username两个属性,并通过Comparable接口提供比较规则;
//定义两个属性，使用构造器添加getter函数、setter函数，toString函数，=
//implements一个comparable接口,重写一个方法（根据年龄进行比较）
public class Student implements Comparable<Student>{
    private String username;
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //重写toString方法
    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    //重写compareTo方法
    @Override
    public int compareTo(Student o) {
        return this.getAge()-o.getAge();
    }
}
