package org.economics.planningsystem.model.entity.employee;

import org.economics.planningsystem.model.entity.organization.Speciality;
import org.economics.planningsystem.model.entity.plan.Task;
import org.springframework.data.neo4j.core.schema.*;

import java.util.Objects;
import java.util.Set;

import static org.springframework.data.neo4j.core.schema.Relationship.Direction.*;

@Node(labels = "EMPLOYEE_PROFILE")
public class EmployeeProfile {
    @Id
    @GeneratedValue
    private Long id;

    @Relationship(type = "HAS_TASKS", direction = OUTGOING)
    private Set<Task> tasks;

    @Relationship(type = "HAS_SPECIALITY", direction = OUTGOING)
    private Speciality speciality;

    @Property(name = "role")
    private EmployeeRole role;

    public enum EmployeeRole{
        EMPLOYEE,
        ANALYST,
        DIRECTOR
    }

    public Long getId() {
        return id;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public EmployeeRole getRole() {
        return role;
    }

    public void setRole(EmployeeRole role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeProfile that = (EmployeeProfile) o;
        return Objects.equals(id, that.id) && Objects.equals(tasks, that.tasks) && Objects.equals(speciality, that.speciality) && role == that.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tasks, speciality, role);
    }
}