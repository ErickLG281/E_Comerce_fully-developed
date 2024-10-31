package fr.erick.ecom.product.domain.repository;

import fr.erick.ecom.order.domain.orderd.vo.ProductPublicId;
import fr.erick.ecom.product.domain.aggregate.FilterQuery;
import fr.erick.ecom.product.domain.aggregate.Product;
import fr.erick.ecom.product.domain.vo.PublicId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository  {

  Product save(Product productToCreate);

  Page<Product> findAll(Pageable pageable);

  int delete(PublicId publicId);

  Page<Product> findAllFeaturedProduct(Pageable pageable);

  Optional<Product> findOne(PublicId publicId);

  Page<Product> findByCategoryExcludingOne(Pageable pageable, PublicId categoryPublicId, PublicId productPublicId);

  Page<Product> findByCategoryAndSize(Pageable pageable, FilterQuery filterQuery);

  List<Product> findByPublicIds(List<PublicId> publicIds);

  void updateQuantity(ProductPublicId productPublicId, long quantity);
}
