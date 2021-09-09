package org.acme;

import org.acme.validator.Coordinate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Warehouse {

    @Pattern(regexp="(^$|[\\w]{8,10})", message = "location code harus alphanumeric dengan 8 - 10 karakter")
    private String locationCode;

    @NotNull(message = "nama warehouse tidak boleh null")
    private String name;

    @Email(message = "format email tidak sesuai")
    private String email;

    @Pattern(regexp="(^$|[0-9]{10,})", message = "nomor handphone harus angka dan minimal 10 karakter")
    private String mobileNumber;

    @Coordinate(message = "latitude tidak valid")
    private String latitude;

    @Coordinate(message = "longitude tidak valid")
    private String longitude;

    @Pattern(regexp="(^[1-9]+[\\d]{4})", message = "kode pos harus angka dengan panjang 5 karakter dan tidak diawali oleh 0")
    private String postalCode;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
