package org.example;

import jakarta.mail.internet.MimeMessage;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.io.InputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<String> members = new ArrayList<>(){
            {
                add("Pedro");
                add("Sarah");
                add("Rodrigo");
                add("Fabíola");
                add("Cleberson");
                add("Júlia");
            }
        };

        System.out.println(sorted(members));
    }

    public static Map<String, String> sorted(List<String> members){

        Map<String, String> result = new HashMap<>();
        List<String> invalid = new ArrayList<>();
        Random generate = new Random();
        int i = 0;
        while(i < members.size()){
            int x = generate.nextInt(members.size());
            if(!Objects.equals(members.get(i), members.get(x)) && !invalid.contains(members.get(x))){
                result.put(members.get(i), members.get(x));
                invalid.add(members.get(x));
                i++;
            }
        }

        return result;
    }
}