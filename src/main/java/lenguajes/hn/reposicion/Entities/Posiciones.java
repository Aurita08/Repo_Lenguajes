package lenguajes.hn.reposicion.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="codigoequipo")
@Data

public class Posiciones {
    @Id
    @Column(name = "codigoequipo")
    
    @OneToOne
    private int codigoEquipo;

    private int empates;

    private int ganados;

    private int perdidos;
    
    @Column(name ="golesfavor")
    private int golesFavor;


    @Column(name ="golescontra")
    private int golesContra;

    private int puntos;

    @JsonIgnore
    @OneToOne(mappedBy = "posiciones")
    private Equipos equipos;
}



