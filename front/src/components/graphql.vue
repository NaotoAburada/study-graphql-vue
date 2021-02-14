<template>
  <div>
    <div v-if="loading">Loading...</div>
    <p v-if="blogList">{{ blogList[0].title }}</p>
  </div>
</template>

<script>
import { defineComponent } from "vue";
import { GetBlogListDocument } from "../../graphql/gen/gql-types";
import { useQuery, useResult } from "@vue/apollo-composable";

export default defineComponent({
  name: "GraphQL",
  setup() {
    // Your data & logic here...
    // const { result, loading } = useQuery(GetAuthorByIdDocument, { id: 1 });
    const { result, loading } = useQuery(GetBlogListDocument);
    const blogList = useResult(result, null, (data) => data.getBlogList);
    return { blogList, loading };
  },
});
</script>

<style scoped></style>
