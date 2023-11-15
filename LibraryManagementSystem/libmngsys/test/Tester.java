package test;

import auth.UserAuthenticator;
import book.BookCopy;
import book.BookDetails;
import id.IDGenerator;
import lib.Library;
import searcher.*;

import java.util.Date;
import java.util.List;

public class Tester {
    public List<BookCopy> searchByBookName(String bookName){
        if(bookName == null){
            throw new IllegalArgumentException("Book name cannot be null.");
        }
        BookSearcher bookSearcher = new NameBasedBookSearcher(bookName);
        return bookSearcher.search();
    }

    public List<BookCopy> searchByAuthorName(List<String> authorNames){
        if(authorNames == null || authorNames.size() == 0){
            throw new IllegalArgumentException("Author names cannot be empty");
        }
        BookSearcher bookSearcher = new AuthorBasedBookSearcher(authorNames);
        return bookSearcher.search();
    }

    public List<Member> searchMemberByMemberName(String memberName, String adminToken) throws IllegalAccessException {
        if(!UserAuthenticator.isAdmin(adminToken)){
            throw new IllegalAccessException("Operation Forbiden!");
        }
        if(memberName == null){
            throw new IllegalArgumentException("Member name cannot be empty");
        }
        MemberSearcher memberSearcher = new NameBasedMemberSearcher(memberName);
        return memberSearcher.search();
    }

    public void addBook(String bookName, Date publicationDate, List<String> authors, String adminToken) throws IllegalAccessException {
        if(!UserAuthenticator.isAdmin(adminToken)){
            throw new IllegalAccessException("Operation Forbidden!!");
        }

        BookDetails bookDetails = new BookDetails(bookName, publicationDate, authors);
        BookCopy bookCopy = new BookCopy(bookDetails, IDGenerator.getUniqueId());
        new Library().addBookCopy(bookCopy);
        System.out.println("BOOK COPY CREATED");

    }

    public void deleteBook(int bookCopyId, String adminToken) throws IllegalAccessException {
        if(bookCopyId <= 0 || adminToken == null || adminToken.length()==0){
            throw new IllegalArgumentException("Book Copy Id / Admin Token cannot be null or empty");
        }
        if(!UserAuthenticator.isAdmin(adminToken)){
            throw new IllegalAccessException("Operation Forbiddeb!!");
        }
        BookSearcher bookSearcher = new IdBasedBookSearcher(bookCopyId);
        List<BookCopy> bookCopies = bookSearcher.search();
        if(bookCopies == null || bookCopies.size() == 0){
            throw new RuntimeException("No book copies retrieved for the given book copy id");
        }
        BookCopy bookCopy = bookCopies.get(0);
        new Library().deleteBookCopy(bookCopy);
    }

    public void blockMember(int memberId, String adminToken) throws IllegalAccessException {
        if (memberId < 0 || adminToken == null || adminToken.length() == 0){
            throw new IllegalArgumentException("Member id / admin token can't be null");
        }
        if(UserAuthenticator.isAdmin(adminToken)){
            throw new IllegalAccessException("Operation Forbidden");
        }

        MemberSearcher memberSearcher = new IdBasedMemberSearcher(memberId);
        List<Member> members = memberSearcher.search();
        if(members == null || members.size() == 0){
            throw new RuntimeException("No members retrieved for the id");
        }

        new Library().blockMember(members.get(0));
    }

    public void issueBook(int bookCopyId, int memberId, String adminToken) throws IllegalAccessException {
        if(bookCopyId < 0 || memberId < 0 || adminToken == null || adminToken.length() == 0){
            throw new IllegalArgumentException("Book copy id / member id / admin token cannot be null");
        }

        if(!UserAuthenticator.isAdmin(adminToken)){
            throw new IllegalAccessException(
                    "Operation Forbidden!!");
        }

        BookSearcher bookSearcher = new IdBasedBookSearcher(bookCopyId);
        List<BookCopy> bookCopies = bookSearcher.search();
        if(bookCopies == null || bookCopies.size() == 0){
            throw new RuntimeException("No book copies retrieved for the given book copy id");
        }
        MemberSearcher memberSearcher = new IdBasedMemberSearcher(memberId);
        List<Member> members = memberSearcher.search();
        if(members == null || members.size() == 0){
            throw new RuntimeException("No members retrieved for the id");
        }

        new Library().issueBook(bookCopies.get(0), members.get(0));
    }

    public void submitBook(int bookCopyId, int memberId, String adminToken){

    }

    public Member getBorrowerOfBook(int bookCopyId, String adminToken){

    }

    public List<BookCopy> booksBorrowedByMember(int memberId, String adminToken){

    }
}
