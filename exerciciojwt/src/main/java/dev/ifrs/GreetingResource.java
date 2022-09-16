package dev.ifrs;


import javax.ws.rs.Path;


@Path("/hello")
public class GreetingResource {

   
    public String hello() {
        return "Hello omfirjs";
    }
}