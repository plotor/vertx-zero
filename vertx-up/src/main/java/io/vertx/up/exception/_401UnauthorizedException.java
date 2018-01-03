package io.vertx.up.exception;

import io.vertx.core.http.HttpStatusCode;

public class _401UnauthorizedException extends WebException {

    public _401UnauthorizedException(final Class<?> clazz) {
        super(clazz);
    }

    @Override
    public int getCode() {
        return -40012;
    }

    @Override
    public HttpStatusCode getStatus() {
        return HttpStatusCode.UNAUTHORIZED;
    }
}
