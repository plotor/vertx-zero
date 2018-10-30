package cn.vertxup.demo;

import io.vertx.up.VertxApplication;
import io.vertx.up.annotations.Up;

/**
 * @author zhenchao.wang 2018-10-30 18:10
 * @version 1.0.0
 */
@Up
public class Driver {

    public static void main(String[] args) {
        VertxApplication.run(Driver.class);
    }

}
