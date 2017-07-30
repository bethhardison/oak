package com.taiga.oak.modelmapper.example1;

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
  Address billingAddress;
}

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
class Customer {

  Name name;

}

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
class Name {

  String firstName;
  String lastName;
}

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
class Address {

  String street;
  String city;

}