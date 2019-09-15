(ns pixi.TilingSpriteRenderer
  "Extends - ObjectRenderer.

  WebGL renderer plugin for tiling sprites"
  (:refer-clojure :exclude []))

(defn new
  "Constructor.

  constructor for renderer"
  ([renderer]
    (new js/TilingSpriteRenderer renderer)))

(defn render
  "Method.

  Member of TilingSpriteRenderer."
  ([this ts]
    (-> this (.render ts))))

