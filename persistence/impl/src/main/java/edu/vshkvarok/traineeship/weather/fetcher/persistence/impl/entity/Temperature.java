package edu.vshkvarok.traineeship.weather.fetcher.persistence.impl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TEMPERATURE")
public class Temperature {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private TemperatureScale scale;

    @Column
    private Double degree;

    public enum TemperatureScale {
        CELSIUS
    }

    public Temperature(TemperatureScale scale, Double degree) {
        this.scale = scale;
        this.degree = degree;
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
