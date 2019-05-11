package bulkcode.service.mapper.impl;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import bulkcode.domain.Company;
import bulkcode.domain.enumeration.Activity;
import bulkcode.domain.enumeration.Type;
import bulkcode.service.dto.CompanyDTO;
import bulkcode.service.mapper.CompanyMapper;

/**
 * custom implementation for mapper
 *
 */
public class CompanyMapperImpl implements CompanyMapper {

	private ModelMapper mapper = new ModelMapper();

	@Override
	public Company toEntity(CompanyDTO dto) {
		
		Company company = mapper.map(dto, Company.class);
		company.setActivity(Activity.valueOf(dto.getActivity()));
		company.setType(Type.valueOf(dto.getType()));
		
		return company;
	}

	@Override
	public CompanyDTO toDto(Company entity) {

		CompanyDTO companyDto = mapper.map(entity, CompanyDTO.class);
		companyDto.setActivity(entity.getActivity().getDesc());
		companyDto.setType(entity.getType().getDesc());

		return companyDto;

	}

	@Override
	public List<Company> toEntity(List<CompanyDTO> dtoList) {
		return dtoList.stream().filter(Objects::nonNull).map(this::toEntity).collect(Collectors.toList());
	}

	@Override
	public List<CompanyDTO> toDto(List<Company> entityList) {
		return entityList.stream().filter(Objects::nonNull).map(this::toDto).collect(Collectors.toList());
	}

}
