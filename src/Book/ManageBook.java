package Book;

import java.util.Scanner;

public class ManageBook {
    Scanner sc = new Scanner(System.in);
    Book[] books = new Book[4];

    public ManageBook() {
        listBook();
    }

    public void listBook() {
        books[0] = (new Book(1, "Tôi là tôi", "12/10/2021", "tiếng việt", 127000));
        books[1] = (new Book(2, "One more night", "12/10/2021", "tiếng việt", 127000));
        books[2] = (new Book(3, "Dũng chột", "12/10/2021", "tiếng việt", 127000));
        books[3] = (new Book(4, "Bốc bát họ", "12/10/2021", "tiếng việt", 127000));
    }

    public int searchName() {
        System.out.print("Nhập tên sách cần tìm: ");
        String intPut = sc.nextLine();
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(intPut)) {
                return i;
            }
        }
        return -1;
    }

    public void removeBook() {
        System.out.println("Nhập tên sách: ");
        int index = searchName();
        Book[] booksnew = new Book[books.length - 1];
        for (int i = 0; i < books.length - 1; i++) {
            if (i < index)
                booksnew[i] = books[i];
            else booksnew[i] = books[i + 1];
        }
        books = booksnew;
        System.out.println(books);
    }

    public void searchNameBook() {
        while (true) {
            int index = searchName();
            if (index == -1) {
                System.out.print("không có trog thư viện, mời nhập lại");
            } else {
                System.out.println(books[index]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        ManageBook manageBook = new ManageBook();
        manageBook.searchName();
//        manageBook.searchNameBook();
    }
}
