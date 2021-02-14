<template>
  <div>
    <ul v-for="n of 8" :key="n">
      <ArticleHeadline></ArticleHeadline>
    </ul>
    <md-divider></md-divider>
    <br />
  </div>
</template>

<script lang="ts">
import { defineComponent } from "vue";
import ArticleHeadline from "./article-headline.vue";

export default defineComponent({
  name: "ArticleList",
  components: {
    ArticleHeadline,
  },
});
</script>

<style scoped>
div {
  text-align: left;
}
</style>
