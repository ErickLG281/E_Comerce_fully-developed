package fr.erick.ecom.order.domain.user.vo;

import fr.erick.ecom.shared.error.domain.Assert;
import org.jilt.Builder;

@Builder
public record UserAddress(String street, String city, String zipCode, String country) {

  public UserAddress {
    Assert.field("street", street).notNull();
    Assert.field("city", city).notNull();
    Assert.field("zipCode", zipCode).notNull();
    Assert.field("country", country).notNull();
  }
}