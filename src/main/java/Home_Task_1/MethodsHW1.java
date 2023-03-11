package Home_Task_1;
import MyLibb.MyLib;

import java.util.SortedMap;

public class MethodsHW1 {

    public static void main(String [] args){
        System.out.println(isSumBetween10And20(5, 15));
        System.out.println(isSumBetween10And20(7, 15));
        System.out.println(isPositive(5));
        System.out.println(isPositive(-3));
        printString("abcd", 5);
        System.out.println(isLeapYear(MyLib.inputInteger("Input year")));
        int [] testArr = createArray(MyLib.inputInteger("Input array Length"),
                                     MyLib.inputInteger("Input init Value"));
        for (int elements : testArr) System.out.printf("%d ", elements);

        }



    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно),
     * если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        boolean resFirst = sum <= 20 && sum >= 10 ? true : false;
        return resFirst;
    }
    private static boolean isPositive (int x){
        boolean resSecond = x >= 0 ? true : false;
        return  resSecond;
    }
    private static void printString(String text, int times){
        String res = "";
//        res = text.repeat(times);
        for (int i = 1; i <= times; i++){
            res += text;
        }
        System.out.println(res);
    }
    private static boolean isLeapYear(int year){
        boolean res = year % 4 != 0 || (year % 100 == 0 && year % 400 != 0) ? false : true;
        return res;
    }
    private static int [] createArray (int length, int initValue){
        int [] arr = new int[length];
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            arr[i] = initValue;
        }
        return arr;
    }



}
