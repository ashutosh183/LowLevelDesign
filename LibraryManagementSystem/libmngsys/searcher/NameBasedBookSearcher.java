package searcher;
import java.util.List;
import book.BookCopy;
public class NameBasedBookSearcher implements BookSearcher {
    private final String bookName;
    public NameBasedBookSearcher(String bookName){
        this.bookName = bookName;
    }

    @Override
    public List<BookCopy> search(){
        return null;
    }
}
