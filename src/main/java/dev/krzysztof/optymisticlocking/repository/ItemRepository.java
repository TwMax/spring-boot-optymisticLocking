package dev.krzysztof.optymisticlocking.repository;

import dev.krzysztof.optymisticlocking.domain.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, String> {

}
