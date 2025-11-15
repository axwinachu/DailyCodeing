import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class ArrayList2{
    public static void main(String[] args) {
        Collection<Integer> li=new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.addAll(li);
        System.out.println(li);
    }
}