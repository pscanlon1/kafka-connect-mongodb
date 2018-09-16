/*
 * Copyright (c) 2018. Hans-Peter Grahsl (grahslhp@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package at.grahsl.kafka.connect.mongodb.cdc.debezium.rdbms.mssql;

import at.grahsl.kafka.connect.mongodb.MongoDbSinkConnectorConfig;
import at.grahsl.kafka.connect.mongodb.cdc.CdcOperation;
import at.grahsl.kafka.connect.mongodb.cdc.debezium.OperationType;
import at.grahsl.kafka.connect.mongodb.cdc.debezium.rdbms.RdbmsHandler;

import java.util.Map;

public class MssqlHandler extends RdbmsHandler {

    //NOTE: this class is prepared in case there are
    //mssql specific differences to be considered
    //and the CDC handling deviates from the standard
    //behaviour as implemented in RdbmsHandler.class

    public MssqlHandler(MongoDbSinkConnectorConfig config) {
        super(config);
    }

    public MssqlHandler(MongoDbSinkConnectorConfig config, Map<OperationType, CdcOperation> operations) {
        super(config, operations);
    }
}
