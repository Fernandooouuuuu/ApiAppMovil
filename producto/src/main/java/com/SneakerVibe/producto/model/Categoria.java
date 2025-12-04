package com.SneakerVibe.producto.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "categorias")
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre_categoria", nullable = false)
    private String nombreCategoria;
}
