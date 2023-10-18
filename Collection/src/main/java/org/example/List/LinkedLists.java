
package org.example.List;

        import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
//        CREATING LIST OF BOOKS
        LinkedList<Book2> list = new LinkedList<>();

//        CREATING A BOOK   CTRL D TO COPY A ROW INTO ANOTHER ROW
        Book2 b1 = new Book2(6,"Love", "Ajibade Tosin",50 );
        Book2 b2 = new Book2(12,"Passion", "Adesina Ogunlana",100 );
        Book2 b3 = new Book2(24,"Corruption", "Desmond",150 );
        Book2 b4 = new Book2(48,"Attention", "Olabisi Adeleye",200 );

//        ADDING BOOKS TO LIST
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);

//        USING A FOR LOOP TO PRINT LIST OF BOOK
        for(Book2 ListOfBook : list) {
            System.out.println(ListOfBook.id+" " + ListOfBook.name+ " "+ ListOfBook.author+ " " +ListOfBook.quantity);
        }

    }
}

class Book2 {
    int id;
    String name;
    String author;
    int quantity;

    public Book2(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }
}


