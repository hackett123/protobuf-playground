package com.amazonaws.athena.connector.lambda;

import com.amazonaws.athena.lambda.connector.predicate.Constraints;
import com.amazonaws.athena.lambda.connector.predicate.OrderByField;

import java.io.IOException;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    OrderByField orderByField = OrderByField.newBuilder()
        .setColumnName("colA")
        .setIsDescending(false)
        .build();
    Constraints constraints = Constraints.newBuilder()
        .setOrderByList(0, orderByField)
        .setLimit(10L)
        .build();

  }
}
