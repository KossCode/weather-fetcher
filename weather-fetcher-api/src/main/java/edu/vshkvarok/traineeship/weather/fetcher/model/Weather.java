package edu.vshkvarok.traineeship.weather.fetcher.model;

import java.util.Map;

public class Weather {
    private String overall;
    private Map<String, String> temperature;

    public String getOverall() {
        return overall;
    }

    public void setOverall(String overall) {
        this.overall = overall;
    }

    public Map<String, String> getTemperature() {
        return temperature;
    }

    public void setTemperature(Map<String, String> temperature) {
        this.temperature = temperature;
    }

    public Weather() {
    }

    public Weather(String overall, Map<String, String> temperature) {
        this.overall = overall;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Weather{" + "overall='" + overall + '\'' + ", temperature="
                + temperature + '}';
    }
}
