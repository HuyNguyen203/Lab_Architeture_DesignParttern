package com.example.orderservice.kafka;


//@Service
public class OrderProducer {

//    private static final Logger LOGGER = LoggerFactory.getLogger(OrderProducer.class);
//
//    private NewTopic topic;
//
//    private KafkaTemplate<String, OrderEvent> kafkaTemplate;
//
//    public OrderProducer(NewTopic topic, KafkaTemplate<String, OrderEvent> kafkaTemplate) {
//        this.topic = topic;
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//    public void sendMessage(OrderEvent event){
//        LOGGER.info(String.format("Order event => %s", event.toString()));
//
//        // create Message
//        Message<OrderEvent> message = MessageBuilder
//                .withPayload(event)
//                .setHeader(KafkaHeaders.TOPIC, topic.name())
//                .build();
//        kafkaTemplate.send(message);
//    }
}
