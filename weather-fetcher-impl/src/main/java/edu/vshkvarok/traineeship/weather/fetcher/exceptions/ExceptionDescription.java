package edu.vshkvarok.traineeship.weather.fetcher.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor
@Data
public class ExceptionDescription {

    private int errorCode;
    private String exceptionDescription;

}
