package com.felipeguimaraes.contracts.api.dtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class APIResponseListDtoTest {

    @Test
    void testConstructor() {
        assertTrue((new APIResponseListDto()).getValue().isEmpty());
    }

}