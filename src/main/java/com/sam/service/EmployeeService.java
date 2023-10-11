package com.sam.service;

import com.sam.dto.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

    public int calculateSalary(Employee e) {
        return e.getAge() > 50 ? 50000 : 30000;
    }

    //auto generated method
    public boolean isSeniorCitizen(Employee e) {
        return e.getAge() > 60;
    }
}
