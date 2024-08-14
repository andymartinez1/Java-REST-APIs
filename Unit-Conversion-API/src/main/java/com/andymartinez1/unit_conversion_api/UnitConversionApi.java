package com.andymartinez1.unit_conversion_api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/unit-conversion")
public class UnitConversionApi {

    @PostMapping
    public ConversionDetails convert(@RequestBody ConversionDetails details) {
        UnitConverter.convert(details);

        return details;
    }

}
