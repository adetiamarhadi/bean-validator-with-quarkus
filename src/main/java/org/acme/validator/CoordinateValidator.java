package org.acme.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CoordinateValidator implements ConstraintValidator<Coordinate, String> {
    @Override
    public boolean isValid(final String valueToValidate, final ConstraintValidatorContext context) {
        try {
            double d = Double.parseDouble(valueToValidate);
            int i = (int) d;
            int compare = Double.compare(1.0101, 1.99907);
            System.out.println(compare);
            // https://support.google.com/maps/answer/18539?hl=en&co=GENIE.Platform%3DDesktop
            return i >= -90 && i <= 90;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return false;
        }
    }
}
