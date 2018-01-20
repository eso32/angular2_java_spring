package io.javabrains.repository;



import org.springframework.data.repository.CrudRepository;
import io.javabrains.domain.Poll;

public interface PollRepository extends CrudRepository<Poll, Long> {

}
