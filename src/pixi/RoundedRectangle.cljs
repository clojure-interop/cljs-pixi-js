(ns pixi.RoundedRectangle
  "The Rounded Rectangle object is an area that has nice rounded
  as indicated by its
  top-left corner point (x, y) and by its width and its height
  its radius."
  (:refer-clojure :exclude [type clone]))

(defn new
  "Constructor."
  ([]
    (new js/RoundedRectangle))
  ([x]
    (new js/RoundedRectangle x))
  ([x y]
    (new js/RoundedRectangle x y))
  ([x y width]
    (new js/RoundedRectangle x y width))
  ([x y width height]
    (new js/RoundedRectangle x y width height))
  ([x y width height radius]
    (new js/RoundedRectangle x y width height radius)))

(defn clone
  "Method.

  Member of RoundedRectangle.

  Creates a clone of this Rounded Rectangle"
  ([this]
    (-> this (.clone))))

(defn contains
  "Method.

  Member of RoundedRectangle.

  Checks whether the x and y coordinates given are contained within
  Rounded Rectangle"
  ([this x y]
    (-> this (.contains x y))))

(defn height
  "Property.

  Member of RoundedRectangle."
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of RoundedRectangle."
  [this val]
  (aset this "height" val))

(defn radius
  "Property.

  Member of RoundedRectangle."
  [this]
  (-> this .-radius))

(defn set-radius!
  "Property.

  Member of RoundedRectangle."
  [this val]
  (aset this "radius" val))

(defn type
  "Property.

  Member of RoundedRectangle.

  The type of the object, mainly used to avoid `instanceof` checks"
  [this]
  (-> this .-type))

(defn set-type!
  "Property.

  Member of RoundedRectangle.

  The type of the object, mainly used to avoid `instanceof` checks"
  [this val]
  (aset this "type" val))

(defn width
  "Property.

  Member of RoundedRectangle."
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of RoundedRectangle."
  [this val]
  (aset this "width" val))

(defn x
  "Property.

  Member of RoundedRectangle."
  [this]
  (-> this .-x))

(defn set-x!
  "Property.

  Member of RoundedRectangle."
  [this val]
  (aset this "x" val))

(defn y
  "Property.

  Member of RoundedRectangle."
  [this]
  (-> this .-y))

(defn set-y!
  "Property.

  Member of RoundedRectangle."
  [this val]
  (aset this "y" val))

