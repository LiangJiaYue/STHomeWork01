import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 15:52 2020/4/27
 */
public class SMTest {
    public static void main(String[] args) throws IOException {

        StudentManager studentManager = new StudentManager();
        ArrayList<Student> student=new ArrayList<Student>();
        while(true){
            System.out.println("请选择操作：");
            System.out.println("******************");
            System.out.println("**    1、插入    **");
            System.out.println("**    2、删除    **");
            System.out.println("**    3、查找    **");
            System.out.println("**    4、遍历    **");
            System.out.println("**    5、修改    **");
            System.out.println("**    6、退出    **");
            System.out.println("******************");

            Scanner scanner=new Scanner(System.in);
            int num=scanner.nextInt();
            switch(num) {
                case 1://插入学生信息
                    StudentManager.insertStudent(student,"student.txt");
                    student.clear();
                    break;
                case 2://删除学生信息
                    StudentManager.deleteStudent(student,"student.txt");
                    student.clear();
                    break;
                case 3://查找学生信息
                    StudentManager.findStudent(student,"student.txt");
                    student.clear();
                    break;
                case 4://遍历学生信息
                    StudentManager.ListStudent(student,"student.txt");
                    student.clear();
                    break;
                case 5://修改学生信息
                    studentManager.updateStudent(student,"student.txt");
                    student.clear();
                    break;
                case 6://回主菜单
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误！请重新输入!");
                }
            }
        }
}
