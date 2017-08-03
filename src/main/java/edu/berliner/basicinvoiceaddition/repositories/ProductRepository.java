package edu.berliner.basicinvoiceaddition.repositories;


import edu.berliner.basicinvoiceaddition.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository <Product,Long>{
}
