(ns pixi.core.BatchSystem
  "Extends - System.

  System plugin to the renderer to manage batching."
  (:refer-clojure :exclude [flush]))

(defn new
  "Constructor."
  ([renderer]
    (new js/BatchSystem renderer)))

(defn destroy
  "Method.

  Member of BatchSystem.

  Generic destroy methods to be overridden by the subclass"
  ([this]
    (-> this (.destroy))))

(defn flush
  "Method.

  Member of BatchSystem.

  This should be called if you wish to do some custom rendering
  It will basically render anything that may be batched up such
  sprites"
  ([this]
    (-> this (.flush))))

(defn reset
  "Method.

  Member of BatchSystem.

  Reset the system to an empty renderer"
  ([this]
    (-> this (.reset))))

(defn set-object-renderer
  "Method.

  Member of BatchSystem.

  Changes the current renderer to the one given in parameter"
  ([this object-renderer]
    (-> this (.setObjectRenderer object-renderer))))

(defn current-renderer
  "Property.

  Member of BatchSystem.

  The currently active ObjectRenderer."
  [this]
  (-> this .-currentRenderer))

(defn set-current-renderer!
  "Property.

  Member of BatchSystem.

  The currently active ObjectRenderer."
  [this val]
  (aset this "currentRenderer" val))

(defn empty-renderer
  "Property.

  Member of BatchSystem.

  An empty renderer."
  [this]
  (-> this .-emptyRenderer))

(defn set-empty-renderer!
  "Property.

  Member of BatchSystem.

  An empty renderer."
  [this val]
  (aset this "emptyRenderer" val))

(defn renderer
  "Property.

  Member of BatchSystem.

  The renderer this manager works for."
  [this]
  (-> this .-renderer))

(defn set-renderer!
  "Property.

  Member of BatchSystem.

  The renderer this manager works for."
  [this val]
  (aset this "renderer" val))

