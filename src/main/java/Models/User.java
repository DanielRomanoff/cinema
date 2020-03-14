package Models;

import BusinessLogic.Cinema;

import javax.persistence.*;

@Entity
@Table (name = "users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Cinema cinema;

    public Cinema getCinema() {
        return cinema;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(String name) {
        this.name = name;
    }

    public User(){}

    public void addCinema(Cinema cinema) {
        cinema.setUser(this);
        this.cinema = cinema;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}