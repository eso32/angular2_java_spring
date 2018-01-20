package io.javabrains.repository;



import org.springframework.data.repository.CrudRepository;
import io.javabrains.domain.Vote;

public interface VoteRepository extends CrudRepository<Vote, Long> {

}
