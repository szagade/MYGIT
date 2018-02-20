package com.app.alians;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("alians")
public class AlianResource {
	
	AlianRepo repo=new AlianRepo();

	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Alian> getAlians() {
		System.out.println("Get alian called");
		return repo.getAlians();
	}
	
	@GET
	@Path("alian/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Alian getAlian(@PathParam("id") int id) {
		return repo.getAlian(id);

	}
		
	
	@POST
	@Path("alian")
	@Produces(MediaType.APPLICATION_XML)
	public Alian createAlian(Alian a1) {
		
		System.out.println(a1);
		repo.create(a1);
		return a1;
	}
	
	@PUT
	@Path("alian")
	public void updateAlian(Alian a) {
		System.out.println("Updated"+a);
		repo.update(a);
	}
	
	@DELETE
	@Path("alian/{id}")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public void deleteAlian(@PathParam("id") int id) {
	
		System.out.println("Deleted for id" +id);
		repo.delete(id);
	}
	
}
