package presentation._01;

public class PageNumber {

    private final int pageNumber;

    public PageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public static PageNumber pageNumber(int pageNumber) {
        return new PageNumber(pageNumber);
    }

    public int asInt() {
        return pageNumber;
    }

}
