(ns pixi.core.BatchGeometry
  "Geometry used to batch standard PIXI content (e.g. Mesh, Sprite,
  objects)."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/BatchGeometry))
  ([static]
    (new js/BatchGeometry static)))

