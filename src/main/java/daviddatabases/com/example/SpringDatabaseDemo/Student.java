package daviddatabases.com.example.SpringDatabaseDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private long id;
    private String name;

    // public void setId(long id) {
    //    this.id = id;
    //}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }
}
// spring.jpa.hibernate.ddl-auto=create  <-----  instead of this, use this --->  spring.jpa.hibernate.ddl-auto=none