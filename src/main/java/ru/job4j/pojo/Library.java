package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book bukvar = new Book("Букварь", 50);
        Book ono = new Book("Оно", 700);
        Book cleanCode = new Book("Clean code", 1);
        Book math = new Book("Математический анализ, Дифференцирование и интегрирование", 150);
        Book[] books = new Book[4];
        books[0] = bukvar;
        books[1] = ono;
        books[2] = cleanCode;
        books[3] = math;
        System.out.println("Начальный список книг");
        for (int i = 0; i < books.length; i++) {
            Book rs = books[i];
            System.out.println(i + "-я книга " + rs.getName() + " в количестве " + rs.getPages() + " страниц");
        }
        System.out.println("После замены");
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int i = 0; i < books.length; i++) {
            Book rs = books[i];
            System.out.println(i + "-я книга " + rs.getName() + " в количестве " + rs.getPages() + " страниц");
        }
        System.out.println("Поищем книгу Clean code");
        for (Book rs : books) {
            if ("Clean code".equals(rs.getName())) {
                System.out.println("вот она " + rs.getName() + " в количестве " + rs.getPages() + " страниц");
            }
        }
    }
}
