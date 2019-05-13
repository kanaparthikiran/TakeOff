package com.design.systemdesign;

import java.util.LinkedList;
import java.util.Queue;


public enum SingletonEnum {
    INSTANCE;
    int value;
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    
    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
        System.out.println(singleton.getValue());

        System.out.println(singleton.getValue());

        System.out.println(SingletonEnum.INSTANCE);
        System.out.println(MySingleton.MYINSTANCE.getDeclaringClass());

    }
}

enum MySingleton {
	MYINSTANCE;
}

class StackUsingQueue<T> {
	Queue<T> queue = new LinkedList<>();
	
	public void push(T t) {
		queue.add(t);
	}
	public <T> T pop() {
		return (T) queue.remove();
	}
	
}