package Home_Task_1;
/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и
 * условия заменить 0 на 1, 1 на 0;
 **/
public class HomeTaskFirst {
    public static void main(String [] args){
       int [] arrOld = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
       int size = arrOld.length;
       for (int elements : arrOld) System.out.printf("%d ", elements);
        System.out.println();
       for (int i = 0; i < size; i++){
           if (arrOld[i] == 1) arrOld[i] = 0;
           else arrOld[i] = 1;
       }
        for (int elements : arrOld) System.out.printf("%d ", elements);
    }
}
