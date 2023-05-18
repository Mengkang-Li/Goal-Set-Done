package common;

/**********
 * 书籍的特有属性是：页数、已读页数、来源、书籍类型、摘要
 */
public class Book extends Goal{
    private int pages;
    private int finishPages;
    private String source;
    private String bookType;
    private String notes;

    public void setSource(String source) {
        this.source = source;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public void setFinishPages(int finishPages) {
        this.finishPages = finishPages;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getSource() {
        return source;
    }

    public int getFinishPages() {
        return finishPages;
    }

    public int getPages() {
        return pages;
    }

    public String getBookType() {
        return bookType;
    }

    public String getNotes() {
        return notes;
    }
}
