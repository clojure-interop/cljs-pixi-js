(ns pixi.CanvasSpriteRenderer
  "Renderer dedicated to drawing and batching sprites."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([renderer]
    (new js/CanvasSpriteRenderer renderer)))

(defn destroy
  "Method.

  Member of CanvasSpriteRenderer.

  destroy the sprite object."
  ([this]
    (-> this (.destroy))))

(defn render
  "Method.

  Member of CanvasSpriteRenderer.

  Renders the sprite object."
  ([this sprite]
    (-> this (.render sprite))))

