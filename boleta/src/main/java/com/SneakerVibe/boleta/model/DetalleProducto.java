package com.SneakerVibe.boleta.model;

import java.math.BigDecimal;

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
    private Long id;

    private String color;
    private String talla;

    private BigDecimal precio;

    private Integer stock;

    private String imgSrc;
    private String href;
    private String altText;

    // En el microservicio de BOLETA solo guardamos el id del producto
    @Column(name = "producto_id", nullable = false)
    private Long productoId;
}