package com.SneakerVibe.boleta.model;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "boleta_items")
@NoArgsConstructor
@AllArgsConstructor
public class BoletaItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer cantidad;

    @Column(name = "precio_unitario")
    private BigDecimal precioUnitario;

    @ManyToOne
    @JoinColumn(name = "boleta_id", nullable = false)
    private Boleta boleta;

    @ManyToOne
    @JoinColumn(name = "detalle_producto_id", nullable = false)
    private DetalleProducto detalleProducto;
}