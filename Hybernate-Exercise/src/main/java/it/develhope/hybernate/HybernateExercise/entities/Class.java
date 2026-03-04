package it.develhope.hybernate.HybernateExercise.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Class {

    @Id
    @Column(name = "classe_id")

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer classeId;

    @Column(nullable = false)
    private String titolo;

    @Column(nullable = false)
    private String descrizione;


    public Class(String titolo, String descrizione) {
        this.titolo = titolo;
        this.descrizione = descrizione;
    }

    public Class() {
    }

    public Integer getClasse_id() {
        return classeId;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}
