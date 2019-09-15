(ns pixi.Rectangle
  "Rectangle object is an area defined by its position, as indicated
  its top-left corner
  point (x, y) and by its width and its height."
  (:refer-clojure :exclude [empty type clone]))

(defn new
  "Constructor."
  ([]
    (new js/Rectangle))
  ([x]
    (new js/Rectangle x))
  ([x y]
    (new js/Rectangle x y))
  ([x y width]
    (new js/Rectangle x y width))
  ([x y width height]
    (new js/Rectangle x y width height)))

(defn ceil
  "Method.

  Member of Rectangle.

  Enlarges rectangle that way its corners lie on grid"
  ([this]
    (-> this (.ceil)))
  ([this resolution]
    (-> this (.ceil resolution)))
  ([this resolution eps]
    (-> this (.ceil resolution eps))))

(defn clone
  "Method.

  Member of Rectangle.

  Creates a clone of this Rectangle"
  ([this]
    (-> this (.clone))))

(defn contains
  "Method.

  Member of Rectangle.

  Checks whether the x and y coordinates given are contained within
  Rectangle"
  ([this x y]
    (-> this (.contains x y))))

(defn copy-from
  "Method.

  Member of Rectangle.

  Copies another rectangle to this one."
  ([this rectangle]
    (-> this (.copyFrom rectangle))))

(defn copy-to
  "Method.

  Member of Rectangle.

  Copies this rectangle to another one."
  ([this rectangle]
    (-> this (.copyTo rectangle))))

(defn enlarge
  "Method.

  Member of Rectangle.

  Enlarges this rectangle to include the passed rectangle."
  ([this rectangle]
    (-> this (.enlarge rectangle))))

(defn fit
  "Method.

  Member of Rectangle.

  Fits this rectangle around the passed one."
  ([this rectangle]
    (-> this (.fit rectangle))))

(defn pad
  "Method.

  Member of Rectangle.

  Pads the rectangle making it grow in all directions."
  ([this padding-x padding-y]
    (-> this (.pad padding-x padding-y))))

(defn empty
  "Property.

  Member of Rectangle.

  A constant empty rectangle."
  []
  (-> js/Rectangle .-EMPTY))

(defn set-empty!
  "Property.

  Member of Rectangle.

  A constant empty rectangle."
  [val]
  (aset js/Rectangle "EMPTY" val))

(defn bottom
  "Property.

  Member of Rectangle.

  returns the bottom edge of the rectangle"
  [this]
  (-> this .-bottom))

(defn set-bottom!
  "Property.

  Member of Rectangle.

  returns the bottom edge of the rectangle"
  [this val]
  (aset this "bottom" val))

(defn height
  "Property.

  Member of Rectangle."
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of Rectangle."
  [this val]
  (aset this "height" val))

(defn left
  "Property.

  Member of Rectangle.

  returns the left edge of the rectangle"
  [this]
  (-> this .-left))

(defn set-left!
  "Property.

  Member of Rectangle.

  returns the left edge of the rectangle"
  [this val]
  (aset this "left" val))

(defn right
  "Property.

  Member of Rectangle.

  returns the right edge of the rectangle"
  [this]
  (-> this .-right))

(defn set-right!
  "Property.

  Member of Rectangle.

  returns the right edge of the rectangle"
  [this val]
  (aset this "right" val))

(defn top
  "Property.

  Member of Rectangle.

  returns the top edge of the rectangle"
  [this]
  (-> this .-top))

(defn set-top!
  "Property.

  Member of Rectangle.

  returns the top edge of the rectangle"
  [this val]
  (aset this "top" val))

(defn type
  "Property.

  Member of Rectangle.

  The type of the object, mainly used to avoid `instanceof` checks"
  [this]
  (-> this .-type))

(defn set-type!
  "Property.

  Member of Rectangle.

  The type of the object, mainly used to avoid `instanceof` checks"
  [this val]
  (aset this "type" val))

(defn width
  "Property.

  Member of Rectangle."
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of Rectangle."
  [this val]
  (aset this "width" val))

(defn x
  "Property.

  Member of Rectangle."
  [this]
  (-> this .-x))

(defn set-x!
  "Property.

  Member of Rectangle."
  [this val]
  (aset this "x" val))

(defn y
  "Property.

  Member of Rectangle."
  [this]
  (-> this .-y))

(defn set-y!
  "Property.

  Member of Rectangle."
  [this val]
  (aset this "y" val))

