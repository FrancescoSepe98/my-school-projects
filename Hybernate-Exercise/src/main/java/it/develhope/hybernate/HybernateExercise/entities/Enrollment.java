package it.develhope.hybernate.HybernateExercise.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Enrollment {

    @Id
    @JoinColumn(name = "iscrizione_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iscrizioneId;

    @OneToMany(mappedBy = "idStudente")
    private List<Student> listaStudenti;

    @OneToMany(mappedBy = "classeId")
    private List<Class> listaClassi;


    public Enrollment(List<Student> listaStudenti, List<Class> listaClassi) {
        this.listaStudenti = listaStudenti;
        this.listaClassi = listaClassi;
    }

    public Integer getIscrizioneId() {
        return iscrizioneId;
    }

    public List<Student> getListaStudenti() {
        return listaStudenti;
    }

    public void setListaStudenti(List<Student> listaStudenti) {
        this.listaStudenti = listaStudenti;
    }

    public List<Class> getListaClassi() {
        return listaClassi;
    }

    public void setListaClassi(List<Class> listaClassi) {
        this.listaClassi = listaClassi;
    }
}
