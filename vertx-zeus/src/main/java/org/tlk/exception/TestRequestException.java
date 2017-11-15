package org.tlk.exception;

import io.vertx.up.exception.WebException;

public class TestRequestException extends
        WebException {
    public TestRequestException(final Class<?> clazz,
                                final String name,
                                final String detail) {
        super(clazz, name, detail);
    }

    @Override
    public int getCode() {
        return -100001;
    }
}
