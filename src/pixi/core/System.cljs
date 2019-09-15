(ns pixi.core.System
  "System is a base class used for extending systems used by the
  PIXI.Renderer}"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([renderer]
    (new js/System renderer)))

(defn destroy
  "Method.

  Member of System.

  Generic destroy methods to be overridden by the subclass"
  ([this]
    (-> this (.destroy))))

(defn renderer
  "Property.

  Member of System.

  The renderer this manager works for."
  [this]
  (-> this .-renderer))

(defn set-renderer!
  "Property.

  Member of System.

  The renderer this manager works for."
  [this val]
  (aset this "renderer" val))

