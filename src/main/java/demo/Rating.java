package demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by michael on 24.08.15.
 */
@Document
public class Rating {

    @Id
    private String id;

    @Indexed(unique = true)
    private final String name;

    private Integer toll = 0;

    private Integer doof = 0;

    public Rating(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public Integer getToll() {
        return toll;
    }

    public void setToll(Integer toll) {
        this.toll = toll;
    }

    public Integer getDoof() {
        return doof;
    }

    public void setDoof(Integer doof) {
        this.doof = doof;
    }

    public String getName() {
        return name;
    }


    public void incrementToll() {
        this.toll++;
    }

    public void incrementDoof() {
        this.doof++;
    }
}
