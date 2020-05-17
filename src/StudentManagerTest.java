import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: Liang Jiayue
 * @Date: 15:52 2020/4/27
 */

public class StudentManagerTest {
    public static void main(String[] args){
        ArrayList<Student> student = new ArrayList<>();
        try {
            while (true) {
                System.out.println("请选择操作：");
                System.out.println("******************");
                System.out.println("**    1、插入    **");
                System.out.println("**    2、删除    **");
                System.out.println("**    3、查找    **");
                System.out.println("**    4、遍历    **");
                System.out.println("**    5、修改    **");
                System.out.println("**    6、退出    **");
                System.out.println("******************");

                Scanner scanner = new Scanner(System.in);
                int num = scanner.nextInt();
                switch (num) {
                    //插入学生信息
                    case 1:
                        StudentManager.insertStudent(student, "student.txt");
                        student.clear();
                        break;
                    //删除学生信息
                    case 2:
                        StudentManager.deleteStudent(student, "student.txt");
                        student.clear();
                        break;
                    //查找学生信息
                    case 3:
                        StudentManager.findStudent(student, "student.txt");
                        student.clear();
                        break;
                    //遍历学生信息
                    case 4:
                        StudentManager.listStudent(student, "student.txt");
                        student.clear();
                        break;
                    //修改学生信息
                    case 5:
                        StudentManager.updateStudent(student, "student.txt");
                        student.clear();
                        break;
                    //回主菜单
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("输入有误！请重新输入!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
