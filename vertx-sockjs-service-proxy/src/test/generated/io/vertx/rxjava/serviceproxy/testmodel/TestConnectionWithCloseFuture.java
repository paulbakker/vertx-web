/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.rxjava.serviceproxy.testmodel;

import java.util.Map;
import rx.Observable;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 *
 * <p/>
 * NOTE: This class has been automatically generated from the {@link io.vertx.serviceproxy.testmodel.TestConnectionWithCloseFuture original} non RX-ified interface using Vert.x codegen.
 */

public class TestConnectionWithCloseFuture {

  final io.vertx.serviceproxy.testmodel.TestConnectionWithCloseFuture delegate;

  public TestConnectionWithCloseFuture(io.vertx.serviceproxy.testmodel.TestConnectionWithCloseFuture delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  public void close(Handler<AsyncResult<Void>> handler) { 
    delegate.close(new Handler<AsyncResult<java.lang.Void>>() {
      public void handle(AsyncResult<java.lang.Void> ar) {
        if (ar.succeeded()) {
          handler.handle(io.vertx.core.Future.succeededFuture(ar.result()));
        } else {
          handler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    });
  }

  public Observable<Void> closeObservable() { 
    io.vertx.rx.java.ObservableFuture<Void> handler = io.vertx.rx.java.RxHelper.observableFuture();
    close(handler.toHandler());
    return handler;
  }

  public void someMethod(Handler<AsyncResult<String>> resultHandler) { 
    delegate.someMethod(new Handler<AsyncResult<java.lang.String>>() {
      public void handle(AsyncResult<java.lang.String> ar) {
        if (ar.succeeded()) {
          resultHandler.handle(io.vertx.core.Future.succeededFuture(ar.result()));
        } else {
          resultHandler.handle(io.vertx.core.Future.failedFuture(ar.cause()));
        }
      }
    });
  }

  public Observable<String> someMethodObservable() { 
    io.vertx.rx.java.ObservableFuture<String> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    someMethod(resultHandler.toHandler());
    return resultHandler;
  }


  public static TestConnectionWithCloseFuture newInstance(io.vertx.serviceproxy.testmodel.TestConnectionWithCloseFuture arg) {
    return arg != null ? new TestConnectionWithCloseFuture(arg) : null;
  }
}
