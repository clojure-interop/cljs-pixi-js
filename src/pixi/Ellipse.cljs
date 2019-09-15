(ns pixi.Ellipse
  "The Ellipse object is used to help draw graphics and can also
  used to specify a hit area for displayObjects."
  (:refer-clojure :exclude [type clone]))

(defn new
  "Constructor."
  ([]
    (new js/Ellipse))
  ([x]
    (new js/Ellipse x))
  ([x y]
    (new js/Ellipse x y))
  ([x y half-width]
    (new js/Ellipse x y half-width))
  ([x y half-width half-height]
    (new js/Ellipse x y half-width half-height)))

(defn clone
  "Method.

  Member of Ellipse.

  Creates a clone of this Ellipse instance"
  ([this]
    (-> this (.clone))))

(defn contains
  "Method.

  Member of Ellipse.

  Checks whether the x and y coordinates given are contained within
  ellipse"
  ([this x y]
    (-> this (.contains x y))))

(defn get-bounds
  "Method.

  Member of Ellipse.

  Returns the framing rectangle of the ellipse as a Rectangle object"
  ([this]
    (-> this (.getBounds))))

(defn height
  "Property.

  Member of Ellipse."
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of Ellipse."
  [this val]
  (aset this "height" val))

(defn type
  "Property.

  Member of Ellipse.

  The type of the object, mainly used to avoid `instanceof` checks"
  [this]
  (-> this .-type))

(defn set-type!
  "Property.

  Member of Ellipse.

  The type of the object, mainly used to avoid `instanceof` checks"
  [this val]
  (aset this "type" val))

(defn width
  "Property.

  Member of Ellipse."
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of Ellipse."
  [this val]
  (aset this "width" val))

(defn x
  "Property.

  Member of Ellipse."
  [this]
  (-> this .-x))

(defn set-x!
  "Property.

  Member of Ellipse."
  [this val]
  (aset this "x" val))

(defn y
  "Property.

  Member of Ellipse."
  [this]
  (-> this .-y))

(defn set-y!
  "Property.

  Member of Ellipse."
  [this val]
  (aset this "y" val))

