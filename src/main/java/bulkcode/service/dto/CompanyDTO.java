package bulkcode.service.dto;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;
import bulkcode.domain.enumeration.Activity;
import bulkcode.domain.enumeration.Type;

/**
 * A DTO for the {@link bulkcode.domain.Company} entity.
 */
public class CompanyDTO implements Serializable {

	private Long id;

	@NotNull
	@Size(min = 2)
	private String name;

	private String manager;

	private Integer founded;

	private Float startCapital;

	private String address;

	private String activity;

	private String type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public Integer getFounded() {
		return founded;
	}

	public void setFounded(Integer founded) {
		this.founded = founded;
	}

	public Float getStartCapital() {
		return startCapital;
	}

	public void setStartCapital(Float startCapital) {
		this.startCapital = startCapital;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		CompanyDTO companyDTO = (CompanyDTO) o;
		if (companyDTO.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), companyDTO.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "CompanyDTO{" + "id=" + getId() + ", name='" + getName() + "'" + ", manager='" + getManager() + "'"
				+ ", founded=" + getFounded() + ", startCapital=" + getStartCapital() + ", address='" + getAddress()
				+ "'" + ", activity='" + getActivity() + "'" + ", type='" + getType() + "'" + "}";
	}
}
