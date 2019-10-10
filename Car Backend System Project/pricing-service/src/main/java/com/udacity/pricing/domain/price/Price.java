package com.udacity.pricing.domain.price;

import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.math.BigDecimal;

/**
 * Represents the price of a given vehicle, including currency.
 */
@Entity
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String currency;
    private BigDecimal price;

    public Price() {
    }

    public Price(Long vehicleId, String currency, BigDecimal price) {
        this.id = vehicleId;
        this.currency = currency;
        this.price = price;
    }

    public Long getVehicleId() {
        return id;
    }

    public void setVehicleId(Long vehicleId) {
        this.id = vehicleId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
