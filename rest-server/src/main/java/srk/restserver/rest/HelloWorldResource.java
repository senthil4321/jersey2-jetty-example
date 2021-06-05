package srk.restserver.rest;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import srk.restserver.model.Saying;


@Path("/hello")
@Singleton

public class HelloWorldResource {
	
	private static final String TEMPLATE = "Hello, %s! Counter %d";
	private int counter = 0;
	@GET
	@Path("{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Saying sayHello(@PathParam("name") String name) {	
	    counter++;
		return new Saying(String.format(TEMPLATE, name,counter));
    }
}
