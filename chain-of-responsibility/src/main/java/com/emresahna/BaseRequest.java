package com.emresahna;

public abstract class BaseRequest implements Request {
    private Request nextRequest;

    protected boolean handleNext(String name) {
        if (nextRequest != null) {
            return nextRequest.handle(name);
        }
        return true;
    }

    @Override
    public Request setNextRequest(Request nextRequest) {
        this.nextRequest = nextRequest;
        return nextRequest;
    }
}
