(ns pixi.Polygon
  "A class to define a shape via user defined co-orinates."
  (:refer-clojure :exclude [type clone]))

(defn new
  "Constructor."
  ([points]
    (new js/Polygon points)))

(defn clone
  "Method.

  Member of Polygon.

  Creates a clone of this polygon"
  ([this]
    (-> this (.clone))))

(defn contains
  "Method.

  Member of Polygon.

  Checks whether the x and y coordinates passed to this function
  contained within this polygon"
  ([this x y]
    (-> this (.contains x y))))

(defn close-stroke
  "Property.

  Member of Polygon.

  `false` after moveTo, `true` after `closePath`. In all other
  it is `true`."
  [this]
  (-> this .-closeStroke))

(defn set-close-stroke!
  "Property.

  Member of Polygon.

  `false` after moveTo, `true` after `closePath`. In all other
  it is `true`."
  [this val]
  (aset this "closeStroke" val))

(defn points
  "Property.

  Member of Polygon.

  An array of the points of this polygon"
  [this]
  (-> this .-points))

(defn set-points!
  "Property.

  Member of Polygon.

  An array of the points of this polygon"
  [this val]
  (aset this "points" val))

(defn type
  "Property.

  Member of Polygon.

  The type of the object, mainly used to avoid `instanceof` checks"
  [this]
  (-> this .-type))

(defn set-type!
  "Property.

  Member of Polygon.

  The type of the object, mainly used to avoid `instanceof` checks"
  [this val]
  (aset this "type" val))

