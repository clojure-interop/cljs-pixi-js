(ns pixi.SpritesheetLoader
  "{@link PIXI.Loader Loader} middleware for loading texture atlases
  have been created with
  TexturePacker or similar JSON-based spritesheet.
  This middleware automatically generates Texture resources."
  (:refer-clojure :exclude [use]))

(defn new
  "Constructor."
  ([]
    (new js/SpritesheetLoader)))

(defn *get-resource-path
  "Method.

  Member of SpritesheetLoader.

  Get the spritesheets root path"
  ([resource base-url]
    (-> js/SpritesheetLoader (.getResourcePath resource base-url))))

(defn *use
  "Method.

  Member of SpritesheetLoader.

  Called after a resource is loaded."
  ([resource next]
    (-> js/SpritesheetLoader (.use resource next))))

