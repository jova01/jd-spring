package cyber.com.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "departments")
public class Department extends BaseEntity{

    String department;
    String division;

    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }
}
