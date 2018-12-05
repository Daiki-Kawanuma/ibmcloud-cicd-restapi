package com.project_respite.ibmcloud_cicd.api;

import com.project_respite.ibmcloud_cicd.common.FibonacciSequence;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class SampleController {

    @GetMapping("/fibonacci")
    public String getHelloPage(@RequestParam(name = "nary") String nary) {
        return "" + FibonacciSequence.nary(new BigInteger(nary));
    }
}
