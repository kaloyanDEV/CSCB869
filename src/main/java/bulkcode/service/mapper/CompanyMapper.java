package bulkcode.service.mapper;

import bulkcode.domain.*;
import bulkcode.service.dto.CompanyDTO;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

/**
 * Mapper for the entity {@link Company} and its DTO {@link CompanyDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface CompanyMapper extends EntityMapper<CompanyDTO, Company> {

//	public CompanyMapper INSTANCE = Mappers.getMapper(CompanyMapper.class);

//    @Mapping(source = "numberOfSeats", target = "seatCount")
//    CompanyDTO toDto(Company company); 

	default Company fromId(Long id) {
		if (id == null) {
			return null;
		}
		Company company = new Company();
		company.setId(id);
		return company;
	}
}
