public class Box<T> {
    private T data;

    public  Box(T type){
        this.data =  type;
    }

    public T getData(){
        return data;
    }
}
