package com.taiga.oak.modelmapper.example1;

import org.junit.Test;
import org.modelmapper.ModelMapper;

public class OrderDTOTest {

  @Test
  public void toOrderDTO() {
	ModelMapper modelMapper = new ModelMapper();
	//modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);

	Customer customer = new Customer(new Name("first", "last"));
	Address address = new Address("马兰路", "上海市");

	Order order = new Order(customer, address);
	System.err.println(order);


	OrderDTO orderDTO = modelMapper.map(order, OrderDTO.class);

//	assertEquals(order.getCustomer().getName().getFirstName(), orderDTO.getCustomerFirstName());
//	assertEquals(order.getCustomer().getName().getLastName(), orderDTO.getCustomerLastName());
//	assertEquals(order.getBillingAddress().getStreet(), orderDTO.getBillingStreet());
//	assertEquals(order.getBillingAddress().getCity(), orderDTO.getBillingCity());

	System.err.println(orderDTO.toString());
  }
}