<template>
  <div>
    <HelloWorld msg="Welcome to Your Vue.js + TypeScript App" />
    <GraphQL></GraphQL>
    <ArticleList></ArticleList>
  </div>
</template>

<script lang="ts">
import { defineComponent } from "vue";
import HelloWorld from "./components/HelloWorld.vue";
import GraphQL from "./components/graphql.vue";
import ArticleList from "./components/article-list.vue";

export default defineComponent({
  name: "App",
  components: {
    HelloWorld,
    GraphQL,
    ArticleList,
  },
});
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
