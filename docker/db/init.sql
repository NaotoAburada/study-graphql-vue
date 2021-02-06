set client_encoding = 'UTF8';

-- authorテーブルをCreate
CREATE TABLE author (
    id numeric(10,0) NOT NULL PRIMARY KEY,
    name varchar(50)
);
-- データを入れておく
INSERT INTO author VALUES
(1, '青木'),
(2, '山田'),
(3, '伊藤');

-- bookテーブルをCreate
create table book (
    id numeric(10, 0) NOT NULL PRIMARY KEY,
    name varchar(50),
    author_id  numeric(10, 0)
);

-- データを入れておく
INSERT INTO book VALUES 
(1, 'bookname1', 1),
(2, 'bookname2', 1),
(3, 'bookname3', 2),
(4, 'bookname1', 3);
