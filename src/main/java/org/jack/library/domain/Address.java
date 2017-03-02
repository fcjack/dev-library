package org.jack.library.domain;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

/**
 * Created by jackson on 01/03/17.
 */
@Entity
@SequenceGenerator(name = "seq", sequenceName = "address_seq", allocationSize = 1)
public class Address extends AbstractEntity {

    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private Integer number;
    private String complement;
    private String reference;

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
