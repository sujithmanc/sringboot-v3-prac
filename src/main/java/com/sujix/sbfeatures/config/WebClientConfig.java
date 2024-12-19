package com.sujix.sbfeatures.config;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;

import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import reactor.netty.http.client.HttpClient;

@Configuration
public class WebClientConfig {

	@Bean
	public WebClient userClient() {
		return WebClient.builder().clientConnector(getReactorClientHttpConnector())
				.baseUrl("https://jsonplaceholder.typicode.com/users").build();
	}

	private ReactorClientHttpConnector getReactorClientHttpConnector() {
		return new ReactorClientHttpConnector(getHttpClient());
	}

	private HttpClient getHttpClient() {
		return HttpClient.newConnection().option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 1_000)
				.doOnConnected(c -> c.addHandlerLast(new ReadTimeoutHandler(1_000, TimeUnit.MILLISECONDS)));
	}
}