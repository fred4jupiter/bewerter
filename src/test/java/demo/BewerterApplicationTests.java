package demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BewerterApplication.class)
@ActiveProfiles("dev")
public class BewerterApplicationTests {

    @Autowired
    private RatingRepository ratingRepository;
    
	@Test
	public void saveAndFindRating() {
	    Rating rating = new Rating("demo");
	    ratingRepository.save(rating);
	    
	    Rating foundRating = ratingRepository.findByName("demo");
	    assertNotNull(foundRating);
	    assertEquals("demo", foundRating.getName());
	}

}
