package edu.vshkvarok.traineeship.weather.fetcher.exception;

import lombok.AllArgsConstructor;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
@AllArgsConstructor

public class GlobalExceptionMapper implements ExceptionMapper<Exception> {

    private ExceptionDescription exceptionDescription;

    public Response toResponse(Exception exception) {
        System.err.println(exception);
        exceptionDescription.setExceptionDescription(exception.getMessage());

        return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity(exceptionDescription).type(MediaType.APPLICATION_JSON)
                .build();
    }

}
