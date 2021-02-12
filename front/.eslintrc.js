module.exports = {
  parser: "vue-eslint-parser",
  plugins: ["@typescript-eslint", "prettier"],
  env: {
    browser: true,
    commonjs: true,
    es6: true,
  },
  extends: [
    "eslint:recommended",
    "plugin:vue/vue3-recommended", // "plugin:vue/vue3-strongly-recommended"もあります
    "@vue/typescript",
    "plugin:prettier/recommended",
    "prettier/vue", // 必須ではありません(ルールを書き換えるだけのため)
    "prettier/@typescript-eslint", // 必須ではありません(ルールを書き換えるだけのため)
  ],
  globals: {
    Atomics: "readonly",
    SharedArrayBuffer: "readonly",
  },
  parserOptions: {
    ecmaVersion: 2017,
    sourceType: "module",
  },
  rules: {},
};
