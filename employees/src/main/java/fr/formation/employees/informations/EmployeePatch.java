package fr.formation.employees.informations;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

public class EmployeePatch {

    @NotNull
    @Future
    private LocalDate endDate;

    public EmployeePatch() {
    }

    public LocalDate getEndDate() {
	return endDate;
    }
}
