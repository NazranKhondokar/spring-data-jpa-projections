package com.bytestree.restful.dto;

import org.springframework.beans.factory.annotation.Value;

public interface EmployeeByOpenProjectionRs {
    Long getId();

    @Value("#{target.firstName} #{target.lastName}")
    String getFullName();

    @Value("#{target.department.name}")
    String getDepartmentName();
}
