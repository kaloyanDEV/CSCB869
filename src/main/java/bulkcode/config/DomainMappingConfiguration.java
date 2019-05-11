package bulkcode.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import bulkcode.domain.Company;
import bulkcode.service.dto.CompanyDTO;
import bulkcode.service.mapper.CompanyMapper;
import bulkcode.service.mapper.impl.CompanyMapperImpl;

@Configuration
public class DomainMappingConfiguration {

	@Bean
	public CompanyMapperImpl companyMapper() {
		return new CompanyMapperImpl();
	}

}
