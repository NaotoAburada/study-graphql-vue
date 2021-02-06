# study-graphql-vue

vue で graphql を使うための勉強用だああああああ

### vue3 をつかうためには

front に移動した後最初に yarn install

### graphiql をつかうためには

docker-compose で postgre と spring-boot と Adminer を準備

```
docker-compose up
```

起動が完了したら別のターミナルを開いて

```
docker-compose exec java bash
```

フォルダを移動してビルド

```
cd /usr/local/src
sh gradlew build
```

アプリケーションの実行

```
java -jar build/libs/back-0.0.1-SNAPSHOT.jar
```

起動できてるかの確認

Adminer

http://localhost:8081

ログインする時に必要な情報

ユーザ：dev

パスワード：pass

データベース：dev

GraphiQL

http://localhost:8080/graphiql

graphql を実行するためのサンプル

```
query getAuthorById {
    getAuthorById(id:2) {
        id
        name
        books {
            id
            name
        }
    }
}
```
