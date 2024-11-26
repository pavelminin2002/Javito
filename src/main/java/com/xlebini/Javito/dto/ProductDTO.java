package com.xlebini.Javito.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProductDTO implements Serializable {
    private UUID id;
    private String title;
    private int price;
    private String description;
}
