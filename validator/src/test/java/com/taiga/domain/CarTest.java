package com.taiga.domain;

import com.taiga.domian.Car;

import org.junit.Test;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 * Created by CJW on 2017/11/8.
 */
public class CarTest {

  private ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
  private Validator validator = factory.getValidator();

  @Test
  public void test() {
	Car c = new Car();
	c.setSeatCount(5);
	//Set<ConstraintViolation<Car>> result = validator.validateProperty(c, "seatCount");
	Set<ConstraintViolation<Car>> result = validator.validate(c);
	result.forEach(t -> {
	  System.err.println(t);
	});

  }
}
