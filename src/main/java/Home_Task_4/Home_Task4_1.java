package Home_Task_4;

import java.io.File;
import java.util.*;

/** Реализовать консольное приложение, которое:
    1. Принимает от пользователя строку вида text~num
    2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
    4. Если введено print~num, выводит строку из позиции num в связном списке.
    5. Если введено exit, завершаем программу
 *Пример:   [string~4, num~3]
 *          print~3 num
 * print~4 - > string
 * my_value~1 -> [my_value~1, string~4, num~3]
 * print~1 -> my_value
 */
public class Home_Task4_1 {
    public static void main(String[] args) throws Exception{
        List<String> list_1 = new ArrayList<>();
        boolean flag = true;
        while (flag) {

            System.out.print("Choose Option 1 - 4:" +
                    "\n1. Enter data." +
                    "\n2. Print data." +
                    "\n3. Exit.\n");
            String input = inputString();
            switch (input) {
                case "1":
                    System.out.println("Enter a word followed by tilda sign as \"~\"");
                    fillList(list_1);
                    System.out.println("opt 1");
                    break;
                case "2":
                    System.out.println( "Enter command \"print\" followed by \"~\" and number of" +
                                        "element");
                    printFunc(list_1);
                    System.out.println("opt 2");
                    break;
                case "3":
                    flag = false;
                    break;
            }

        }
    }

    public static String inputString() {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        return text;
    }

    public static List<String> fillList(List<String> listStr) throws Exception {

        while (true) {
            int size = listStr.size();
            String txt = inputString();
            if (txt == "") break;
            try {
                String[] arr = txt.split("~");
                int position = Integer.parseInt(arr[1]);
                try {
                    listStr.set(position, Arrays.toString(arr));
                } catch (IndexOutOfBoundsException e) {
                    for (int i = 0; i <= position - size; i++) {
                        if (i != position - size) listStr.add(null);
                        else listStr.add(Arrays.toString(arr));
                    }
                }
            }catch (NumberFormatException e){
                System.out.println("You entered wrong format -> " + txt + ". Try again.");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("You entered wrong separator -> " + txt + ". Try again.");
            }
        }
        return listStr;
    }

    public static void printFunc(List<String> listPrint){
        String printStr = inputString();
        try{
            String [] printArr = printStr.split("~");
            if (printArr[0].equalsIgnoreCase("print")) {
                for (int i = 0; i < listPrint.size(); i++) {
                    if (i == Integer.parseInt(printArr[1])) {
                        if (listPrint.get(i) == null) {
                            System.out.println("This cell is empty. Try again.");
                        } else {
                            String[] arrPrint = listPrint.get(i).split(", ");
                            System.out.println(arrPrint[0].substring(1));
                        }
                    }
                }
            }else {
                System.out.println( "You should enter \"print~\" and element number. " +
                                    "Check you input \"" + printArr[0] + "\". Try again");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You entered wrong separator -> " + printStr + ". Try again.");
        }catch (NumberFormatException e){
            System.out.println("You entered wrong format -> " + printStr + ". Try again.");
        }

    }

}



