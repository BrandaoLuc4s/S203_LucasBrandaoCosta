

public class Optional<Book> findBookById(Long id){
    Optional<Book> opBook = bookList.stream()
        .filter( b -> b.getId().equals(id) )
        .findFirst();
    return opBooks;

}