package it.develhope.hybernate.HybernateExercise.entities;


import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
@Entity
@Table
public class Student {
    @Id
    @Column(name = "studente_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idStudente;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cognome;

    @Column(nullable = false,unique = true)
    private String email;


    public Student(String nome, String cognome, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }

    public Student() {
    }

    public Integer getIdStudente() {
        return idStudente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
