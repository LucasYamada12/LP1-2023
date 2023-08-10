package Entity;

import jakarta.persistence.*;
import org.hibernate.boot.registry.selector.spi.StrategyCreator;
import org.hibernate.id.IdentityGenerator;

@Entity
@Table(name = "Pessoa")

public class Pessoa {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column @Id private int ID;
    @Column private String Nome;
    @Column private String SobreNome;
    @Column private String email;

    public Pessoa(String nome, String sobreNome, String email) {
        Nome = nome;
        SobreNome = sobreNome;
        this.email = email;
    }

    public int getID() {
        return ID;
    }

    public String getNome() {
        return Nome;
    }

    public String getSobreNome() {
        return SobreNome;
    }

    public String getEmail() {
        return email;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setSobreNome(String sobreNome) {
        SobreNome = sobreNome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "Nome='" + Nome + '\'' +
                ", SobreNome='" + SobreNome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
