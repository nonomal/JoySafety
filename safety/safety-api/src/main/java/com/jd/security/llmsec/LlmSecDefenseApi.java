// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2023-2026 JD.com

package com.jd.security.llmsec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAspectJAutoProxy(proxyTargetClass=true)
@EnableScheduling
@SpringBootApplication
public class LlmSecDefenseApi {

	public static void main(String[] args) {
		SpringApplication.run(LlmSecDefenseApi.class, args);
	}

}
