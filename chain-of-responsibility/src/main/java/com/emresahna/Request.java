package com.emresahna;

public interface Request {
    boolean handle(String name);
    Request setNextRequest(Request nextRequest);
}
