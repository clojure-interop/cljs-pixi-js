(ns pixi.Point
  "The Point object represents a location in a two-dimensional coordinate
  where x represents
  the horizontal axis and y represents the vertical axis."
  (:refer-clojure :exclude [clone set]))

(defn new
  "Constructor."
  ([]
    (new js/Point))
  ([x]
    (new js/Point x))
  ([x y]
    (new js/Point x y)))

(defn clone
  "Method.

  Member of Point.

  Creates a clone of this point"
  ([this]
    (-> this (.clone))))

(defn copy-from
  "Method.

  Member of Point.

  Copies x and y from the given point"
  ([this p]
    (-> this (.copyFrom p))))

(defn copy-to
  "Method.

  Member of Point.

  Copies x and y into the given point"
  ([this p]
    (-> this (.copyTo p))))

(defn equals
  "Method.

  Member of Point.

  Returns true if the given point is equal to this point"
  ([this p]
    (-> this (.equals p))))

(defn set
  "Method.

  Member of Point.

  Sets the point to a new x and y position.
  If y is omitted, both x and y will be set to x."
  ([this]
    (-> this (.set)))
  ([this x]
    (-> this (.set x)))
  ([this x y]
    (-> this (.set x y))))

(defn x
  "Property.

  Member of Point."
  [this]
  (-> this .-x))

(defn set-x!
  "Property.

  Member of Point."
  [this val]
  (aset this "x" val))

(defn y
  "Property.

  Member of Point."
  [this]
  (-> this .-y))

(defn set-y!
  "Property.

  Member of Point."
  [this val]
  (aset this "y" val))

