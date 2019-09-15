(ns pixi.BitmapFontLoader
  "{@link PIXI.Loader Loader} middleware for loading
  bitmap-based fonts suitable for using with {@link PIXI.BitmapText}."
  (:refer-clojure :exclude [use]))

(defn new
  "Constructor."
  ([]
    (new js/BitmapFontLoader)))

(defn *add
  "Method.

  Member of BitmapFontLoader.

  Called when the plugin is installed."
  ([]
    (-> js/BitmapFontLoader (.add))))

(defn *dirname
  "Method.

  Member of BitmapFontLoader.

  Replacement for NodeJS's path.dirname"
  ([url]
    (-> js/BitmapFontLoader (.dirname url))))

(defn *parse
  "Method.

  Member of BitmapFontLoader.

  Register a BitmapText font from loader resource."
  ([resource texture]
    (-> js/BitmapFontLoader (.parse resource texture))))

(defn *use
  "Method.

  Member of BitmapFontLoader.

  Called after a resource is loaded."
  ([resource next]
    (-> js/BitmapFontLoader (.use resource next))))

