package com.meow;

import com.meow.model.LambdaRequest;
import com.meow.model.LambdaResponse;
import com.meow.model.User;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

@Component("findMe")
public class FindMe implements Function<LambdaRequest, LambdaResponse> {

    private List<User> users = Arrays.asList(
            User.builder().age(10).name("kot").build(),
            User.builder().age(25).name("rambo").build()
    );

    @Override
    public LambdaResponse apply(LambdaRequest request) {
        return users.stream()
                .filter(user -> user.getName().equals(request.getInput()))
                .map(LambdaResponse::new)
                .findFirst()
                .orElseGet(LambdaResponse::new);
    }
}