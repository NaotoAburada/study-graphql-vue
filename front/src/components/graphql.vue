<template>
  <div>
    <div v-if="loading">Loading...</div>
    <p v-if="wines">{{ wines.name }}</p>
  </div>
</template>

<script>
import { defineComponent } from "vue";
import { GetAuthorByIdDocument } from "../../graphql/gen/gql-types";
import { useQuery, useResult } from "@vue/apollo-composable";

export default defineComponent({
  name: "GraphQL",
  setup() {
    // Your data & logic here...
    const { result, loading } = useQuery(GetAuthorByIdDocument, { id: 1 });
    const wines = useResult(result, null, (data) => data.getAuthorById);
    return { wines, loading };
  },
});
</script>

<style scoped></style>
