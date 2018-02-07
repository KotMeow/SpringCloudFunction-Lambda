package com.meow;

import com.meow.model.LambdaRequest;
import com.meow.model.LambdaResponse;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class FindMeHandler extends SpringBootRequestHandler<LambdaRequest, LambdaResponse> {
}
