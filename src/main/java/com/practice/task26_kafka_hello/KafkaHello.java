package com.practice.task26_kafka_hello;

import org.springframework.stereotype.Component;

/**
 * MESSAGING — HELLO KAFKA (отправить → принять одно сообщение)
 *
 * <p><b>Проблема / что даёт Spring:</b> асинхронный обмен через брокер без ручного Kafka-клиента:
 * KafkaTemplate.send(topic, msg) для отправки и метод с @KafkaListener для приёма — Spring поднимает
 * consumer-loop и десериализацию за тебя.</p>
 *
 * <p><b>Реализуй:</b> send(msg) публикует в топик через KafkaTemplate; метод-listener (@KafkaListener)
 * принимает и складывает в lastReceived. (KafkaTemplate/@KafkaListener добавишь при реализации —
 * здесь каркас на @Component.)</p>
 *
 * <p><b>Как протестить:</b> Testcontainers-Kafka ИЛИ @EmbeddedKafka: send("hi") → await до lastReceived()=="hi"
 * (Awaitility, т.к. приём асинхронный). Проверь именно доставку через реальный/встроенный брокер.</p>
 */
@Component
public class KafkaHello {

    // TODO: внедрить KafkaTemplate<String,String>

    public void send(String message) {
        // TODO: kafkaTemplate.send("hello-topic", message)
        throw new UnsupportedOperationException("TODO: produce");
    }

    // TODO: @KafkaListener(topics="hello-topic") метод, сохраняющий в lastReceived
    public String lastReceived() {
        throw new UnsupportedOperationException("TODO: consume");
    }
}
