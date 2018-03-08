package business.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Groupe implements Serializable{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int  idGroupe;
   private String label;
   @OneToMany(mappedBy = "groupe")
   private List<Groupe_User> groupe;
}
