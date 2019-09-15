(ns pixi.core.ObjectRenderer
  "Extends - System.

  Base for a common object renderer that can be used as a
  system renderer plugin."
  (:refer-clojure :exclude [flush]))

(defn new
  "Constructor."
  ([renderer]
    (new js/ObjectRenderer renderer)))

(defn destroy
  "Method.

  Member of ObjectRenderer.

  Generic destruction method that frees all resources. This
  should be called by subclasses."
  ([this]
    (-> this (.destroy))))

(defn flush
  "Method.

  Member of ObjectRenderer.

  Stub method that should be used to empty the current
  batch by rendering objects now."
  ([this]
    (-> this (.flush))))

(defn render
  "Method.

  Member of ObjectRenderer.

  Keeps the object to render. It doesn't have to be
  rendered immediately."
  ([this object]
    (-> this (.render object))))

(defn start
  "Method.

  Member of ObjectRenderer.

  Stub method that initializes any state required before
  rendering starts. It is different from the `prerender`
  signal, which occurs every frame, in that it is called
  whenever an object requests _this_ renderer specifically."
  ([this]
    (-> this (.start))))

(defn stop
  "Method.

  Member of ObjectRenderer.

  Stops the renderer. It should free up any state and
  become dormant."
  ([this]
    (-> this (.stop))))

(defn renderer
  "Property.

  Member of ObjectRenderer.

  The renderer this manager works for."
  [this]
  (-> this .-renderer))

(defn set-renderer!
  "Property.

  Member of ObjectRenderer.

  The renderer this manager works for."
  [this val]
  (aset this "renderer" val))

