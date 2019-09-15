(ns pixi.ObservablePoint
  "The Point object represents a location in a two-dimensional coordinate
  where x represents
  the horizontal axis and y represents the vertical axis.
  An ObservablePoint is a point that triggers a callback when the
  position is changed."
  (:refer-clojure :exclude [clone set]))

(defn new
  "Constructor."
  ([cb scope]
    (new js/ObservablePoint cb scope))
  ([cb scope x]
    (new js/ObservablePoint cb scope x))
  ([cb scope x y]
    (new js/ObservablePoint cb scope x y)))

(defn clone
  "Method.

  Member of ObservablePoint.

  Creates a clone of this point.
  The callback and scope params can be overidden otherwise they
  default
  to the clone object's values."
  ([this]
    (-> this (.clone)))
  ([this cb]
    (-> this (.clone cb)))
  ([this cb scope]
    (-> this (.clone cb scope))))

(defn copy-from
  "Method.

  Member of ObservablePoint.

  Copies x and y from the given point"
  ([this p]
    (-> this (.copyFrom p))))

(defn copy-to
  "Method.

  Member of ObservablePoint.

  Copies x and y into the given point"
  ([this p]
    (-> this (.copyTo p))))

(defn equals
  "Method.

  Member of ObservablePoint.

  Returns true if the given point is equal to this point"
  ([this p]
    (-> this (.equals p))))

(defn set
  "Method.

  Member of ObservablePoint.

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

  Member of ObservablePoint.

  The position of the displayObject on the x axis relative to the
  coordinates of the parent."
  [this]
  (-> this .-x))

(defn set-x!
  "Property.

  Member of ObservablePoint.

  The position of the displayObject on the x axis relative to the
  coordinates of the parent."
  [this val]
  (aset this "x" val))

(defn y
  "Property.

  Member of ObservablePoint.

  The position of the displayObject on the x axis relative to the
  coordinates of the parent."
  [this]
  (-> this .-y))

(defn set-y!
  "Property.

  Member of ObservablePoint.

  The position of the displayObject on the x axis relative to the
  coordinates of the parent."
  [this val]
  (aset this "y" val))

