package Data_Structures.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputs = Integer.parseInt(scan.nextLine());
        List<Student> list = new ArrayList<>();

        for (int i = 0; i < inputs; i++) {
            var in = scan.nextLine().split(" ");
            var stud = new Student(Integer.parseInt(in[0]), in[1], Double.parseDouble(in[2]));
            list.add(stud);
        }
        Collections.sort(list);
        list.forEach(item -> System.out.println(item.name));
    }
}

class Student implements Comparable<Student>{
    int id;
    String name;
    double cgpa;

    public Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public int compareTo(Student o) {
        int cgpaCmp = Double.compare(cgpa, o.cgpa);
        if(cgpaCmp!=0)return -cgpaCmp;

        int nameCmp = name.compareTo(o.name);
        if(nameCmp!=0)return nameCmp;

        return Integer.compare(id, o.id);
    }
}
