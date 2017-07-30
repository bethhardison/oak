package com.taiga.oak.modelmapper.example2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

  String customerName;
  String shippingStreetAddress;
  String shippingCity;
  String billingStreetAddress;
  String billingCity;

}
