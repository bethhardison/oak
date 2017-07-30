package com.taiga.oak.modelmapper.example1;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class OrderDTO {

  String customerFirstName;
  String customerLastName;
  String billingStreet;
  String billingCity;

}
