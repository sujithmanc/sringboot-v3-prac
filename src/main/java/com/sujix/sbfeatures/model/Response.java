package com.sujix.sbfeatures.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import reactor.core.publisher.Flux;

@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
public class Response {
    private int status;
    private Flux<User> data;

    // Constructor, getters, and setters
}