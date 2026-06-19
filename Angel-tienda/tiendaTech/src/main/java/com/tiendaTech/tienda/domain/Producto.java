package com.tiendaTech.tienda.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
@Entity
@Table(name="producto")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto")
    private Integer idProducto;

    @ManyToOne
    @JoinColumn(name="id_categoria")
    private Categoria categoria;

    @NotNull
    @Size(max=50)
    private String descripcion;

    private String detalle;

    @NotNull
    private BigDecimal precio;

    private Integer existencias;

    private String rutaImagen;

    private Boolean activo;
}
