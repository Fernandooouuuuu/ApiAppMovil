package com.SneakerVibe.boleta.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "boleta")
@NoArgsConstructor
@AllArgsConstructor

public class Boleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String hash; // numero de la boleta
    private LocalDateTime fechaEmision;

    private Long idUsuario;
    private Integer total;

    @OneToMany(mappedBy = "boleta", cascade = CascadeType.ALL)
    private List<BoletaItem> items;
}
