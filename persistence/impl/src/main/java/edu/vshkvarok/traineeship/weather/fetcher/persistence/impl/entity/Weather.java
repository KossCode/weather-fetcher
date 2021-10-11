package edu.vshkvarok.traineeship.weather.fetcher.persistence.impl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "WEATHER")
public class Weather {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "OVERALL")
    private String overall;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "TEMPERATURE_ID")
    private Temperature temperature;

    public Weather(String overall, Temperature temperature) {
        this.overall = overall;
        this.temperature = temperature;
    }

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
