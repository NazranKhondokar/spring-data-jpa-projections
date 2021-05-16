package com.bytestree.restful.dto;

public interface EmployeeByCloseProjectionRs {
    Long getId();

    String getFirstName();

    String getLastName();

    DepartmentRs getDepartment();

    interface DepartmentRs {
        String getName();
    }
}
