package org.mylearning.rxjava2;

import io.reactivex.*;

public class HelloWorld {
    public static void main(String[] args) {
        Flowable.just("Hello world").subscribe(System.out::println);
        Observable.just("Hello world").subscribe(System.out::println);
    }
}