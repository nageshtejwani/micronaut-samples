package com.samples.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/whoAmI")
public class WhoAmIController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}