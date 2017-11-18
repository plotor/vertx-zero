package io.vertx.zero.func;

import io.vertx.zero.exception.ZeroException;
import io.vertx.zero.exception.ZeroRunException;
import io.vertx.zero.func.error.JdSupplier;
import io.vertx.zero.func.error.JeSupplier;
import io.vertx.zero.func.lang.JcConsumer;
import io.vertx.zero.log.Annal;
import io.vertx.zero.tool.mirror.Instance;

import java.util.function.Supplier;

public class HBool {
    private static final Annal LOGGER = Annal.get(HBool.class);

    /**
     * @param condition
     * @param supplier
     * @param <T>
     * @return
     */
    public static <T> T execTrue(final boolean condition,
                                 final JeSupplier<T> supplier) {
        T ret = null;
        if (condition) {
            try {
                ret = supplier.get();
            } catch (final Exception ex) {

            }
        }
        return ret;
    }

    public static void execTrue(final boolean condition,
                                final JcConsumer consumer) {
        if (condition) {
            consumer.exec();
        }
    }

    /**
     * @param condition
     * @param supplier
     * @param exp
     * @param <T>
     * @return
     */
    public static <T> T exec(final boolean condition,
                             final Supplier<T> supplier,
                             final ZeroRunException exp) {
        if (condition) {
            return supplier.get();
        } else {
            throw exp;
        }
    }

    /**
     * @param condition
     * @param tSupplier
     * @param fSupplier
     * @param <T>
     * @return
     */
    public static <T> T exec(final boolean condition,
                             final Supplier<T> tSupplier,
                             final Supplier<T> fSupplier) {
        return HTry.execZero(() -> execZero(condition,
                tSupplier::get, fSupplier::get), LOGGER);
    }

    /**
     * Common work flow
     *
     * @param condition
     * @param logger
     * @param tSupplier
     * @param fSupplier
     */
    public static void exec(final boolean condition,
                            final Annal logger,
                            final JcConsumer tSupplier,
                            final JcConsumer fSupplier) {
        HTry.execZero(() -> execZero(condition,
                () -> {
                    if (null != tSupplier) {
                        tSupplier.exec();
                    }
                    return null;
                }, () -> {
                    if (null != fSupplier) {
                        fSupplier.exec();
                    }
                    return null;
                }), logger);
    }

    /**
     * @param condition
     * @param tSupplier
     * @param fSupplier
     * @param <T>
     * @return
     * @throws ZeroException
     */
    public static <T> T execZero(final boolean condition,
                                 final JdSupplier<T> tSupplier,
                                 final JdSupplier<T> fSupplier)
            throws ZeroException {
        T ret = null;
        if (condition) {
            if (null != tSupplier) {
                ret = tSupplier.get();
            }
        } else {
            if (null != fSupplier) {
                ret = fSupplier.get();
            }
        }
        return ret;
    }

    /**
     * @param condition
     * @param logger
     * @param errorCls
     * @param args
     */
    public static void execUp(final boolean condition,
                              final Annal logger,
                              final Class<? extends ZeroRunException> errorCls,
                              final Object... args) {
        if (condition) {
            HNull.exec(() -> {
                final ZeroRunException error =
                        Instance.instance(errorCls, args);
                logger.vertx(error);
                throw error;
            }, logger, errorCls);
        }
    }
}
