package com.github.mathan26.concepts.innerclassexample.classinsideinterface;

public interface EmailService {

    public void  sendEmail(EmailDetails e);

    class EmailDetails{
        String name;
        String to;
    }
}

