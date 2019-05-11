package bulkcode.service.mapper.impl;

import java.lang.reflect.Method;
import java.util.Arrays;
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
		company.setActivity(fromValue(Activity.class, dto.getActivity()));
		company.setType(fromValue(Type.class, dto.getType()));

		return company;
	}

	@SuppressWarnings("unchecked")
	private <E extends Enum<E>> E fromValue(Class<E> class1, String enumType) {

		try {
			Method method = class1.getMethod("valueOf", String.class);
			return (E) method.invoke(null, enumType);
		} catch (Exception e) {
			// ignored
		}

		try {
			Method method2 = class1.getMethod("values");
			E[] values = (E[]) method2.invoke(null);
			E result = Arrays.asList(values).stream().filter(type -> type.toString().equals(enumType)).findFirst().get();
			return result;
		} catch (Exception e) {
			// ignored
		}
		return null;
	}

	@Override
	public CompanyDTO toDto(Company entity) {

		CompanyDTO companyDto = mapper.map(entity, CompanyDTO.class);
		companyDto.setActivity(entity.getActivity().toString());
		companyDto.setType(entity.getType().toString());

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
