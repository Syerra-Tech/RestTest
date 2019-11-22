package hello;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

public class GameModel {
    private AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();

    private DynamoDBMapper mapper = new DynamoDBMapper(client);

    private final SessionModel sessionModel = new SessionModel();



}
