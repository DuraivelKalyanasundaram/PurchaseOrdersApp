package com.cognizant.ccap.serverless;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.cognizant.ccap.serverless.model.LambdaResponse;

/**
 * Handler for requests to Lambda function.
 */
public class App implements RequestHandler<Map<String, Object>, LambdaResponse> {

    private static final String MESSAGE = "Purchase Order - Received";

    @Override
    public LambdaResponse handleRequest(Map<String, Object> stringObjectMap, Context context) {

        // Add code here. Below line inserts incoming event to DynamoDB
        DBHelper.persistItem(stringObjectMap);

        return new LambdaResponse(200, MESSAGE);
    }
}
