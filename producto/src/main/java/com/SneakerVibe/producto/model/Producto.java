package com.SneakerVibe.producto.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Table(name = "productos")
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;

    @Column(columnDefinition = "TEXT")
    private String descripcion;

    private String marca;

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categoria categoria;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<DetalleProducto> variantes;
}
