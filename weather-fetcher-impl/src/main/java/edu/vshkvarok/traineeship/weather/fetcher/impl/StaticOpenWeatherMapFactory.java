package edu.vshkvarok.traineeship.weather.fetcher.impl;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;

import java.util.Collections;
import java.util.List;

public class StaticOpenWeatherMapFactory {

    public static OpenWeatherMapClient createProxy(String baseAddress) {
        List<Object> providers = Collections.singletonList(
                new JacksonJsonProvider());

        return JAXRSClientFactory.create(baseAddress, OpenWeatherMapClient.class, providers);
    }
}
