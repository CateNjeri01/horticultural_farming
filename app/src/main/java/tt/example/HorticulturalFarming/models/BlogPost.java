package tt.example.HorticulturalFarming.models;

import com.google.firebase.database.Exclude;
import com.google.firebase.firestore.ServerTimestamp;

import java.util.Date;

public class BlogPost extends BlogPostId {

    @Exclude
    private String id;

    private String image;
    private String caption;
    private String ownerId;

    @ServerTimestamp
    private Date date;

    public BlogPost(String ownerId, String image, String caption, Date date) {
        this.image = image;
        this.caption = caption;
        this.date = date;
        this.ownerId = ownerId;
    }

    public BlogPost() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
}
