package edu.vshkvarok.traineeship.weather.fetcher.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Temperature {

    private TemperatureScale scale;
    private Double degree;

    public enum TemperatureScale {
        CELSIUS
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Temperature that = (Temperature) o;
        return Double.compare(that.degree, degree) == 0 && scale == that.scale;
    }

    @Override
    public int hashCode() {
        return Objects.hash(scale, degree);
    }
}
