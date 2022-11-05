package com.felipeguimaraes.contracts.api.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@ToString
public class APIResponseListDto {
    private List<APIResponseDto> value;

    public APIResponseListDto() {
        value = new ArrayList<>();
    }
}
