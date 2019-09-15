(ns pixi.TextureLoader
  "Loader plugin for handling Texture resources."
  (:refer-clojure :exclude [use]))

(defn new
  "Constructor."
  ([]
    (new js/TextureLoader)))

(defn *use
  "Method.

  Member of TextureLoader.

  Called after a resource is loaded."
  ([resource next]
    (-> js/TextureLoader (.use resource next))))

