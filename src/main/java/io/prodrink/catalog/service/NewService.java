package io.prodrink.catalog.service;

import org.springframework.stereotype.Service;

import javax.annotation.Nullable;

@Service
public class NewService {
    public void method(@Nullable Integer value) {
        value.byteValue();
    }
}
