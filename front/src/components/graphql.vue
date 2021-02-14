<template>
  <div>
    <div v-if="loading">Loading...</div>
    <p v-if="blogList">{{ blogList[0].title }}</p>
    <button @click="blogMutation()">aa</button>
  </div>
</template>

<script>
import { defineComponent } from "vue";
import {
  GetBlogListDocument,
  RegistBlogDocument,
} from "../../graphql/gen/gql-types";
import { useQuery, useResult, useMutation } from "@vue/apollo-composable";

export default defineComponent({
  name: "GraphQL",
  setup() {
    // Your data & logic here...
    // const { result, loading } = useQuery(GetAuthorByIdDocument, { id: 1 });
    const { result, loading } = useQuery(GetBlogListDocument);
    const blogList = useResult(result, null, (data) => data.getBlogList);

    // const registBlogMutation = {
    //   blogBlod: "aaaaa",
    //   overview: "aaaaa",
    //   temporarilySaved: false,
    //   title: "aaaa",
    // };
    const { mutate: blogMutation } = useMutation(RegistBlogDocument, {
      variables: {
        registBlogInput: {
          blogBody: "aaaaa",
          overview: "aaaaa",
          temporarilySaved: false,
          title: "aaaa",
        },
      },
    });

    // function registBlog() {
    //   blogMutation({ registBlogMutation });
    // }
    return { blogList, loading, blogMutation };
  },
});
</script>

<style scoped></style>
