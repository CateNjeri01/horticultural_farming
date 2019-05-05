package tt.example.HorticulturalFarming.models;

import com.google.firebase.database.Exclude;

import java.io.Serializable;

public class User implements Serializable {

    @Exclude
    private String id;

    private String name;
    private String contact;
    private String imageName;
    private String status;
    private String search;

    public User() {
    }

    public User(String name, String contact, String imageName, String status, String search) {
        this.name = name;
        this.contact = contact;
        this.imageName = imageName;
        this.status = status;
        this.search = search;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
