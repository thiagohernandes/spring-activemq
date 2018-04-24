package com.br.spring.activemq.listener;

import com.br.spring.activemq.domain.Funcionario;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @JmsListener(destination = "standalone.queue")
    public void consume(String mensagem){
        System.out.println("Received Message queue 1: "+mensagem);
    }

    @JmsListener(destination = "standalone.queue2")
    public void consume2(String mensagem){
        System.out.println("Received Message queue 2: "+mensagem);
    }

    @JmsListener(destination = "standalone.queue3")
    public void consume3(Funcionario funcionario){
        System.out.println("Received Message queue 3: "+funcionario.getNome()+" - R$ "+funcionario.getSalario());
    }
}
