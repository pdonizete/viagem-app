package net.paulosoft.reserva;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import net.paulosoft.cliente.Cliente;
import jakarta.persistence.FetchType;

@Entity
public class Reserva extends PanacheEntity{
          @ManyToOne(fetch = FetchType.LAZY)
public Cliente cliente;

}
