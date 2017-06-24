package me.soshin;

import io.vertx.core.Vertx;

public class Application {

    public static void main(final String[] args) {
        final Vertx vertx = Vertx.vertx();

        vertx.createHttpServer()
                .requestHandler(req -> {
                    req.response().end("Hello from Vert.x Docker with Gradle!");
                })
                .listen(8080, (h) -> {
                    System.out.println("Server started");
                });
    }
}

