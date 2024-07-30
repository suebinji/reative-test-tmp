package com.cos.reative_test;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

import java.util.Arrays;

public class MyPub implements Publisher<Integer> {
    Iterable<Integer> its = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    @Override
    public void subscribe(Subscriber<? super Integer> subscriber) {
        System.out.println("구독자 : 1.신문사야 나 너희 신문 볼께");
        System.out.println("심문사 : 2. 알겠어 --- 구독정보 만들어줄테니 기다려");
        MySubscription subscription = new MySubscription(subscriber, its);
        System.out.println("신문사: 구독정보생성완료");
        subscriber.onSubscribe(subscription);
    }
}
