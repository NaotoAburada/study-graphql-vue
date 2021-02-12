const fs = require("fs");
const path = require("path");

const loadGeneratedPath = path.resolve(__dirname, "../gen/gql-types.ts");

fs.writeFileSync(
  loadGeneratedPath,
  fs
    .readFileSync(loadGeneratedPath, "utf8")
    .replace(/@vue\/composition-api/m, "vue")
);
