package com.cts.disbursepension.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;


@FeignClient("AUTH-SERVICE", url = "${auth.service.url}")
public interface AuthorisationClient {

	@GetMapping("/validate")
	public boolean validate(@RequestHeader(name = "Authorization") String token);

}
