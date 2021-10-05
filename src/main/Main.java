package main;

import dao.BookDao;
import dao.PersonDao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){

        System.out.println("Moi ban chon");
        System.out.println("1. Nhap xuat ban doc");
        System.out.println("2. Nhap xuat sach");
        System.out.println("5. Thoat");
        System.out.println("----------------------");

        int choose = new Scanner(System.in).nextInt();;

        PersonDao studentDao = new PersonDao();
        BookDao bookDao = new BookDao();

        switch(choose){
            case 1:
                studentDao.nhapDS();
                studentDao.xuatDS();
                menu();
                break;
            case 2:
                bookDao.nhapDS();
                bookDao.xuatDS();
                menu();
            case 5:
                System.out.println("Thoat chuong trinh");
                System.exit(0);
                System.out.println("Ban da thoat");
                break;
            default:
                System.out.println("Khong co muc ban chon! Chon lai");
                menu();
                break;
        }
    }
}
