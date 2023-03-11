package Practice_1;

public class Task_1 {
/// Дан массив из двоичных чисел [1, 1, 0, 1, 1, 1]
//  вывести максимальное количество полряд идущиих 1

    public static void main (String [] args){
        int [] arr = {1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1};
        int count = 0;
        int max = 0;
        for( int i = arr.length -1; i >= 0; i--) {
            int a = arr[i];
            if (a == 1){
                count++;
                if (count > max) max = count;
            }else if (a == 0) count = 0;
        }
        System.out.println(max);
    }
}
