package codepro;


import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.KStream;

import java.util.Properties;

//stateless
public class App1 {
    public static void main(String[] args) {
// Configurer l'application Kafka Streams
        Properties props = new Properties();
        props.put("application.id", "kafka-streams-app");
        props.put("bootstrap.servers", "84.8.219.53:9092"); // l'ip de la vm sur laquelle le conteneur kakfa est lancé
        props.put("default.key.serde", "org.apache.kafka.common.serialization.Serdes$StringSerde");
        props.put("default.value.serde", "org.apache.kafka.common.serialization.Serdes$StringSerde");
// Construire le flux
        StreamsBuilder builder = new StreamsBuilder();
        KStream<String, String> sourceStream = builder.stream("input-topic");
// Transformation : convertir en majuscules : exemple hello world -> HELLO WORLD
            KStream<String, String> upperCaseStream = sourceStream.mapValues(value -> value.toUpperCase());
        upperCaseStream.to("output-topic");
// Démarrer l'application Kafka Streams
        KafkaStreams streams = new KafkaStreams(builder.build(), props);
        streams.start();
// Ajouter un hook pour arrêter proprement
        Runtime.getRuntime().addShutdownHook(new Thread(streams::close));
    }
}
