package com.taiga.oak.modelmapper.example2;

import org.junit.Test;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

public class OrderDTOTest {

	@Test
	public void toOrderDTO() {
		ModelMapper modelMapper = new ModelMapper();
		Customer customer = new Customer("CJW");
		Address shippingAddress = new Address("ship", "上海市");
		Address billingAddress = new Address("bill", "厦门市");

		Order order = new Order(customer, shippingAddress, billingAddress);
		System.err.println(order);

		OrderDTO orderDTO = modelMapper.map(order, OrderDTO.class);
		System.err.println(orderDTO.toString());
	}

	@Test
	public void test() {
		PropertyMap<Order, OrderDTO> personMap = new PropertyMap<Order, OrderDTO>() {
			protected void configure() {
				map().setBillingCity(source.getBillingAddress().getCity());
				map(source.getShippingAddress().getCity(), destination.getBillingCity());
			}
		};

	}

}