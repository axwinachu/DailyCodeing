import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{

    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "id:"+id+"name:"+name;
    }
    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
       return o.name.compareToIgnoreCase(this.name);
    }
    
}
public class Comparable1{
    public static void main(String[] args) {
        List<Student> li=new ArrayList<>(Arrays.asList(new Student(3,"aswin")
        ,new Student(1, "adhish"),new Student(0, "abhi")));
          Comparator com=new Comparator<Student>() {
        public int compare(Student o1, Student o2) {
            return o1.name.compareTo( o2.name);
                
        };
        
    };
    li.stream().forEach(obj->{
        System.out.println(obj);
    });
    Collections.sort(li);
     li.stream().forEach(obj->{
        System.out.println(obj);
    });
    }
  
}
