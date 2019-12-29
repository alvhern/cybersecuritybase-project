package sec.project.domain;

import javax.persistence.Entity;
import org.springframework.data.jpa.domain.AbstractPersistable;
import javax.persistence.Column;

@Entity
public class Signup extends AbstractPersistable<Long> {

    @Column
    private String name;
    @Column
    private String address;

    public Signup() {
        super();
    }

    public Signup(String name, String address) {
        this();
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
