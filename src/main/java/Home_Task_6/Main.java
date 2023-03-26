package Home_Task_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Person per_0 = new Person("ks", "Sk", 40, "female");
        Person per_1 = new Person("KK", "SS", 35, "female");
        Person per_2 = new Person("GG", "KK", 18, "female");
        Person per_3 = new Person("JJ", "LL", 32, "male");
        Person per_4 = new Person("EE", "Ww", 15, "female");
        Person per_5 = new Person("Lg", "Kj", 29, "male");
        Person per_6 = new Person("GG", "Kl", 16, "male");
        Person per_7 = new Person("jk", "Ii", 18, "female");
        List<Person> prsnList =new ArrayList<>(Arrays.asList(per_0, per_1, per_2, per_3, per_4, per_5, per_6, per_7));
        System.out.println("Table_1");
        Person.printTable(prsnList);
        System.out.println("-".repeat(57));
        System.out.println("Table_2");
        Person.showPersonAbove(prsnList, 20);
        System.out.println("-".repeat(57));
        System.out.println("Table_3");
        Person.showMaleOnly(prsnList);
        System.out.println("-".repeat(57));
        System.out.println("Table_4");
        Person.groupGender(prsnList, "female");
        System.out.println("-".repeat(57));
        System.out.println("Table_5");
        Person.printTable(Person.ageSorted(prsnList));

        }
}
