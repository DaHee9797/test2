public class Article {

    private int ID;
    private String Title;
    private String Content;

    public Article(int id, String title, String content) {
        this.ID = id;
        this.Title = title;
        this.Content = content;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
