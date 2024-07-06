package com.DeepakTutorial.tutorial.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
   private Long id;
   private String name;
   private LocalDate dateofjoining;
   @JsonProperty("isActive")
   private boolean isActive;

   public EmployeeDTO(int i, String deepak, LocalDate of, boolean b) {
   }

   // If you need a custom constructor with a unique parameter list
}
