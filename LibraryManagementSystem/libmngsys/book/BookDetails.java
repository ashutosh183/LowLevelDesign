package book;

import java.util.Date;
import java.util.List;

public class BookDetails {
    private final String name;
    private final Date publicationDate;
    private final List<String> authors;

    public BookDetails(String name, Date publicationDate, List<String> authors){
        this.authors = authors;
        this.publicationDate = publicationDate;
        this.name = name;
    }
}
