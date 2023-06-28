package net.paulosoft.cliente;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/cliente")
public class ClienteResource {
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List <Cliente> get () {
    return Cliente.listAll();
  }
  @GET
  @Path ("findbyid")
  @Produces(MediaType.APPLICATION_JSON)
  public Cliente findById(@QueryParam("id") long id) {
return Cliente.findById(id);
  }
}
