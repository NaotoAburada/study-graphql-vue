import { createHttpLink } from "apollo-link-http";
import { InMemoryCache } from "apollo-cache-inmemory";
import { ApolloClient } from "apollo-client";

const httpLink = createHttpLink({
  uri: "http://localhost:8080/graphql",
});

const cache = new InMemoryCache();

const apolloClient = new ApolloClient({
  link: httpLink,
  cache,
});
// import { ApolloClient } from "apollo-client";
// import { HttpLink } from "apollo-link-http";
// import { InMemoryCache } from "apollo-cache-inmemory";
// import VueApollo from "vue-apollo";

// const httpLink = new HttpLink({
//   uri: "http://localhost:8080/graphql",
// });

// // Create the apollo client
// export const apolloClient = new ApolloClient({
//   link: httpLink,
//   cache: new InMemoryCache(),
//   connectToDevTools: true,
// });

// export const apolloProvider = new VueApollo({
//   defaultClient: apolloClient,
// });
