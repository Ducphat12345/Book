package dao;

import model.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonDao {
    ArrayList<Person> list = new ArrayList<>();
    int choose, n, phone;
    String name, address, type;

    public void nhapDS(){
        System.out.print("Nhap so luong ds: ");
        n = new Scanner(System.in).nextInt();;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap ban doc thu " + (i + 1));
            System.out.print("Nhap ten ban doc: ");
            name = new Scanner(System.in).nextLine();;
            System.out.print("Nhap dia chi ban doc: ");
            address = new Scanner(System.in).nextLine();;
            System.out.print("Nhap sdt ban doc: ");
            phone = new Scanner(System.in).nextInt();;
            System.out.println("Nhap loai ban doc:");
            menu();
            choose = new Scanner(System.in).nextInt();;
            switch(choose){
                case 1:
                    type = "Sinh vien";
                    break;
                case 2:
                    type = "Hoc vien cao hoc";
                    break;
                case 3:
                    type = "Giao vien";
                    break;
                default:
                    System.out.println("K co loai ban chon! Chon lai");
                    menu();
                    break;
            }

            Person person = new Person(name, address, phone, type);
            list.add(person);
        }
    }

    public void menu(){
        System.out.println("1. Sinh vien");
        System.out.println("2. Hoc vien cao hoc");
        System.out.println("3. Giao vien");
    }

    public void xuatDS(){
        for (Person person : list) {
            System.out.println(person.toString());
        }
    }
}
