package com.SneakerVibe.boleta.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "carrito")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // En microservicios NO usamos Usuario como entidad
    // Solo guardamos el ID del usuario
    @Column(name = "usuario_id", nullable = false)
    private Long usuarioId;

    // Relación con los ítems del carrito
    @OneToMany(mappedBy = "carrito", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemCarrito> items;
}
