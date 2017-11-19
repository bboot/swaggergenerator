package com.leonchyk.swaggergenerator;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * For more information https://github.com/swagger-api/swagger-core/wiki/Annotations-1.5.X
 */

@Api
@Path("/myPath")
public class Resource {
    @GET
    @Path("/{myParam}")
    public String getByValue(@ApiParam(required = true) @PathParam("myParam") String myParam) {
        return "param_xxx";
    }

    @POST
    @Path("/{name}")
    public void addByName(@ApiParam(required = true) @PathParam("name") String name) {
        // ...
    }
}
