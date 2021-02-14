set client_encoding = 'UTF8';

DROP TABLE IF EXISTS "author";
CREATE TABLE "public"."author" (
    "id" numeric(10,0) NOT NULL,
    "name" character varying(50),
    CONSTRAINT "author_pkey" PRIMARY KEY ("id")
) WITH (oids = false);

INSERT INTO "author" ("id", "name") VALUES
(1,	'青木'),
(2,	'山田'),
(3,	'伊藤');

DROP TABLE IF EXISTS "blog";
DROP SEQUENCE IF EXISTS blog_id_seq;
CREATE SEQUENCE blog_id_seq INCREMENT 1 MINVALUE 1 MAXVALUE 2147483647 START 6 CACHE 1;

CREATE TABLE "public"."blog" (
    "id" integer DEFAULT nextval('blog_id_seq') NOT NULL,
    "title" character varying(50) NOT NULL,
    "overview" character varying(50) NOT NULL,
    "post_date" date NOT NULL,
    "blog_body" text NOT NULL,
    "temporarily_saved" boolean NOT NULL
) WITH (oids = false);

INSERT INTO "blog" ("id", "title", "overview", "post_date", "blog_body", "temporarily_saved") VALUES
(3,	'title_test2',	'overview_test2',	'2021-02-14',	'mutation_test2',	'0'),
(4,	'title_test2',	'overview_test2',	'2021-02-14',	'mutation_test2',	'1'),
(5,	'title_test2',	'overview_test2',	'2021-02-14',	'mutation_test2',	'1'),
(6,	'aaaa',	'aaaaa',	'2021-02-14',	'aaaaa',	'0');

DROP TABLE IF EXISTS "book";
CREATE TABLE "public"."book" (
    "id" numeric(10,0) NOT NULL,
    "name" character varying(50),
    "author_id" numeric(10,0),
    CONSTRAINT "book_pkey" PRIMARY KEY ("id")
) WITH (oids = false);

INSERT INTO "book" ("id", "name", "author_id") VALUES
(1,	'bookname1',	1),
(2,	'bookname2',	1),
(3,	'bookname3',	2),
(4,	'bookname1',	3);

DROP TABLE IF EXISTS "comment";
DROP SEQUENCE IF EXISTS comment_id_seq;
CREATE SEQUENCE comment_id_seq INCREMENT 1 MINVALUE 1 MAXVALUE 2147483647 START 3 CACHE 1;

CREATE TABLE "public"."comment" (
    "id" integer DEFAULT nextval('comment_id_seq') NOT NULL,
    "name" character varying(50) NOT NULL,
    "comment" text NOT NULL,
    "blog_id" integer NOT NULL,
    "post_date" date NOT NULL
) WITH (oids = false);

INSERT INTO "comment" ("id", "name", "comment", "blog_id", "post_date") VALUES
(1,	'blog3_comment_name',	'blog3_comment_test',	3,	'2021-02-14'),
(2,	'blog3_comment_name',	'blog3_comment_test',	3,	'2021-02-14'),
(3,	'blog3_comment_name',	'blog3_comment_test',	3,	'2021-02-14');

-- 2021-02-14 17:20:21.751004+00
