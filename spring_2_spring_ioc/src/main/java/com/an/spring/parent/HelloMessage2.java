package com.an.spring.parent;

public class HelloMessage2 {

    private String message1;
    private String message2;

//    public String getMessage1() {
//        return message1;
//    }
    public void getMessage1() {
        System.out.println("Message2 message1:"+message1);
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }

//    public String getMessage2() {
//        return message2;
//    }
    public void getMessage2() {
        System.out.println("Message2 message2:"+message2);
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }
}
