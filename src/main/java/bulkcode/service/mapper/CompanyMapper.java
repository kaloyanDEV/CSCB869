package bulkcode.service.mapper;

import bulkcode.domain.*;
import bulkcode.service.dto.CompanyDTO;


/**
 * Mapper for the entity {@link Company} and its DTO {@link CompanyDTO}.
 */
public interface CompanyMapper extends EntityMapper<CompanyDTO, Company> {


	default Company fromId(Long id) {
		if (id == null) {
			return null;
		}
		Company company = new Company();
		company.setId(id);
		return company;
	}
}
