package edu.miu.springdata1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PagingRequest {

    private int page;
    private int pageSize;
    private String sortBy;

    @JsonProperty
    private boolean isAscending;
}
