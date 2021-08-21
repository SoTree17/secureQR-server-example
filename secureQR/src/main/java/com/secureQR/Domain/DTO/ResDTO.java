package com.secureQR.Domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Response Data Transfer Object
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResDTO {

    private String resURL;  // Information in a Request

    // Add aditional method here
    //  private String user;
    //  private LocalDateTime regDate, modDate;
}

