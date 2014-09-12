To first create the sql user:

    mysql -u root -p < create_user_db.sql

Then create the tables:

    ./gradlew initDB

Populate the DB:

    ./gradlew popDB
