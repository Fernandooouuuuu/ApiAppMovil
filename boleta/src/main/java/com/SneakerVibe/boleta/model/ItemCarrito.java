package com.SneakerVibe.boleta.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "item_carrito")
@NoArgsConstructor
@AllArgsConstructor
public class ItemCarrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "carrito_id", nullable = false)
    private Carrito carrito;

    @ManyToOne
    @JoinColumn(name = "detalle_producto_id", nullable = false)
    private DetalleProducto detalleProducto;
}
