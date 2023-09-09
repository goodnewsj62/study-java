import java.util.Arrays;

public class UpdatingArrays {
    public static  void main(String[] args){
        String[]  menu =  {"Espresso", "Iced Coffee",  "Macchiato"};
        menu[2] = "Latte";
        System.out.println(Arrays.toString(menu));

        for(String arr: menu){
            System.out.println(arr);
        }

        String[] stafffLastYear =  {"Tommy","Joel",  "Ellie"};

        String[]  staffThisYear =  Arrays.copyOf(menu, (menu.length +  1));



        System.out.println(Arrays.toString(stafffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}
