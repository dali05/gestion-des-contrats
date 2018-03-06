package business.entity;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User implements Serializable{
    @Id
    @GeneratedValue
    private int id;
    private String userName;
    private String password;
}
