package se.sofia.lab.restapplicationperfectnumber.controller;

import org.springframework.web.bind.annotation.*;
import se.sofia.lab.restapplicationperfectnumber.entity.PerfectNumberRange;
import se.sofia.lab.restapplicationperfectnumber.utils.PerfectNumberUtils;

import java.util.ArrayList;

@RestController
public class PerfectNumberController {

    @GetMapping("/isPerfectNumber/{number}")
    Boolean isPerfectNumber(@PathVariable Integer number) {
        return PerfectNumberUtils.isPerfectNumber(number);
    }

    @GetMapping("/getPerfectNumbersInRange/{start}/{end}")
    ArrayList<Integer> getPerfectNumbersInRange(@PathVariable Integer start, @PathVariable Integer end) {
        return PerfectNumberUtils.getPerfectNumbersInRange(start, end);
    }

    @PostMapping("/getPerfectNumbersInRange")
    ArrayList<Integer> getPerfectNumbersInRange(@RequestBody PerfectNumberRange perfectNumberRange) {
        return PerfectNumberUtils.getPerfectNumbersInRange(
                perfectNumberRange.getStart(), perfectNumberRange.getEnd());
    }


}
