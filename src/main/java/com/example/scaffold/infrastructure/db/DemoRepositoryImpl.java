package com.example.scaffold.infrastructure.db;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.example.scaffold.entity.DemoEntity;
import com.example.scaffold.repository.DemoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public class DemoRepositoryImpl implements DemoRepository {
    private final DynamoDBMapper dbMapper;

    public DemoRepositoryImpl(DynamoDBMapper dbMapper) {
        this.dbMapper = dbMapper;
    }


    @Override
    public String saveDemoEntity() {
        String id = UUID.randomUUID().toString();
        DemoEntity demoEntity = DemoEntity.builder().id(id).build();
        dbMapper.save(demoEntity);
        return id;
    }
}
