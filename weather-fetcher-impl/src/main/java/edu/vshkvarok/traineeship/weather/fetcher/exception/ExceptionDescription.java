package edu.vshkvarok.traineeship.weather.fetcher.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ExceptionDescription {

    private int errorCode;
    private String exceptionDescription;

}
