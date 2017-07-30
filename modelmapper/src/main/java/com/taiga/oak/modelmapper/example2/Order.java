package com.taiga.oak.modelmapper.example2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Order {

  Customer customer;
  Address shippingAddress;
  Address billingAddress;
}

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
class Customer {

  String name;
}

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
class Address {

  String street;
  String city;
}