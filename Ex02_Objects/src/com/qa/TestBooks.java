package com.qa;

public class TestBooks {
    public static void main(String[] args) {
        String[] auth = {" Creanga ", " Eminescu ", " Pilat "};
        Book b1 = new Book("Amintirile", auth, 22.33);
        Book b2 = new Book("Pasarelele", auth, 10.33);
        Book b3 = new Book("Alte chestii", auth, 5.33);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        Book[] bookArray = new Book[3];
        bookArray[0] = b1;
        bookArray[1] = b2;
        bookArray[2] = b3;

        for(int i = 0; i < bookArray.length; i++) {
            System.out.println(bookArray[i]);

        }



    }
}
