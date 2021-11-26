package com.rvg.test;

import com.rvg.test.emphereal.ProductVO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public ProductVO findById(long id) {
        return new ProductVO(1000, "HeadPhones", new BigDecimal( 1600.00));
    }
}
