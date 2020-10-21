package entities;

import java.sql.Date;

public class Post {

    private int id;
    private int userId;
    private String text;
    private Date timestamp;

    public Post() {
    }

    public Post(int userId, String text, Date timestamp) {
        this.userId = userId;
        this.text = text;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Post - Id: " + id + ", UserId: " + userId
                + ", text: " + text + ", Timestamp: " + timestamp;
    }

}
