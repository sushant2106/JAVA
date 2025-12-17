package net.engineeringdigest.journalApp.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

//@Getter
//@Setter
@Document(collection="journal_entries")
@Data
@NoArgsConstructor
public class JournalEntry {

    //POSO class full form → Plain Old System Object

    @Id
    private ObjectId id;
    @NonNull
    private String title;
    private String content;
    private LocalDateTime date;

//    public static boolean isPresent() {
//
//    }


//    public LocalDateTime getDate() {
//        return date;
//    }
//
//    public void setDate(LocalDateTime date) {
//        this.date = date;
//    }
//
//    public  void setId(ObjectId id){
//        this.id=id;
//    }
//    public  void setTitle(String title){
//        this.title=title;
//    }
//    public  void  setContent(String content){
//        this.content=content;
//    }
//
//    public ObjectId getId(){
//        return  this.id;
//    }
//    public String getTitle(){
//        return this.title;
//    }
//    public  String getContent(){
//        return  this.content;
//    }




}
