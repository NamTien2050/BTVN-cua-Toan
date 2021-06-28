package Book;

public class Book implements Ibook {
    private int Id;
    private String name, PublishDate, language;               // ngày xuất bản
    private float averagePrice;                               // giá trung bình

    public Book() {
    }

    public Book(int id, String name, String publishDate, String language, float averagePrice) {
        Id = id;
        this.name = name;
        PublishDate = publishDate;
        this.language = language;
        this.averagePrice = averagePrice;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public float getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(float averagePrice) {
        this.averagePrice = averagePrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", PublishDate='" + PublishDate + '\'' +
                ", language='" + language + '\'' +
                ", averagePrice=" + averagePrice +
                '}';
    }

    @Override
    public void disPlay() {
        System.out.println(toString());
    }

    @Override
    public void sort() {
    }
}
