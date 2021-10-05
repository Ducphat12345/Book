package dao;

import model.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookDao {
    ArrayList<Book> list = new ArrayList<>();
    String nameBook, author, major, date;
    int n, choose;

    public void nhapDS(){
        System.out.print("Nhap so luong ds: ");
        n = new Scanner(System.in).nextInt();;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sach " + (i + 1));
            System.out.print("Nhap ten sach: ");
            nameBook = new Scanner(System.in).nextLine();
            System.out.print("Nhap ten tac gia: ");
            author = new Scanner(System.in).nextLine();
            System.out.println("Chon ten sach:");
            menu();
            choose = new Scanner(System.in).nextInt();;
            switch(choose){
                case 1:
                    major = "Khoa hoc tu nhien";
                    break;
                case 2:
                    major = "Van hoc nghe thuat";
                    break;
                case 3:
                    major = "Dien tu vien thong";
                    break;
                case 4:
                    major = "Cong nghe thong tin";
                    break;
                default:
                    System.out.println("Khong co muc ban chon! Chon lai");
                    menu();
                    break;
            }
            System.out.print("Nhap ngay: ");
            date = new Scanner(System.in).nextLine();;

            Book book = new Book(nameBook, author, major, date);
            list.add(book);
        }
    }

    public void xuatDS(){
        for (Book book : list) {
            System.out.println(book.toString());
        }
    }

    public void menu(){
        System.out.println("1. Khoa hoc tu nhien");
        System.out.println("2. Van hoc nghe thuat");
        System.out.println("3. Dien tu vien thong");
        System.out.println("4. Cong nghe thong tin");
    }
}
