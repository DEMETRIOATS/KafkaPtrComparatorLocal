package org.example;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MetricValue {

  private String pipeline;

  private String partition;

  private String windowStartTimestamp;

  private int kafkaValue;

  private int ptrValue;

  private boolean inSync;

  public void print() {
    System.out.println("pipeline: " + this.pipeline + "\t" +
        "partition: " + this.partition + "\t" +
        "windowStartTimestamp: " + this.windowStartTimestamp + "\t" +
        "kafkaValue: " + this.kafkaValue + "\t" +
        "ptrValue: " + this.ptrValue + "\t" +
        "inSync: " + this.inSync
    );
  }

}
