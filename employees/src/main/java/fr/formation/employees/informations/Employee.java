package fr.formation.employees.informations;

import java.time.LocalDate;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

public class Employee {

    private int id;

    @NotNull
    @PositiveOrZero
    @Digits(integer = 10, fraction = 0)
    private long internalId;

    @NotEmpty
    @Size(min = 1, max = 150)
    private String name;

    @NotEmpty
    @Size(min = 1, max = 150)
    private String firstName;

    @Past
    private LocalDate birthDate;

    @PastOrPresent
    private LocalDate startDate;

    @NotNull
    @Positive
    private float salary;

    @Future
    private LocalDate endDate;

    private boolean retired = false;

    public Employee() {
    }

    public Employee(int id,
	    @NotNull @PositiveOrZero @Digits(integer = 10, fraction = 0) long internalId,
	    @NotEmpty @Size(min = 1, max = 150) String name,
	    @NotEmpty @Size(min = 1, max = 150) String firstName,
	    @Past LocalDate birthDate, @PastOrPresent LocalDate startDate,
	    @NotNull @Positive float salary, @Future LocalDate endDate,
	    boolean retired) {
	this.id = id;
	this.internalId = internalId;
	this.name = name;
	this.firstName = firstName;
	this.birthDate = birthDate;
	this.startDate = startDate;
	this.salary = salary;
	this.endDate = endDate;
	this.retired = retired;
    }

    public Employee(int id,
	    @NotNull @PositiveOrZero @Digits(integer = 10, fraction = 0) long internalId,
	    @NotEmpty @Size(min = 1, max = 150) String name,
	    @NotEmpty @Size(min = 1, max = 150) String firstName,
	    @Past LocalDate birthDate, @PastOrPresent LocalDate startDate,
	    @NotNull @Positive float salary) {
	this.id = id;
	this.internalId = internalId;
	this.name = name;
	this.firstName = firstName;
	this.birthDate = birthDate;
	this.startDate = startDate;
	this.salary = salary;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public long getInternalId() {
	return internalId;
    }

    public void setInternalId(long internalId) {
	this.internalId = internalId;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public LocalDate getBirthDate() {
	return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
    }

    public LocalDate getStartDate() {
	return startDate;
    }

    public void setStartDate(LocalDate startDate) {
	this.startDate = startDate;
    }

    public LocalDate getEndDate() {
	return endDate;
    }

    public void setEndDate(LocalDate endDate) {
	this.endDate = endDate;
    }

    public float getSalary() {
	return salary;
    }

    public void setSalary(float salary) {
	this.salary = salary;
    }

    public boolean isRetired() {
	return retired;
    }

    public void setRetired(boolean retired) {
	this.retired = retired;
    }

    @Override
    public String toString() {
	return "employee [id=" + id + ", internalId=" + internalId + ", name="
		+ name + ", firstName=" + firstName + ", birthDate=" + birthDate
		+ ", startDate=" + startDate + ", endDate=" + endDate
		+ ", salary=" + salary + "]";
    }
}
