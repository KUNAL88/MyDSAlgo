package com.kunal.java.my.thread.advance;

import java.util.concurrent.locks.ReentrantLock;

public class ReentranedLockDemo {

    public static void main(String[] args) {
        ReentrantLock rl=new ReentrantLock();

        System.out.println(" ---> "+rl.isLocked());

        rl.lock();  rl.lock();

        System.out.println(rl.isHeldByCurrentThread());
        System.out.println(rl.getQueueLength());

        rl.unlock();
        System.out.println(rl.getHoldCount());
        System.out.println(rl.isLocked());

        rl.unlock();
        System.out.println(rl.isLocked());
        System.out.println(rl.isFair());
    }

}
