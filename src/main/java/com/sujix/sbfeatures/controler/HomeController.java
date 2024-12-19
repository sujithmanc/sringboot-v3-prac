package com.sujix.sbfeatures.controler;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.sujix.sbfeatures.service.EmpService;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class HomeController {

	@Autowired
	private EmpService empService;

	@Autowired
	private WebClient postClinet;

	@GetMapping("/flux-demo")
	public Mono<Object> demo() {

		return postClinet.get().uri("1").retrieve().bodyToMono(String.class)
				.flatMap(users -> ServerResponse.ok().bodyValue(users));

	}

	@Async
	public int sum() throws InterruptedException {
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
			log.info(" Sum is : {}", sum);
			log.info(" Summation Completed");
			Thread.sleep(1_000);
		}
		return sum;
	}

	@Async
	public void sum2() throws InterruptedException {
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
			log.info(" Sum is : {}", sum);
			log.info(" Summation Completed");
			Thread.sleep(1_000);
		}

		// return CompletableFuture.completedFuture(sum);
	}

	@GetMapping
	public String getMapping() throws InterruptedException, ExecutionException {

		log.info("------------getMapping------STARTED-----------------------");
		empService.asyncTest();
		log.info(" Summation Completed");
		log.info("------------getMapping------SUCCESS-----------------------");

		return "SUCCESS 200";
	}

}
