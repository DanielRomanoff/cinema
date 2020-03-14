package BusinessLogic;

public class Comedy extends Cinema {

    public Comedy(String title, String description, Integer duration, String time) {
        super(title, description, duration, time);
        setType("Comedy");
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
