package com.cts.disbursepension;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.disbursepension.service.IDisbursePensionService;


@SpringBootTest
class PensionDisbursementServiceTests {
	
	@Autowired
	private IDisbursePensionService disbursePensionService;

	@Test
	void contextLoads() {
		PensionDisbursementService.main(new String[] {});
		assertThat(disbursePensionService).isNotNull();
	}

}
