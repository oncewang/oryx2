/**
 * Created by once on 2017/6/29.
 https://spark.apache.org/docs/latest/streaming-programming-guide.html#linking  ---spark读取相关的数据
 */
import org.apache.spark.streaming.kafka.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.regex.Pattern;

import scala.Tuple2;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;
import org.apache.spark.streaming.Duration;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaPairDStream;
import org.apache.spark.streaming.api.java.JavaPairReceiverInputDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka.KafkaUtils;

public class spark_kafka {

    JavaPairReceiverInputDStream<String, String> kafkaStream =
            KafkaUtils.createStream(streamingContext,
                    [ZK quorum], [consumer group id], [per-topic number of Kafka partitions to consume]);

}
