(ns pixi.Bounds
  "'Builder' pattern for bounds rectangles.
  This could be called an Axis-Aligned Bounding Box.
  It is not an actual shape. It is a mutable thing; no 'EMPTY'
  those kind of problems."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/Bounds)))

(defn add-bounds
  "Method.

  Member of Bounds.

  Adds other Bounds"
  ([this bounds]
    (-> this (.addBounds bounds))))

(defn add-bounds-area
  "Method.

  Member of Bounds.

  Adds other Bounds, masked with Rectangle"
  ([this bounds area]
    (-> this (.addBoundsArea bounds area))))

(defn add-bounds-mask
  "Method.

  Member of Bounds.

  Adds other Bounds, masked with Bounds"
  ([this bounds mask]
    (-> this (.addBoundsMask bounds mask))))

(defn add-bounds-matrix
  "Method.

  Member of Bounds.

  Adds other Bounds, multiplied by matrix. Bounds shouldn't be"
  ([this bounds matrix]
    (-> this (.addBoundsMatrix bounds matrix))))

(defn add-frame
  "Method.

  Member of Bounds.

  Adds sprite frame, transformed."
  ([this transform x0 y0 x1 y1]
    (-> this (.addFrame transform x0 y0 x1 y1))))

(defn add-frame-matrix
  "Method.

  Member of Bounds.

  Adds sprite frame, multiplied by matrix"
  ([this matrix x0 y0 x1 y1]
    (-> this (.addFrameMatrix matrix x0 y0 x1 y1))))

(defn add-frame-pad
  "Method.

  Member of Bounds.

  Adds padded frame. (x0, y0) should be strictly less than (x1,"
  ([this x0 y0 x1 y1 pad-x pad-y]
    (-> this (.addFramePad x0 y0 x1 y1 pad-x pad-y))))

(defn add-point
  "Method.

  Member of Bounds.

  This function should be inlined when its possible."
  ([this point]
    (-> this (.addPoint point))))

(defn add-quad
  "Method.

  Member of Bounds.

  Adds a quad, not transformed"
  ([this vertices]
    (-> this (.addQuad vertices))))

(defn add-vertex-data
  "Method.

  Member of Bounds.

  Adds screen vertices from array"
  ([this vertex-data begin-offset end-offset]
    (-> this (.addVertexData vertex-data begin-offset end-offset))))

(defn add-vertices
  "Method.

  Member of Bounds.

  Add an array of mesh vertices"
  ([this transform vertices begin-offset end-offset]
    (-> this (.addVertices transform vertices begin-offset end-offset))))

(defn add-vertices-matrix
  "Method.

  Member of Bounds.

  Add an array of mesh vertices"
  ([this matrix vertices begin-offset end-offset]
    (-> this (.addVerticesMatrix matrix vertices begin-offset end-offset)))
  ([this matrix vertices begin-offset end-offset pad-x]
    (-> this (.addVerticesMatrix matrix vertices begin-offset end-offset pad-x)))
  ([this matrix vertices begin-offset end-offset pad-x pad-y]
    (-> this (.addVerticesMatrix matrix vertices begin-offset end-offset pad-x pad-y))))

(defn clear
  "Method.

  Member of Bounds.

  Clears the bounds and resets."
  ([this]
    (-> this (.clear))))

(defn get-rectangle
  "Method.

  Member of Bounds.

  Can return Rectangle.EMPTY constant, either construct new rectangle,
  use your rectangle
  It is not guaranteed that it will return tempRect"
  ([this rect]
    (-> this (.getRectangle rect))))

(defn is-empty
  "Method.

  Member of Bounds.

  Checks if bounds are empty."
  ([this]
    (-> this (.isEmpty))))

(defn pad
  "Method.

  Member of Bounds.

  Pads bounds object, making it grow in all directions."
  ([this padding-x padding-y]
    (-> this (.pad padding-x padding-y))))

(defn max-x
  "Property.

  Member of Bounds."
  [this]
  (-> this .-maxX))

(defn set-max-x!
  "Property.

  Member of Bounds."
  [this val]
  (aset this "maxX" val))

(defn max-y
  "Property.

  Member of Bounds."
  [this]
  (-> this .-maxY))

(defn set-max-y!
  "Property.

  Member of Bounds."
  [this val]
  (aset this "maxY" val))

(defn min-x
  "Property.

  Member of Bounds."
  [this]
  (-> this .-minX))

(defn set-min-x!
  "Property.

  Member of Bounds."
  [this val]
  (aset this "minX" val))

(defn min-y
  "Property.

  Member of Bounds."
  [this]
  (-> this .-minY))

(defn set-min-y!
  "Property.

  Member of Bounds."
  [this val]
  (aset this "minY" val))

