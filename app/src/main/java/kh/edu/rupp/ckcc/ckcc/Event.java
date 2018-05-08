package kh.edu.rupp.ckcc.ckcc;

public class Event {

    private String title;
    private String date;
    private String location;
    private String description;
    private String imageUrl;

    public Event(String title, String date, String location, String description, String imageUrl) {
        this.title = title;
        this.date = date;
        this.location = location;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
