(ns pixi.Circle
  "The Circle object is used to help draw graphics and can also
  used to specify a hit area for displayObjects."
  (:refer-clojure :exclude [type clone]))

(defn new
  "Constructor."
  ([]
    (new js/Circle))
  ([x]
    (new js/Circle x))
  ([x y]
    (new js/Circle x y))
  ([x y radius]
    (new js/Circle x y radius)))

(defn clone
  "Method.

  Member of Circle.

  Creates a clone of this Circle instance"
  ([this]
    (-> this (.clone))))

(defn contains
  "Method.

  Member of Circle.

  Checks whether the x and y coordinates given are contained within
  circle"
  ([this x y]
    (-> this (.contains x y))))

(defn get-bounds
  "Method.

  Member of Circle.

  Returns the framing rectangle of the circle as a Rectangle object"
  ([this]
    (-> this (.getBounds))))

(defn radius
  "Property.

  Member of Circle."
  [this]
  (-> this .-radius))

(defn set-radius!
  "Property.

  Member of Circle."
  [this val]
  (aset this "radius" val))

(defn type
  "Property.

  Member of Circle.

  The type of the object, mainly used to avoid `instanceof` checks"
  [this]
  (-> this .-type))

(defn set-type!
  "Property.

  Member of Circle.

  The type of the object, mainly used to avoid `instanceof` checks"
  [this val]
  (aset this "type" val))

(defn x
  "Property.

  Member of Circle."
  [this]
  (-> this .-x))

(defn set-x!
  "Property.

  Member of Circle."
  [this val]
  (aset this "x" val))

(defn y
  "Property.

  Member of Circle."
  [this]
  (-> this .-y))

(defn set-y!
  "Property.

  Member of Circle."
  [this val]
  (aset this "y" val))

