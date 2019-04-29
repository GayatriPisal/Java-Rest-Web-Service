
/*
 * Gayatri Pisal
 * */

package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ApplicationPath;     //These two packages help to run the web service on Tomcat
import javax.ws.rs.core.Application;  

@Path("/hello")
public class Hello {
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHello()
	{
		String result = "<? xml version='1.0' ?>"+
	                    "<hello> Hello from XML </hello>";
		return result;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
		public String sayHelloJason()
		{
			String result = null;
			return result;
		}

	@GET
	@Produces(MediaType.TEXT_HTML)
		public String sayHelloHtml()
		{
			String result = "<h1> Hello from HTML </h1>";
			return result;
		}
}
