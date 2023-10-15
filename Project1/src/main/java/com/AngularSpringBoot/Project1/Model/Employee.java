package com.AngularSpringBoot.Project1.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    private String empName;
    private String empEmailId;
}
