package org.acme;

import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Set;
import java.util.stream.Collectors;

@Path("/hello")
public class GreetingResource {

    private static final Logger LOG = Logger.getLogger(GreetingResource.class);

    @Inject
    Validator validator;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        Warehouse warehouse = new Warehouse();
        warehouse.setLocationCode("1234567");
        warehouse.setName(null);
        warehouse.setEmail("adetia.marhadi");
        warehouse.setMobileNumber("asds71287402asdsfss1111111111");
        warehouse.setLatitude("-80.92928383737");
        warehouse.setLongitude("180.322123123123");
        warehouse.setPostalCode("000000123");
        LOG.info(warehouse.getPostalCode());

        Set<ConstraintViolation<Warehouse>> violations = validator.validate(warehouse);

        String error = violations.stream()
                .map(cv -> cv.getMessage())
                .collect(Collectors.joining(". "));

        LOG.info(error);

        return "Hello RESTEasy";
    }
}