package BusinessLogic;

public class Drama extends Cinema {

    public Drama(String title, String description, Integer duration, String time) {
        super(title, description, duration, time);
        setType("Drama");
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
