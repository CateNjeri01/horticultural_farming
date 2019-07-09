package tt.example.HorticulturalFarming.models;

import java.io.Serializable;

public class Recommendation implements Serializable {

    private String name;
    private String image;

    public Recommendation() {
    }

    public Recommendation(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }
}
