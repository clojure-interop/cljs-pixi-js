(ns pixi.Transform
  "Transform that takes care about its versions"
  (:refer-clojure :exclude [identity]))

(defn new
  "Constructor."
  ([]
    (new js/Transform)))

(defn on-change
  "Method.

  Member of Transform.

  Called when a value changes."
  ([this]
    (-> this (.onChange))))

(defn set-from-matrix
  "Method.

  Member of Transform.

  Decomposes a matrix and sets the transforms properties based
  it."
  ([this matrix]
    (-> this (.setFromMatrix matrix))))

(defn update-local-transform
  "Method.

  Member of Transform.

  Updates the local transformation matrix."
  ([this]
    (-> this (.updateLocalTransform))))

(defn update-skew
  "Method.

  Member of Transform.

  Called when the skew or the rotation changes."
  ([this]
    (-> this (.updateSkew))))

(defn update-transform
  "Method.

  Member of Transform.

  Updates the local and the world transformation matrices."
  ([this parent-transform]
    (-> this (.updateTransform parent-transform))))

(defn identity
  "Property.

  Member of Transform.

  A default (identity) transform"
  []
  (-> js/Transform .-IDENTITY))

(defn set-identity!
  "Property.

  Member of Transform.

  A default (identity) transform"
  [val]
  (aset js/Transform "IDENTITY" val))

(defn local-transform
  "Property.

  Member of Transform.

  The local transformation matrix."
  [this]
  (-> this .-localTransform))

(defn set-local-transform!
  "Property.

  Member of Transform.

  The local transformation matrix."
  [this val]
  (aset this "localTransform" val))

(defn pivot
  "Property.

  Member of Transform.

  The pivot point of the displayObject that it rotates around."
  [this]
  (-> this .-pivot))

(defn set-pivot!
  "Property.

  Member of Transform.

  The pivot point of the displayObject that it rotates around."
  [this val]
  (aset this "pivot" val))

(defn position
  "Property.

  Member of Transform.

  The coordinate of the object relative to the local coordinates
  the parent."
  [this]
  (-> this .-position))

(defn set-position!
  "Property.

  Member of Transform.

  The coordinate of the object relative to the local coordinates
  the parent."
  [this val]
  (aset this "position" val))

(defn rotation
  "Property.

  Member of Transform.

  The rotation of the object in radians."
  [this]
  (-> this .-rotation))

(defn set-rotation!
  "Property.

  Member of Transform.

  The rotation of the object in radians."
  [this val]
  (aset this "rotation" val))

(defn scale
  "Property.

  Member of Transform.

  The scale factor of the object."
  [this]
  (-> this .-scale))

(defn set-scale!
  "Property.

  Member of Transform.

  The scale factor of the object."
  [this val]
  (aset this "scale" val))

(defn skew
  "Property.

  Member of Transform.

  The skew amount, on the x and y axis."
  [this]
  (-> this .-skew))

(defn set-skew!
  "Property.

  Member of Transform.

  The skew amount, on the x and y axis."
  [this val]
  (aset this "skew" val))

(defn world-transform
  "Property.

  Member of Transform.

  The world transformation matrix."
  [this]
  (-> this .-worldTransform))

(defn set-world-transform!
  "Property.

  Member of Transform.

  The world transformation matrix."
  [this val]
  (aset this "worldTransform" val))

