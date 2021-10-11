package edu.vshkvarok.traineeship.weather.fetcher.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Weather {

    private String overall;
    private Temperature temperature;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Weather weather = (Weather) o;
        return overall.equals(weather.overall) && temperature.equals(
                weather.temperature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(overall, temperature);
    }
}
