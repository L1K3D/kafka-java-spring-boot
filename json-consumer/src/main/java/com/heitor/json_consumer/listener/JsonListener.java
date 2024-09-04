package com.heitor.json_consumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.heitor.json_consumer.model.Payment;

import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class JsonListener {

    @SneakyThrows
    @KafkaListener(topics = "payment-topic", groupId = "create-group", containerFactory = "jsonContainerFactory")
    public void antiFraud(@Payload Payment payment) {

        log.info("Recebi o pagamento {}", payment.toString());
        Thread.sleep(2500);

        log.info("Validando fraude...");
        Thread.sleep(2500);

        log.info("Compra aprovada...");
        Thread.sleep(2500);

    }

    @SneakyThrows
    @KafkaListener(topics = "payment-topic", groupId = "pdf-group", containerFactory = "jsonContainerFactory")
    public void pdfGenerator() {

        log.info("Gerando PDF do produto...");
        Thread.sleep(2500);

    }

    @SneakyThrows
    @KafkaListener(topics = "payment-topic", groupId = "email-group", containerFactory = "jsonContainerFactory")
    public void sendEmail() {

        log.info("Enviando e-mail de confirmacao...");
        Thread.sleep(2500);

    }
    
}
