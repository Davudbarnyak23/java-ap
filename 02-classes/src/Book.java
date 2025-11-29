public class Book {
    String title;
    String author;
    int pages;
    int year;

    Book(){
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.pages = 0;
        this.year = 0;
        System.out.println("створрено нову книгу");

    }
    public Book(String title, int bookyear) {
        this.title = title;  //1
        year = bookyear;     //2
    }

    void showInfo() {
        System.out.println("Книга:" + title);
        System.out.println("Автор:" + author);
        System.out.println("Сторінок:" + pages);
        System.out.println("Рік:" + year);
    }
    
}
