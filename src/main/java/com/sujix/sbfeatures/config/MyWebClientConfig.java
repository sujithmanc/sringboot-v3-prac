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
public class MyWebClientConfig {

	@Bean
	public WebClient user2Clinet() {
		// Builder clientConnector(ClientHttpConnector connector);
		final int READ_TIME_OUT = 5_000;

		HttpClient httpClient = HttpClient.newConnection().option(ChannelOption.CONNECT_TIMEOUT_MILLIS, READ_TIME_OUT)
				.doOnConnected(connection -> connection
						.addHandlerLast(new ReadTimeoutHandler(READ_TIME_OUT, TimeUnit.MILLISECONDS)));

		var reactorClientHttpConnector = new ReactorClientHttpConnector(httpClient);

		return WebClient.builder().clientConnector(reactorClientHttpConnector).build();
	}

	@Bean
	public WebClient postClinet() {
		return WebClient.builder()
				.baseUrl("https://jsonplaceholder.typicode.com/posts/").build();
	}

	@Bean
	public WebClient todosClient() {
		return WebClient.builder().baseUrl("https://jsonplaceholder.typicode.com/todos/").build();
	}

    @Bean
    WebClient cartsClient() {

        HttpClient httpClient = HttpClient.newConnection().responseTimeout(Duration.ofSeconds(1));
        var reactorClientHttpConnector = new ReactorClientHttpConnector(httpClient);
        return WebClient.builder()
                .clientConnector(reactorClientHttpConnector)
                .baseUrl("https://dummyjson.com/carts")
                .build();
    }

}
