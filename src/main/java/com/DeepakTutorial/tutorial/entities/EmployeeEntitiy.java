package com.DeepakTutorial.tutorial.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@Table(name="employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntitiy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private LocalDate dateofjoining;
    private boolean isActive;
}
