import com.company.Laptop;
import com.company.Person;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.weight = 1.55;
        laptop.price = 95000;

        Person person = new Person();
        person.laptop = laptop;
        person.name = "Burulai";
        person.age = 20;

        Laptop laptop1 = new Laptop();
        laptop1.weight = 2;
        laptop1.price = 56000;

        Person nur = new Person();
        nur.name = "Nurkyz";
        nur.age = 19;
        nur.laptop = laptop;

        Person kulen = new Person();
        kulen.name = "Kudaybergen";
        kulen.age = 18;
        kulen.laptop = laptop;

        Person kulen1 = new Person();
        kulen1.name = "Kudaybergen";
        kulen1.age = 18;
        kulen1.laptop = laptop;

        Person[] array = new Person[]{ person, nur, kulen, kulen1};

//        for (Person p: array) {
//            System.out.println("Name: " + p.name);
//            System.out.println("Age: " + p.age);
//            System.out.println("Colour: " + p.laptop.colour);
//            System.out.println("Price: " + p.laptop.price);
//            System.out.println("-------------");
//        }
        System.out.println(Arrays.toString(searchPerson(array)));
    }

    public static Person[] searchPerson(Person[] p){
        int counter = 0;
        for (Person i: p) {
            if (i.name.equals("Kudaybergen"))
                counter++;
        }
        Person[] kulens = new Person[counter];
        int j = 0;
        for (Person i: p) {
            if (i.name.equals("Kudaybergen")) {
                kulens[j] = i;
                j++;
            }
        }
        return kulens;
    }
}
