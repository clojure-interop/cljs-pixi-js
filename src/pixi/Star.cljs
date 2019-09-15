(ns pixi.Star
  "Extends - Polygon.

  Draw a star shape with an arbitrary number of points."
  (:refer-clojure :exclude [type clone]))

(defn new
  "Constructor."
  ([x y points radius]
    (new js/Star x y points radius))
  ([x y points radius inner-radius]
    (new js/Star x y points radius inner-radius))
  ([x y points radius inner-radius rotation]
    (new js/Star x y points radius inner-radius rotation)))

(defn clone
  "Method.

  Member of Star.

  Creates a clone of this polygon"
  ([this]
    (-> this (.clone))))

(defn contains
  "Method.

  Member of Star.

  Checks whether the x and y coordinates passed to this function
  contained within this polygon"
  ([this x y]
    (-> this (.contains x y))))

(defn close-stroke
  "Property.

  Member of Star.

  `false` after moveTo, `true` after `closePath`. In all other
  it is `true`."
  [this]
  (-> this .-closeStroke))

(defn set-close-stroke!
  "Property.

  Member of Star.

  `false` after moveTo, `true` after `closePath`. In all other
  it is `true`."
  [this val]
  (aset this "closeStroke" val))

(defn points
  "Property.

  Member of Star.

  An array of the points of this polygon"
  [this]
  (-> this .-points))

(defn set-points!
  "Property.

  Member of Star.

  An array of the points of this polygon"
  [this val]
  (aset this "points" val))

(defn type
  "Property.

  Member of Star.

  The type of the object, mainly used to avoid `instanceof` checks"
  [this]
  (-> this .-type))

(defn set-type!
  "Property.

  Member of Star.

  The type of the object, mainly used to avoid `instanceof` checks"
  [this val]
  (aset this "type" val))

