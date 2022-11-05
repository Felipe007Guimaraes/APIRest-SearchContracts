package com.felipeguimaraes.contracts.api.config;

import org.junit.jupiter.api.Test;
import springfox.documentation.spring.web.plugins.Docket;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SwaggerConfigTest {

    @Test
    void testProductApi() {

        Docket actualProductApiResult = (new SwaggerConfig()).productApi();
        assertTrue(actualProductApiResult.isEnabled());
        assertEquals("default", actualProductApiResult.getGroupName());
    }

}