package com.alticci;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/alticci")
public class AlticciSequence {

    @GET
    @Path("/{n}")
    @Produces(MediaType.TEXT_PLAIN)
    public Integer alticciSequence(Integer n) {

        int a0 = 0;
        int a1 = 1;
        int result = 0;

        if (n == 0) {
            result = a0;
        } else if (n == 1 || n == 2) {
            result = a1;
        } else if (n > 2) {
            result = alticciSequence(n - 3) + alticciSequence(n - 2);
        }
        
        return result;
    }
}
