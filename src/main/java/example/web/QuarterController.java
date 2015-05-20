package example.web;

import example.datasource.QuarterMapper;
import example.model.Quarter;
import example.model.QuarterResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by haljik on 2014/10/03.
 */
@RestController
@RequestMapping("/quarters")
public class QuarterController {

    @Autowired
    QuarterMapper mapper;

    @RequestMapping(method= RequestMethod.POST, produces = "application/json")
    public QuarterResponse quarters(@RequestParam("fiscalYear") String fiscalYear,
                           @RequestParam("quarter") String quarter) {
        mapper.register(new Quarter(fiscalYear, quarter));
        return new QuarterResponse("ok");
    }

}
