package Data_Structures.Piority_Queue;

import java.util.*;

class Priorities{
    List<Student> getStudents(List<String> events){
        PriorityQueue<Student> students = new PriorityQueue<>();
        for (String event : events) {
            var eventSplit = event.split(" ");
            if (eventSplit[0].equals("ENTER"))
                students.add(new Student(Integer.parseInt(eventSplit[3]), eventSplit[1], Double.parseDouble(eventSplit[2])));
            else
                students.poll();
        }

        List<Student> out = new ArrayList<>();
        for (var student: students) {
            out.add(student);
        }
        Collections.sort(out);
        return out;
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

    String getName(){
        return name;
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


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
