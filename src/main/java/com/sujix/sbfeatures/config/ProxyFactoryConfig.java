package com.sujix.sbfeatures.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import com.sujix.sbfeatures.client.UserClient;

@Configuration
public class ProxyFactoryConfig {
	

    @Bean
    UserClient userProxyClient(@Qualifier("userClinet") WebClient userClient) {
        return HttpServiceProxyFactory.builderFor(WebClientAdapter.create(userClient)).build().createClient(UserClient.class);
    }
	
}
