package hello;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;

import java.util.List;

public class SessionModel {

    private AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();

    private DynamoDBMapper mapper = new DynamoDBMapper(client);

    public void saveSession(Session session){
        try{
            mapper.save(session);
        }catch (Exception e){
            throw e;
        }
    }

    public Session loadSession(String sessionId) throws SessionNotFoundException{
        Session session = mapper.load(Session.class, sessionId);

        if(session == null){
            throw new SessionNotFoundException(sessionId);
        }
        return session;
    }


    public List<Session> loadSessions(){
        DynamoDBScanExpression scanExpression = new DynamoDBScanExpression();
        List<Session> scanResult = mapper.scan(Session.class, scanExpression);
        return scanResult;
    }



}
