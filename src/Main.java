import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Book> books=new TreeSet<Book>();

        Book book1=new Book("Küçük Prens",302,"Antoine de Saint-Exupéry","2014");
        Book book2=new Book("Simyacı",350,"Paulo coelho","2014");
        Book book3=new Book("Yüzyıllık yalnızlık",105,"Gabriel Marquez","2014");
        Book book4=new Book("Taht Oyunları",850,"George Martin","2014");
        Book book5=new Book("Hayvan Çiftliği",120,"George Orwell","2014");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        System.out.println("Ada göre sıralama : ");
        for(Book book:books){

            System.out.println("Kitap Adı : "+book.getName()+
                               ",\t Sayfa Sayısı : "+book.getPage()+
                               ",\t Yazarın İsmi : "+book.getAuthor()+
                               ",\t Yayın Tarihi : "+ book.getReleaseDate());
        }

        //kitap sayfasına göre sıralama.
        TreeSet<Book> books2=new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPage() - o2.getPage();
            }
        });
        books2.add(book1);
        books2.add(book2);
        books2.add(book3);
        books2.add(book4);
        books2.add(book5);
        System.out.println("----------------------------------");
        System.out.println("Sayfa sayısına göre sıralama :");
        for (Book book:books2) {
            System.out.println("Kitap adı : " + book.getName() +
                    ",\t Sayfa Sayısı : " + book.getPage() +
                    ",\t Yazarın İsmi : " + book.getAuthor() +
                    ",\t Yayın Tarihi : " + book.getReleaseDate());
        }
    }
}
