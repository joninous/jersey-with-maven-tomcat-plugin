package info.joninousiainen.examples.jersey;

import info.joninousiainen.examples.jersey.resources.Resource;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/")
public class Application extends ResourceConfig {
    public Application() {
        packages(Resource.class.getPackage().getName());
    }
}
