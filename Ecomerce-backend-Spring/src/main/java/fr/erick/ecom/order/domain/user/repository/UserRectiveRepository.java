package fr.erick.ecom.order.domain.user.repository;

import fr.erick.ecom.order.domain.user.aggregate.User;
import fr.erick.ecom.shared.authentication.domain.Username;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface UserRectiveRepository extends ReactiveCrudRepository <User, Long> {

  Mono<User> getUsernameByEmail(String email);




}
