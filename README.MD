# Info
* [Apache Karaf archetypes](https://karaf.apache.org/manual/latest/#_archetypes) were used to generate features & impl modules (separately).
* [CXF documentation](http://cxf.apache.org/docs/jaxrs-services-configuration.html#JAXRSServicesConfiguration-Blueprint) was used a basis for blueprint declarations

# How-to run
1. Karaf commands
```
repo-add cxf
repo-add mvn:org.hibernate/hibernate-osgi/5.4.30.Final/xml/karaf
repo-add  mvn:ua.vshkvarok.traineeship/weather-fetcher-features/1.0.0-SNAPSHOT/xml/features
feature:install weather-fetcher-features
```
2. Go to http://localhost:8181/cxf/weather/version
