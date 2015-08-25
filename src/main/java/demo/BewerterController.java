package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by michael on 24.08.15.
 */
@Controller
public class BewerterController {

    private static final String RATING_NAME = "demo";

    @Autowired
    private RatingRepository ratingRepository;

    @RequestMapping
    public ModelAndView list() {
        Rating rating = ratingRepository.findByName(RATING_NAME);
        if (rating == null) {
            rating = new Rating("demo");
            ratingRepository.save(rating);
        }

        return new ModelAndView("rating", "rating", rating);
    }

    @RequestMapping(value = "/toll", method = RequestMethod.POST)
    public ModelAndView toll(RedirectAttributes redirect) {
        Rating rating = ratingRepository.findByName(RATING_NAME);
        rating.incrementToll();
        ratingRepository.save(rating);
        return new ModelAndView("redirect:/rating");
    }

    @RequestMapping(value = "/doof", method = RequestMethod.POST)
    public ModelAndView doof(RedirectAttributes redirect) {
        Rating rating = ratingRepository.findByName(RATING_NAME);
        rating.incrementDoof();
        ratingRepository.save(rating);
        return new ModelAndView("redirect:/rating");
    }
}
