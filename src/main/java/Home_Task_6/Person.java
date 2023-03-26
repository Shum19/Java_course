package Home_Task_6;

import java.util.*;

/**Создать класс Person.
 У класса должны быть поля:
 1. Имя (String)
 2. Фамилия (String)
 3. Возраст (продумать тип)
 4. Пол
 5*. Придумать свои собственные поля
 Для этого класса
 1. Реализовать методы toString, equals и hashCode.
 2*. Придумать собственные методы и реализовать их
 В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет
 и вывести их на экран.
 *
 */
public class Person implements Comparable<Person>{
    private String name;
    private String surname;
    private int age;
    private String gender;

    public Person(String name, String surname, int age, String gender){
        this.name = name.toUpperCase().charAt(0) + name.substring(1).toLowerCase();
        this.surname = surname.toUpperCase().charAt(0) + surname.substring(1).toLowerCase();;
        this.age = age;
        this.gender = gender.toLowerCase();
    }


    public String getName() {
        return name;
    }
    public String getSurname(){
        return surname;
    }

    public int getAge() {
        return age;
    }
    public String getGender(){
        return gender;
    }

    @Override
    public String toString(){
        String args = name + surname + age + gender;
        return args.format("Name: %s, Surname: %s \nAge: %d \nGander: %s", name, surname, age, gender);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Person)) return false;
        Person anotherPer = (Person) obj;
        if (Objects.equals(name, anotherPer.name) && age == anotherPer.age ){
            if((Objects.equals(surname, anotherPer. surname))
                    && Objects.equals(gender, anotherPer.gender)) return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, gender);
    }

    @Override
    public int compareTo(Person o) {
        if (age < o.age) return -1;
        else if (age >= o.age) return 1;
        return 0;
    }

    public static void printTable(List<Person> listPerson){
        String headName = String.format("|%-20s|","NAME");
        String headSurname = String.format("%-20s|", "SURNAME");
        String headAge= String.format("%-5s|", "AGE");
        String headGender= String.format("%-7s|\n", "GENDER");
        String rawSepar = "-".repeat(20);
        System.out.print(   headName + headSurname + headAge + headGender +
                "-".repeat(21) + "|"+"-".repeat(20) + '|' +
                "-".repeat(5) + "|"+"-".repeat(7) + '|'+ "\n");
        for (Person person : listPerson) {
            String name = String.format("|%-20s|", person.getName());
            String surname = String.format("%-20s|", person.getSurname());
            String age = String.format("%-5d|", person.getAge());
            String gender = String.format("%-7s|", person.getGender());
            System.out.println(name + surname + age + gender);
        }
    }
//Method shows persons above Age in the args
    public static void showPersonAbove(List<Person> listPrsn, int age){
        List<Person> resList = new ArrayList<>();
        for (Person person : listPrsn) {
            if (person.getAge() > age){
                resList.add(person);
            }
        }
        printTable(resList);
    }
    public static List<Person> showFemaleOnly(List<Person> listPrsn){
        List <Person> femaleList = new ArrayList<>();
        for (Person person : listPrsn) {
            if ("female".equals(person.getGender())){
                femaleList.add(person);
            }
        }
        return femaleList;
    }
    public static List<Person> showMaleOnly(List<Person> listPrsn){
        List <Person> maleList = new ArrayList<>();
        for (Person person : listPrsn) {
            if ("male".equals(person.getGender())){
                maleList.add(person);
            }
        }
        return maleList;
    }

    public static void  groupGender(List<Person> listPr, String gender){
        List <Person> groupList = new ArrayList<>(listPr.size());
        if (gender.toLowerCase().equals("male")){
            groupList.addAll((showMaleOnly(listPr)));
            groupList.addAll(showFemaleOnly(listPr));
            printTable(groupList);
        }else if(gender.toLowerCase().equals("female")){
            groupList.addAll(showFemaleOnly(listPr));
            groupList.addAll(showMaleOnly(listPr));
            printTable(groupList);
        }

    }
    public static Set <Person> ageSorted(List<Person> listPrsn){
        Set <Person> ageList = new TreeSet<>();
        ageList.addAll(listPrsn);
        return ageList;
    }
    public static void printTable(Set<Person> listPerson){
        String headName = String.format("|%-20s|","NAME");
        String headSurname = String.format("%-20s|", "SURNAME");
        String headAge= String.format("%-5s|", "AGE");
        String headGender= String.format("%-7s|\n", "GENDER");
        String rawSepar = "-".repeat(20);
        System.out.print(   headName + headSurname + headAge + headGender +
                "-".repeat(21) + "|"+"-".repeat(20) + '|' +
                "-".repeat(5) + "|"+"-".repeat(7) + '|'+ "\n");
        for (Person person : listPerson) {
            String name = String.format("|%-20s|", person.getName());
            String surname = String.format("%-20s|", person.getSurname());
            String age = String.format("%-5d|", person.getAge());
            String gender = String.format("%-7s|", person.getGender());
            System.out.println(name + surname + age + gender);
        }
    }


}
