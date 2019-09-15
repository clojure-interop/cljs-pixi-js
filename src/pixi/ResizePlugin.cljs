(ns pixi.ResizePlugin
  "Middleware for for Application's resize functionality"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/ResizePlugin)))

(defn *destroy
  "Method.

  Member of ResizePlugin.

  Clean up the ticker, scoped to application"
  ([]
    (-> js/ResizePlugin (.destroy))))

(defn *init
  "Method.

  Member of ResizePlugin.

  Initialize the plugin with scope of application instance"
  ([]
    (-> js/ResizePlugin (.init)))
  ([options]
    (-> js/ResizePlugin (.init options))))

(defn resize
  "Method.

  Member of ResizePlugin.

  If `resizeTo` is set, calling this function
  will resize to the width and height of that element."
  ([this]
    (-> this (.resize))))

(defn resize-to
  "Property.

  Member of ResizePlugin.

  The element or window to resize the application to."
  [this]
  (-> this .-resizeTo))

(defn set-resize-to!
  "Property.

  Member of ResizePlugin.

  The element or window to resize the application to."
  [this val]
  (aset this "resizeTo" val))

