package edu.vshkvarok.traineeship.weather.fetcher.api;

import edu.vshkvarok.traineeship.weather.fetcher.model.WeatherInfo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public interface WeatherFetcher {

    @Path("/version")
    @GET
    String getVersion();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{country}/{city}")
    WeatherInfo getWeather(
            @PathParam("country") String country,
            @PathParam("city") String city
            );

}
