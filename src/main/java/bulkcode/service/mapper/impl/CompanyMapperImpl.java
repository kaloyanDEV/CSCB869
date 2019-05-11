package bulkcode.service.mapper.impl;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import bulkcode.domain.Company;
import bulkcode.service.dto.CompanyDTO;
import bulkcode.service.mapper.CompanyMapper;

/**
 * custom implementation for mapper
 * 
 * @author kaloyan
 *
 */
public class CompanyMapperImpl implements CompanyMapper {

	private ModelMapper mapper = new ModelMapper();

	@Override
	public Company toEntity(CompanyDTO dto) {
		// TODO Auto-generated method stub
		return mapper.map(dto, Company.class);
	}

	@Override
	public CompanyDTO toDto(Company entity) {
		// TODO Auto-generated method stub
		return mapper.map(entity, CompanyDTO.class);
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
