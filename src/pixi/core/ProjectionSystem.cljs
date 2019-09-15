(ns pixi.core.ProjectionSystem
  "Extends - System.

  System plugin to the renderer to manage the projection matrix."
  (:refer-clojure :exclude [update]))

(defn new
  "Constructor."
  ([renderer]
    (new js/ProjectionSystem renderer)))

(defn calculate-projection
  "Method.

  Member of ProjectionSystem.

  Updates the projection matrix based on a projection frame (which
  a rectangle)"
  ([this destination-frame source-frame resolution root]
    (-> this (.calculateProjection destination-frame source-frame resolution root))))

(defn destroy
  "Method.

  Member of ProjectionSystem.

  Generic destroy methods to be overridden by the subclass"
  ([this]
    (-> this (.destroy))))

(defn set-transform
  "Method.

  Member of ProjectionSystem.

  Sets the transform of the active render target to the given matrix"
  ([this]
    (-> this (.setTransform))))

(defn update
  "Method.

  Member of ProjectionSystem.

  Updates the projection matrix based on a projection frame (which
  a rectangle)"
  ([this destination-frame source-frame resolution root]
    (-> this (.update destination-frame source-frame resolution root))))

(defn default-frame
  "Property.

  Member of ProjectionSystem.

  Default destination frame"
  [this]
  (-> this .-defaultFrame))

(defn set-default-frame!
  "Property.

  Member of ProjectionSystem.

  Default destination frame"
  [this val]
  (aset this "defaultFrame" val))

(defn destination-frame
  "Property.

  Member of ProjectionSystem.

  Destination frame"
  [this]
  (-> this .-destinationFrame))

(defn set-destination-frame!
  "Property.

  Member of ProjectionSystem.

  Destination frame"
  [this val]
  (aset this "destinationFrame" val))

(defn projection-matrix
  "Property.

  Member of ProjectionSystem.

  Project matrix"
  [this]
  (-> this .-projectionMatrix))

(defn set-projection-matrix!
  "Property.

  Member of ProjectionSystem.

  Project matrix"
  [this val]
  (aset this "projectionMatrix" val))

(defn renderer
  "Property.

  Member of ProjectionSystem.

  The renderer this manager works for."
  [this]
  (-> this .-renderer))

(defn set-renderer!
  "Property.

  Member of ProjectionSystem.

  The renderer this manager works for."
  [this val]
  (aset this "renderer" val))

(defn source-frame
  "Property.

  Member of ProjectionSystem.

  Source frame"
  [this]
  (-> this .-sourceFrame))

(defn set-source-frame!
  "Property.

  Member of ProjectionSystem.

  Source frame"
  [this val]
  (aset this "sourceFrame" val))

(defn transform
  "Property.

  Member of ProjectionSystem.

  A transform that will be appended to the projection matrix
  if null, nothing will be applied"
  [this]
  (-> this .-transform))

(defn set-transform!
  "Property.

  Member of ProjectionSystem.

  A transform that will be appended to the projection matrix
  if null, nothing will be applied"
  [this val]
  (aset this "transform" val))

