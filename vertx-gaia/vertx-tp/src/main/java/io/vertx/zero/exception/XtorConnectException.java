package io.vertx.zero.exception;

public class XtorConnectException extends UpException {

    public XtorConnectException(final Class<?> clazz,
                                final String component,
                                final String method) {
        super(clazz, component, method);
    }

    @Override
    public int getCode() {
        return -40033;
    }
}
