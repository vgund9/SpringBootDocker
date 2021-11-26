package com.rvg.test;

import com.rvg.test.emphereal.ProductVO;
import org.springframework.http.ResponseEntity;

public interface ProductService {
    ProductVO findById(long id);
}
