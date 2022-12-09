package website;

public final class CurrentPage {
    private static CurrentPage instance = null;

    private String currentPage = "home";

    private CurrentPage() {
    }

    public static CurrentPage getInstance() {
        if (instance == null) {
            instance = new CurrentPage();
        }
        return instance;
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public void clear() {
        currentPage = "home";
    }
}
