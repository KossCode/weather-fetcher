package edu.vshkvarok.traineeship.weather.fetcher.exception;

import org.apache.cxf.jaxrs.client.ResponseExceptionMapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Provider
public class RespExMapper implements ResponseExceptionMapper<Throwable> {

    @Override
    public Throwable fromResponse(Response r) {
        return new Exception();
    }
}
