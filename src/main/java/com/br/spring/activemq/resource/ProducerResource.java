package com.br.spring.activemq.resource;

import com.br.spring.activemq.domain.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

import javax.jms.Queue;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/rest/producers")
public class ProducerResource {

    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    Queue queue;

    @Autowired
    Queue queue2;

    @Autowired
    Queue queue3;

    @Autowired
    Queue queue4;

    @GetMapping("/um/{mensagem}")
    public String publishQueue1(@PathVariable("mensagem") final String mensagem){
        jmsTemplate.convertAndSend(queue,mensagem);
        return "Published Producer ok 1 !";
    }

    @GetMapping("/dois/{mensagem}")
    public String publishQueue2(@PathVariable("mensagem") final String mensagem){
        jmsTemplate.convertAndSend(queue2,mensagem);
        return "Published Producer ok 2!";
    }

    @ResponseBody
    @PostMapping("/tres")
    public void publishQueue3(@RequestBody Funcionario funcionario) throws IOException {
        jmsTemplate.convertAndSend(queue3,funcionario);
    }

    @ResponseBody
    @PostMapping("/quatro")
    public void publishQueue4(@RequestBody Funcionario funcionarioValores) throws IOException {
        jmsTemplate.convertAndSend(queue4,funcionarioValores);
    }
}
