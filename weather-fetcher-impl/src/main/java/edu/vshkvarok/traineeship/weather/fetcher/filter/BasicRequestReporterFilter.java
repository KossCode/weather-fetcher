package edu.vshkvarok.traineeship.weather.fetcher.filter;

import edu.vshkvarok.traineeship.weather.fetcher.persistence.impl.entity.IncomingRequest;
import edu.vshkvarok.traineeship.weather.fetcher.persistence.impl.repository.Repository;
import lombok.RequiredArgsConstructor;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@PreMatching
@RequiredArgsConstructor
public class BasicRequestReporterFilter implements ContainerRequestFilter {
    private final Repository repository;

    @Override
    public void filter(ContainerRequestContext requestContext) {
        Timestamp date = Timestamp.valueOf(LocalDateTime.now());
        String url = requestContext.getUriInfo().getAbsolutePath().toString();

        IncomingRequest request = IncomingRequest.builder()
            .date(date)
            .url(url)
            .build();

        repository.create(request);
    }
}
