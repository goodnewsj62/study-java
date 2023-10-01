import java.util.ArrayList;
import java.util.List;

public class CustomList <E>{
    private List<E> list=  new  ArrayList<E>();

    public void addItem(E item){
        list.add(item);
    }

    public E getItem(int index){
        return list.get(index);
    }
}
