package business.entity;

import javax.persistence.*;

@Entity
public class Groupe_User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGroupe_User;
    @ManyToOne
    @JoinColumn(name = "idGroupe")
    private Groupe groupe;
    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;

}
