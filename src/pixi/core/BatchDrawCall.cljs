(ns pixi.core.BatchDrawCall
  "Used by the batcher to draw batches.
  Each one of these contains all information required to draw a
  geometry."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/BatchDrawCall)))

