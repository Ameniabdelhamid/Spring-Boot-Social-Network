package com.tn.isamm.linkedin.entity;
// Generated Oct 21, 2018 10:21:03 AM by Hibernate Tools 4.3.1


import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

/**
 * Langue generated by hbm2java
 */
@Entity
@Table(name="langue"
    ,catalog="linkedin2"
)
public class Langue  implements java.io.Serializable {


    private Utilisateur utilisateur;
    private Integer id;
    private String lang;
    private String niveau;

    public Langue() {
    }

    public Langue(String lang, String niveau, Utilisateur utilisateur) {

       this.lang = lang;
        this.niveau=niveau;
        this.utilisateur=utilisateur;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }



    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="id_utilisateur", nullable=false)
    public Utilisateur getUtilisateur() {
        return this.utilisateur;
    }
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    
    @Column(name="lang", nullable=false, length=50)
    public String getLang() {
        return this.lang;
    }
    public void setLang(String lang) {
        this.lang = lang;
    }

    @Column(name="niveau", nullable=false, length=50)
    public String getNiveau() {
        return this.niveau;
    }
    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }


}

