package com.cognizant.ccap.serverless;

import static org.junit.Assert.assertEquals;

import com.cognizant.ccap.serverless.model.LambdaResponse;
import org.json.simple.parser.ParseException;
import org.junit.Test;


public class AppTest {
  @Test
  public void successfulResponse() throws ParseException {
    App app = new App();
    LambdaResponse result = app.handleRequest(null, null);
    assertEquals("Purchase Order - Received", result.getBody());
  }
}
