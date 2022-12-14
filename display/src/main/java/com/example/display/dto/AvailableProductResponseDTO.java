package com.example.display.dto;


import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class AvailableProductResponseDTO {

    private Long productId;
    private String productName;
    private int productStockCount;
    private String expiredAt;

}
