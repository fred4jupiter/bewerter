package demo;

import com.github.fakemongo.Fongo;
import com.mongodb.Mongo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories
public class MongoEmbeddedConfig extends AbstractMongoConfiguration {

    private static final String MONGO_DB_NAME = "demo_db";

    @Override
    protected String getDatabaseName() {
        return MONGO_DB_NAME;
    }

    @Bean
    @Override
    public Mongo mongo() {
        return new Fongo(MONGO_DB_NAME).getMongo();
    }


}