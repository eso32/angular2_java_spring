package io.javabrains.repository;



import org.springframework.data.repository.CrudRepository;
import io.javabrains.domain.Option;

public interface OptionRepository extends CrudRepository<Option, Long> {

}
