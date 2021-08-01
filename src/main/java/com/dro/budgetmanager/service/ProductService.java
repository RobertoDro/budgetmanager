package com.dro.budgetmanager.service;

import com.dro.budgetmanager.modelDTO.ProductDTO;

import java.time.LocalDate;
import java.util.List;

public interface ProductService {

   ProductDTO getProductDtoById(Long id);
   List<ProductDTO> getAllProducts();
   void deleteProductById(Long id);
   ProductDTO saveProductDto(ProductDTO productDTO);
   ProductDTO editProductDto(Long id, ProductDTO productDTO);
   List<ProductDTO> getProductsByDateBetween(LocalDate fromDate, LocalDate upToDate);
}
