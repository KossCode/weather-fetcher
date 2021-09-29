package edu.vshkvarok.traineeship.weather.fetcher.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/data/2.5")
public interface OpenWeatherMapClient {

    @GET
    @Path("/weather")
    @Produces(MediaType.APPLICATION_JSON)
    OpenWeatherMapInfo getWeatherInfo(@QueryParam("appid") String appId,
            @QueryParam("q") String query, @QueryParam("units") String units);

}
