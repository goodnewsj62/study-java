public class Main{
    public static void main(String[] args) {
        Box<Integer> intergerBox =  new Box<Integer>(10);
        Box<String> stringBox =  new Box<String>("text");
        

        System.out.printf("this box is of type integer: %d\n", intergerBox.getData());
        System.out.printf("this box is of type string:  %s\n",  stringBox.getData());
        System.out.printf("i am just printing out the class name:  %s\n",  stringBox.getClass().getName().toUpperCase());


        BoxTwo<Integer, String> box = new BoxTwo<Integer, String>();
        box.add(Integer.valueOf(10),"Hello World");
        System.out.printf("Integer Value :%d\n", box.getFirst());
        System.out.printf("String Value :%s\n", box.getSecond());

        Pair<String, Integer> pair = new Pair<String, Integer>();
        pair.addKeyValue("1", Integer.valueOf(10));
        System.out.printf("(Pair)Integer Value :%d\n", pair.getValue("1"));

        CustomList<BoxTwo<Integer, String>> list = new CustomList<BoxTwo<Integer, String>>();
        list.addItem(box);
        System.out.printf("(CustomList)Integer Value :%d\n", list.getItem(0).getFirst());
    }
}