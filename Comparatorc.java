import java.util.*;
public class Comparatorc {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.add(20);
        li.add(34);
        li.add(12);
        li.add(24);
        //Anonymus class
        Comparator<Integer> com=new Comparator<>() {
            public int compare(Integer a,Integer b){
                if(a<b){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        //functional interface
        Comparator<Integer> com2=(Integer a,Integer b)->a<b?-1:1;
        Collections.sort(li,com);
        System.out.println(li);
    }
}
