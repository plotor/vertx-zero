package io.vertx.up.exception;

import io.vertx.core.http.HttpStatusCode;

public class _403ForbiddenException extends WebException {

    public _403ForbiddenException(final Class<?> clazz) {
        super(clazz);
    }

    @Override
    public int getCode() {
        return -60013;
    }

    @Override
    public HttpStatusCode getStatus() {
        return HttpStatusCode.FORBIDDEN;
    }
}
