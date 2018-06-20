package com.example.hello.impl;

import com.google.inject.AbstractModule;
import com.lightbend.lagom.javadsl.server.ServiceGuiceSupport;

import com.example.hello.api.HellolagomService;

/**
 * The module that binds the HellolagomService so that it can be served.
 */
public class HellolagomModule extends AbstractModule implements ServiceGuiceSupport {
    @Override
    protected void configure() {
        bindService(HellolagomService.class, HellolagomServiceImpl.class);
    }
}
