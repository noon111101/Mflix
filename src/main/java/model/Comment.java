package model;

import lombok.Data;
import org.bson.types.ObjectId;
import utils.MyTime;

import java.util.Date;

@Data
public class Comment {
    private ObjectId id;
    private String text;
    private Date date;
    private String email;
    private String name;
    private ObjectId movie_id;

    public String getTimeAgo() {
        return MyTime.timeAgo(new Date(), date);
    }
}
