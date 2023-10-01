public class BoxTwo<T,S>{
    private T first;
    private S second;


    public void add(T firstVal,  S secondVal){
        first =  firstVal;
        second =  secondVal;
    }


    public T getFirst() {
        return this.first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public S getSecond() {
        return this.second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

}
