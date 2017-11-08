package com.taiga.domian;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by CJW on 2017/10/29.
 */
@Getter
@Setter
public class Car {

  @NotNull(message = "不能为空")
  private String manufacturer;

  @NotNull
  @Size(min = 2, max = 14)
  private String licensePlate;

  @Min(2)
  private int seatCount;
}
