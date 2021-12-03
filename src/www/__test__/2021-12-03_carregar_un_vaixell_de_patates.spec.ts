import { postLineSteps } from "./postLineSteps";
import { PostTestFactory } from "./testPost/PostTestFactory";

new PostTestFactory().create(
  "2021-12-03_carregar_un_vaixell_de_patates",
  postLineSteps
);
