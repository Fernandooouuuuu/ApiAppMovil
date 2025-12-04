package com.SneakerVibe.usuario.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "usuario")
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String contrasena;

    private String direccion;

    @Column(name = "nro_domicio")
    private String numDomicilio;

    private String region;

    private String comuna;

    @Column(nullable = false)
    private Boolean esAdmin;
}
