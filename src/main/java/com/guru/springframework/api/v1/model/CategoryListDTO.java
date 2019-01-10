package com.guru.springframework.api.v1.model;

import lombok.*;
import java.util.List;

/**
 * Created by ab on 01/10/18.
 */
@Data
@AllArgsConstructor
public class CategoryListDTO {
	List<CategoryDTO> categories;

}
