1. MongoRepository
   1. MongoRepository (with MongoTemplate for custom queries)
   2. MongoRepository (with @Query for custom queries)
2. Getting the total job count for a given client
   1. from "jobsByJobGroupId" map in redis (existing implementation in aragorn)
   2. using jobs collection (querying count of jobs for a given client)
