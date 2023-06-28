package net.paulosoft.cliente;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;


@Entity
public class cliente extends PanacheEntity{
  public String nome;
}
