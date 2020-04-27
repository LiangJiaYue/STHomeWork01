import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: Liang Jiayue
 * @Description:
 * @Date: 15:25 2020/4/27
 */
public class StudentManager {


    //文件写入
    public static void Writer(ArrayList<Student> student,String textName) throws IOException{
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(textName));
        for(int i=0;i<student.size();i++) {
            Student s1=student.get(i);
            StringBuilder stringBuilder=new StringBuilder();
            stringBuilder.append(s1.getId()).append(",").append(s1.getName()).append(",").append(s1.getBirDate()).append(",").append(s1.getGender());
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();

    }


    //文件读取
    public static void Reader(ArrayList<Student> student,String textName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(textName));
        String ch;
        while((ch=bufferedReader.readLine())!=null){
            String[] studentData=ch.split(",");
            Student s = new Student();
            s.setId(Integer.parseInt(studentData[0]));
            s.setName(studentData[1]);
            s.setBirDate(studentData[2]);
            s.setGender(studentData[3]);
            student.add(s);
        }
        bufferedReader.close();
    }


    //遍历学生信息
    public static void ListStudent(ArrayList<Student> student, String string) throws IOException {
        Reader(student,"C:\\Users\\Liangjy\\Desktop\\study\\大三下\\软件质量保证与测试\\2017012546-梁佳悦-1\\MyCode\\STHomeWork01\\src\\student.txt");
        if(student.size()==0)
            System.out.println("对不起，没有学生信息");
        else{
            for(int i=0;i<student.size();i++) {
                Student s=student.get(i);
                System.out.println("学号："+s.getId()+"  姓名："+s.getName()+"  生日："+s.getBirDate()+"  性别："+s.getGender());
            }
        }

    }

    //新增学生信息
    public static void insertStudent(ArrayList<Student> student, String textName) throws IOException {
        Reader(student, "C:\\Users\\Liangjy\\Desktop\\study\\大三下\\软件质量保证与测试\\2017012546-梁佳悦-1\\MyCode\\STHomeWork01\\src\\student.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生学号：");
        int id = Integer.valueOf(scanner.nextLine());
        System.out.println("请输入学生姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入学生生日：");
        String birDate = scanner.nextLine();
        System.out.println("请输入学生性别：");
        String gender = scanner.nextLine();
        Student s = new Student();
        s.setId(id);
        s.setName(name);
        s.setBirDate(birDate);
        s.setGender(gender);
        student.add(s);
        Writer(student, "C:\\Users\\Liangjy\\Desktop\\study\\大三下\\软件质量保证与测试\\2017012546-梁佳悦-1\\MyCode\\STHomeWork01\\src\\student.txt");
        System.out.println("新增学生成功！");
    }

    //根据学生学号删除学生信息
    public static void deleteStudent(ArrayList<Student> student,String textName) throws IOException{
        Reader(student,"C:\\Users\\Liangjy\\Desktop\\study\\大三下\\软件质量保证与测试\\2017012546-梁佳悦-1\\MyCode\\STHomeWork01\\src\\student.txt");
        System.out.println("请输入您要删除的学生学号：");
        Scanner scanner = new Scanner(System.in);
        int scannerId = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < student.size(); i++) {
            Student s = student.get(i);
            if (s.getId() == scannerId){
                index = i;
                break;
            }
        }
        if (index!=-1){
            student.remove(index);
            Writer(student,"C:\\Users\\Liangjy\\Desktop\\study\\大三下\\软件质量保证与测试\\2017012546-梁佳悦-1\\MyCode\\STHomeWork01\\src\\student.txt");
            System.out.println("删除学生信息成功！");
        }else {
            System.out.println("您输入的学生学号不存在！请重新输入！");
        }
    }

    //修改学生信息
    public static void updateStudent(ArrayList<Student> student,String textName) throws  IOException{
        Reader(student,"C:\\Users\\Liangjy\\Desktop\\study\\大三下\\软件质量保证与测试\\2017012546-梁佳悦-1\\MyCode\\STHomeWork01\\src\\student.txt");
        System.out.println("请输入您要修改的学生学号：");
        Scanner scanner = new Scanner(System.in);
        int index = -1;
        int upId = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < student.size(); i++) {
            Student s = student.get(i);
            if (upId == s.getId()){
                index = i;
                break;
            }
        }
        if (index==-1){
            System.out.println("您要修改的学生信息不存在！请重新输入！");
        }else {
            System.out.println("请输入学生学号：");
            int newId = Integer.valueOf(scanner.nextLine());
            System.out.println("请输入学生姓名：");
            String newName = scanner.nextLine();
            System.out.println("请输入学生生日：");
            String newBirDate = scanner.nextLine();
            System.out.println("请输入学生性别：");
            String newGender = scanner.nextLine();

            Student s = new Student();
            s.setId(newId);
            s.setName(newName);
            s.setBirDate(newBirDate);
            s.setGender(newGender);
            student.set(index,s);
            System.out.println("修改学生信息成功！");
            Writer(student,"C:\\Users\\Liangjy\\Desktop\\study\\大三下\\软件质量保证与测试\\2017012546-梁佳悦-1\\MyCode\\STHomeWork01\\src\\student.txt");

        }
    }

    //查找学生信息
    public static void findStudent(ArrayList<Student> student,String textName) throws IOException{
        Reader(student,"C:\\Users\\Liangjy\\Desktop\\study\\大三下\\软件质量保证与测试\\2017012546-梁佳悦-1\\MyCode\\STHomeWork01\\src\\student.txt");
        System.out.println("请输入您要查找的学生学号：");
        Scanner scanner = new Scanner(System.in);
        int index = -1;
        int upId = scanner.nextInt();
        for (int i = 0; i < student.size(); i++) {
            Student s = student.get(i);
            if (upId == s.getId()){
                index = i;
                break;
            }
        }
        if (index==-1){
            System.out.println("您查找的学生信息不存在！请重新输入！");
        }else {
            Student s = student.get(index);
            System.out.println("学号："+s.getId()+"  姓名："+s.getName()+"  生日："+s.getBirDate()+"  性别："+s.getGender());
        }
    }
}
