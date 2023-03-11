package Home_Task_1;
/** 2.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти
 *  по нему циклом, и числа меньшие 6 умножить на 2;
 **/
public class HomeTaskSecond {
    public static void main(String [] args){
        int [] arrOld = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int size = arrOld.length;
        for (int elements : arrOld) System.out.printf("%d ", elements);
        System.out.println();
        for (int i = 0; i < size; i++){
            if (arrOld[i] < 6) arrOld[i] *= 2;
        }
        for (int elements : arrOld) System.out.printf("%d ", elements);
    }
}
