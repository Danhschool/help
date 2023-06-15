//De 2
package lab3;

import java.util.*;

public class Lab3 {

    public static void main(String[] args) {
       
        MyPerson mp = new MyPerson();
        ArrayList<Person> list2 = new ArrayList<Person>();
        list2.add(new Person("id_1", "A", 1999, 10.555));
        list2.add(new Person("id_2", "B", 2000, 9.5));
        list2.add(new Person("id_3", "C", 2003, 8.6));
        list2.add(new Person("id_4", "D", 1995, 7.7));
        
        ArrayList<Person> list3 = new ArrayList<Person>();
        list3.add(new Person("id_5", "AA", 2009, 10));
        list3.add(new Person("id_6", "BB", 2006, 9));
        list3.add(new Person("id_7", "CC", 1993, 8));
        list3.add(new Person("id_8", "DD", 1975, 7));
        
        System.out.println("Cau1");
        System.out.println(mp.f1_c1(list2));
        
        System.out.println("Cau2");
        mp.f2_c1(list2);
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
        
        System.out.println("Cau3");
        
        mp.f3_c1(list3);
        for (int i=0;i<list3.size();i++){
            System.out.println(list3.get(i));
        }
    }

    

}
