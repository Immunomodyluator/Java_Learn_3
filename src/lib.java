import java.util.ArrayList;
public class lib {
    //Печать списка
    public static void PrintArray(ArrayList<Integer> arr){
        for(int element: arr) {
            System.out.printf("%d, ", element);
        }
        System.out.println();
    }
    //Заполнение списка случайными целыми числами
    public static ArrayList<Integer> FillRandomArray(int n) {
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add((int)(Math.random()*100));
        }
        return list;
    }
}