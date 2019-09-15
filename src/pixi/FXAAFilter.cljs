(ns pixi.FXAAFilter
  "Extends - Filter.

  Basic FXAA (Fast Approximate Anti-Aliasing) implementation based
  the code on geeks3d.com
  with the modification that the texture2DLod stuff was removed
  it is unsupported by WebGL."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/FXAAFilter)))

