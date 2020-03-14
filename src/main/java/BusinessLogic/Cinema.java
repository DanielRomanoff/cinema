package BusinessLogic;

import Models.User;
import javafx.scene.image.Image;

import javax.persistence.*;

@Entity
@Table(name = "cinema")
public abstract class Cinema implements ICinema {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column
    private String title;
    @Transient
    private String description;
    @Column
    private Integer duration;
    @Column
    private String time;
    @Column
    String type;
    @Column
    Integer price;
    @Transient
    Image poster;

    public String getType() {
        return type;
    }

    public Integer getPrice() {
        return price;
    }

    public Image getPoster() {
        return poster;
    }

    public void setPoster(Image poster) {
        this.poster = poster;
    }


    @OneToOne
    User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    Cinema(String title, String description, Integer duration, String time){
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.time = time;
    }

    abstract void setType(String type);
    public abstract void setPrice(Integer price);

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public Integer getDuration() {
        return duration;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

}
