package com.rvg.test.emphereal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class ProductVO implements Serializable {
    private int id;
    private String name;
    private BigDecimal price;
}
