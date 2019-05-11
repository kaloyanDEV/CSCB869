package bulkcode.domain;



import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.Objects;

import bulkcode.domain.enumeration.Activity;

import bulkcode.domain.enumeration.Type;

/**
 * A Company.
 */
@Entity
@Table(name = "company")
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Size(min = 2)
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "manager")
    private String manager;

    @Column(name = "founded")
    private Integer founded;

    @Column(name = "start_capital")
    private Float startCapital;

    @Column(name = "address")
    private String address;

    @Enumerated(EnumType.STRING)
    @Column(name = "activity")
    private Activity activity;

    @Enumerated(EnumType.STRING)
    @Column(name = "jhi_type")
    private Type type;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Company name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManager() {
        return manager;
    }

    public Company manager(String manager) {
        this.manager = manager;
        return this;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Integer getFounded() {
        return founded;
    }

    public Company founded(Integer founded) {
        this.founded = founded;
        return this;
    }

    public void setFounded(Integer founded) {
        this.founded = founded;
    }

    public Float getStartCapital() {
        return startCapital;
    }

    public Company startCapital(Float startCapital) {
        this.startCapital = startCapital;
        return this;
    }

    public void setStartCapital(Float startCapital) {
        this.startCapital = startCapital;
    }

    public String getAddress() {
        return address;
    }

    public Company address(String address) {
        this.address = address;
        return this;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Activity getActivity() {
        return activity;
    }

    public Company activity(Activity activity) {
        this.activity = activity;
        return this;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Type getType() {
        return type;
    }

    public Company type(Type type) {
        this.type = type;
        return this;
    }

    public void setType(Type type) {
        this.type = type;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Company)) {
            return false;
        }
        return id != null && id.equals(((Company) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Company{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", manager='" + getManager() + "'" +
            ", founded=" + getFounded() +
            ", startCapital=" + getStartCapital() +
            ", address='" + getAddress() + "'" +
            ", activity='" + getActivity() + "'" +
            ", type='" + getType() + "'" +
            "}";
    }
}
