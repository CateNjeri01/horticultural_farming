package tt.example.HorticulturalFarming.models;

import java.util.Date;

public class Comments {

    private String message, user_id, postId;
    private Date timestamp;

    public Comments() {
    }

    public Comments(String message, String user_id, String postId, Date timestamp) {
        this.message = message;
        this.user_id = user_id;
        this.postId = postId;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }
}

