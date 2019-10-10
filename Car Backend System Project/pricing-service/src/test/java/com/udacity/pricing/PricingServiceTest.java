package com.udacity.pricing;

import com.udacity.pricing.api.PricingController;
import com.udacity.pricing.domain.price.Price;
import com.udacity.pricing.service.PriceException;
import com.udacity.pricing.service.PricingService;
import org.junit.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.Assert.*;

public class PricingServiceTest {

    @MockBean
    PricingService pricingService;

    private Price price = pricingService.getPrice(1L);

    public PricingServiceTest() throws PriceException {
    }

    @Test
    public void getPrice() {
        PricingController priceController = new PricingController();
        Price result = priceController.get(1L);
        assertEquals(result, price);
 }

}
