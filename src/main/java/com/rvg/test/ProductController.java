package com.rvg.test;

import com.rvg.test.emphereal.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public ResponseEntity<ProductVO> findById(@PathVariable long id) {
        try {
            ProductVO productVO = productService.findById( id );
            return new ResponseEntity<>( productVO,
                    HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity( e.getMessage(),
                    HttpStatus.BAD_REQUEST );
        }
    }
}
