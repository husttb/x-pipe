package com.ctrip.xpipe.redis.core.proxy.handler;

import com.ctrip.xpipe.redis.core.config.TLSConfig;
import io.netty.handler.ssl.SslHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.security.KeyStore;

/**
 * @author chen.zhu
 * <p>
 * May 11, 2018
 */
public abstract class AbstractNettySslHandlerFactory implements NettySslHandlerFactory {

    protected static Logger logger = LoggerFactory.getLogger(AbstractNettySslHandlerFactory.class);

    protected TLSConfig tlsConfig;

    public AbstractNettySslHandlerFactory(TLSConfig tlsConfig) {
        this.tlsConfig = tlsConfig;
    }

    protected SslHandler getCustomizedSslHandler(SslHandler sslHandler) {
        return sslHandler;
    }

}
