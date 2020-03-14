package BusinessLogic;

public class Thriller extends Cinema {
    public Thriller(String title, String description, Integer duration, String time) {
        super(title, description, duration, time);
        setType("Thriller");
    }

    @Override
    void setType(String type) {
        this.type = type;
    }

    @Override
    public void setPrice(Integer price) {
        this.price = price;
    }
}
