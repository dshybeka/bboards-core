package org.bboards.domains

import org.bboards.domains.enums.Distinct


class Address {

    private String fullAddress;

    private Distinct district;

    static mapWith = "mongo"

    static constraints = {
    }
}
