package demo;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by michael on 24.08.15.
 */
public interface RatingRepository extends MongoRepository<Rating,String> {

    Rating findByName(String name);
}
