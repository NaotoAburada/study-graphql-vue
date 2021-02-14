import gql from "graphql-tag";
export type Maybe<T> = T | null;
export type Exact<T extends { [key: string]: unknown }> = {
  [K in keyof T]: T[K];
};
export type MakeOptional<T, K extends keyof T> = Omit<T, K> &
  { [SubKey in K]?: Maybe<T[SubKey]> };
export type MakeMaybe<T, K extends keyof T> = Omit<T, K> &
  { [SubKey in K]: Maybe<T[SubKey]> };
/** All built-in and custom scalars, mapped to their actual values */
export type Scalars = {
  ID: string;
  String: string;
  Boolean: boolean;
  Int: number;
  Float: number;
};

export type Author = {
  __typename?: "Author";
  books?: Maybe<Array<Maybe<Book>>>;
  id: Scalars["ID"];
  name: Scalars["String"];
};

export type Blog = {
  __typename?: "Blog";
  blogBody: Scalars["String"];
  comments?: Maybe<Array<Maybe<Comment>>>;
  id: Scalars["ID"];
  overview: Scalars["String"];
  postDate: Scalars["String"];
  title: Scalars["String"];
};

export type Book = {
  __typename?: "Book";
  id: Scalars["ID"];
  name: Scalars["String"];
};

export type Comment = {
  __typename?: "Comment";
  comment: Scalars["String"];
  id: Scalars["ID"];
  name: Scalars["String"];
  postDate: Scalars["String"];
};

export type Mutation = {
  __typename?: "Mutation";
  registAuthor?: Maybe<RegistAuthorResponse>;
  registBook?: Maybe<RegistBookResponse>;
};

export type MutationRegistAuthorArgs = {
  name: Scalars["String"];
};

export type MutationRegistBookArgs = {
  authorId: Scalars["ID"];
  name: Scalars["String"];
};

export type Query = {
  __typename?: "Query";
  getAuthorById?: Maybe<Author>;
  getAuthorByMultiConditions?: Maybe<Array<Maybe<Author>>>;
  getAuthorByName?: Maybe<Array<Maybe<Author>>>;
  getBlogById?: Maybe<Blog>;
  getBlogList?: Maybe<Array<Maybe<Blog>>>;
};

export type QueryGetAuthorByIdArgs = {
  id: Scalars["ID"];
};

export type QueryGetAuthorByMultiConditionsArgs = {
  id?: Maybe<Scalars["ID"]>;
  name?: Maybe<Scalars["String"]>;
};

export type QueryGetAuthorByNameArgs = {
  name: Scalars["String"];
};

export type QueryGetBlogByIdArgs = {
  id: Scalars["ID"];
};

export type RegistAuthorResponse = {
  __typename?: "RegistAuthorResponse";
  errorMessage?: Maybe<Scalars["String"]>;
  isRegist: Scalars["Boolean"];
  name: Scalars["String"];
};

export type RegistBookResponse = {
  __typename?: "RegistBookResponse";
  authorId: Scalars["ID"];
  errorMessage?: Maybe<Scalars["String"]>;
  isRegist: Scalars["Boolean"];
  name: Scalars["String"];
};

export type GetAuthorByIdQueryVariables = Exact<{
  id: Scalars["ID"];
}>;

export type GetAuthorByIdQuery = { __typename?: "Query" } & {
  getAuthorById?: Maybe<
    { __typename?: "Author" } & Pick<Author, "id" | "name"> & {
        books?: Maybe<
          Array<Maybe<{ __typename?: "Book" } & Pick<Book, "id" | "name">>>
        >;
      }
  >;
};

export type GetBlogByIdQueryVariables = Exact<{
  id: Scalars["ID"];
}>;

export type GetBlogByIdQuery = { __typename?: "Query" } & {
  getBlogById?: Maybe<
    { __typename?: "Blog" } & Pick<
      Blog,
      "id" | "title" | "postDate" | "blogBody"
    > & {
        comments?: Maybe<
          Array<
            Maybe<
              { __typename?: "Comment" } & Pick<
                Comment,
                "name" | "postDate" | "comment"
              >
            >
          >
        >;
      }
  >;
};

export type GetBlogListQueryVariables = Exact<{ [key: string]: never }>;

export type GetBlogListQuery = { __typename?: "Query" } & {
  getBlogList?: Maybe<
    Array<
      Maybe<
        { __typename?: "Blog" } & Pick<
          Blog,
          "id" | "title" | "overview" | "postDate"
        >
      >
    >
  >;
};

export const GetAuthorByIdDocument = gql`
  query getAuthorById($id: ID!) {
    getAuthorById(id: $id) {
      id
      name
      books {
        id
        name
      }
    }
  }
`;
export const GetBlogByIdDocument = gql`
  query getBlogById($id: ID!) {
    getBlogById(id: $id) {
      id
      title
      postDate
      blogBody
      comments {
        name
        postDate
        comment
      }
    }
  }
`;
export const GetBlogListDocument = gql`
  query getBlogList {
    getBlogList {
      id
      title
      overview
      postDate
    }
  }
`;
