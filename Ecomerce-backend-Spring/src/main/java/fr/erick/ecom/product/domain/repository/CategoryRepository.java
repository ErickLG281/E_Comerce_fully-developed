package fr.erick.ecom.product.domain.repository;

import fr.erick.ecom.product.domain.aggregate.Category;
import fr.erick.ecom.product.domain.vo.PublicId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CategoryRepository {

  Page<Category> findAll(Pageable pageable);

  int delete(PublicId publicId);

  Category save(Category categoryToCreate);

}