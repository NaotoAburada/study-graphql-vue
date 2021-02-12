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

export type Query = {
  __typename?: "Query";
  getAuthorById?: Maybe<Author>;
  getAuthorByName?: Maybe<Array<Maybe<Author>>>;
  getAuthorByMultiConditions?: Maybe<Array<Maybe<Author>>>;
};

export type QueryGetAuthorByIdArgs = {
  id: Scalars["ID"];
};

export type QueryGetAuthorByNameArgs = {
  name: Scalars["String"];
};

export type QueryGetAuthorByMultiConditionsArgs = {
  id?: Maybe<Scalars["ID"]>;
  name?: Maybe<Scalars["String"]>;
};

export type RegistBookResponse = {
  __typename?: "RegistBookResponse";
  authorId: Scalars["ID"];
  name: Scalars["String"];
  isRegist: Scalars["Boolean"];
  errorMessage?: Maybe<Scalars["String"]>;
};

export type Book = {
  __typename?: "Book";
  id: Scalars["ID"];
  name: Scalars["String"];
};

export type Author = {
  __typename?: "Author";
  id: Scalars["ID"];
  name: Scalars["String"];
  books?: Maybe<Array<Maybe<Book>>>;
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

export type RegistAuthorResponse = {
  __typename?: "RegistAuthorResponse";
  name: Scalars["String"];
  isRegist: Scalars["Boolean"];
  errorMessage?: Maybe<Scalars["String"]>;
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
