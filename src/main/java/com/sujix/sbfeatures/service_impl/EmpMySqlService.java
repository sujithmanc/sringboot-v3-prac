package com.sujix.sbfeatures.service_impl;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.sujix.sbfeatures.service.EmpService;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class EmpMySqlService implements EmpService {
	@Override
	@Async
	public String getName() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			log.info(" Sum is : {}", sum);
			log.info(" Summation Completed");
			try {
				Thread.sleep(1_000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "Inisde EmpMySqlService";
	}

	@Override
	@Async
	public void asyncTest() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			log.info(" Sum is : {}", sum);
			log.info(" Summation Completed");
			try {
				Thread.sleep(1_000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
