package business.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import lombok.Data;

@Entity
@Data
public class Groupe implements Serializable{
   @Id
   @GeneratedValue
   private int  id;
   private String label;
}
