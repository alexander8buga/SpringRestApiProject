package com.guru.springframework.api.v1.model;

import lombok.Data;

/**
 * Created by jt on 9/24/17.
 */
//DTO data transfer object
@Data
public class CategoryDTO {
    private Long id;
    private String name;
}
