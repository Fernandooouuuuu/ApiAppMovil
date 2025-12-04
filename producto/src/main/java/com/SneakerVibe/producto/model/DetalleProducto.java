package com.SneakerVibe.producto.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "detalle_producto")
@NoArgsConstructor
@AllArgsConstructor
public class DetalleProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String color;
    private String talla;

    private BigDecimal precio;

    private Integer stock;

    private String imgSrc;
    private String href;
    private String altText;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "producto_id", nullable = false)
    @JsonIgnoreProperties(value = {"variantes"}, allowSetters = true)
    private Producto producto;
}
