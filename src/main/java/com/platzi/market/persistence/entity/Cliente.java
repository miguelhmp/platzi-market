package com.platzi.market.persistence.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private String id;

  private String nombre;

  private String apellidos;

  private String celular;

  private String direccion;

  private String correoElectronico;

  @OneToMany(mappedBy = "cliente")
  private List<Compra> compras;

}
