package Home_Task_1;
import java.util.Random;
/**
 * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами
 * (можно только одну из диагоналей, если обе сложно). Определить элементы
 * одной из диагоналей можно по следующему принципу: индексы таких элементов
 * равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * * Также заполнить элементы побочной диагонали
 **/
public class HomeTaskThird {
    public static void main (String [] args){
        int [][] oldArr = new int[4][4];
        int rawSize = oldArr.length;
        Random rand = new Random();
        for (int i = 0; i < rawSize; i++){
            for (int j = 0; j < oldArr[i].length; j++){
                oldArr[i][j] = rand.nextInt(10);
            }
        }

        for (int k = 0; k < rawSize; k++) {
            for (int l = 0; l < oldArr[k].length; l++) {
                System.out.printf("%d ", oldArr[k][l]);
            }
            System.out.println();
        }
        System.out.println();
        int shift = 1;
        for (int q = 0; q < rawSize; q++){
            for (int t = 0; t < oldArr.length; t++){
                if (q == t) oldArr[q][t] = 1;
                else if (t == oldArr.length - shift) oldArr[q][t] = 1;
            }
            shift ++;
        }
        for (int k = 0; k < rawSize; k++) {
            for (int l = 0; l < oldArr[k].length; l++) {
                System.out.printf("%d ", oldArr[k][l]);
            }
            System.out.println();
        }
    }
}
