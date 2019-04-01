package com.relaximus.localdynamodb.model

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable

@DynamoDBTable(tableName = "User")
class User {

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    String id

    String firstName
    String lastName

    User() {}
}
