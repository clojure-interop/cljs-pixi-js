(ns pixi.GraphicsData
  "A class to contain data useful for Graphics objects"
  (:refer-clojure :exclude [type clone]))

(defn new
  "Constructor."
  ([shape]
    (new js/GraphicsData shape))
  ([shape fill-style]
    (new js/GraphicsData shape fill-style))
  ([shape fill-style line-style]
    (new js/GraphicsData shape fill-style line-style))
  ([shape fill-style line-style matrix]
    (new js/GraphicsData shape fill-style line-style matrix)))

(defn clone
  "Method.

  Member of GraphicsData.

  Creates a new GraphicsData object with the same values as this"
  ([this]
    (-> this (.clone))))

(defn destroy
  "Method.

  Member of GraphicsData.

  Destroys the Graphics data."
  ([this]
    (-> this (.destroy))))

(defn fill-style
  "Property.

  Member of GraphicsData.

  The style of the fill."
  [this]
  (-> this .-fillStyle))

(defn set-fill-style!
  "Property.

  Member of GraphicsData.

  The style of the fill."
  [this val]
  (aset this "fillStyle" val))

(defn holes
  "Property.

  Member of GraphicsData.

  The collection of holes."
  [this]
  (-> this .-holes))

(defn set-holes!
  "Property.

  Member of GraphicsData.

  The collection of holes."
  [this val]
  (aset this "holes" val))

(defn line-style
  "Property.

  Member of GraphicsData.

  The style of the line."
  [this]
  (-> this .-lineStyle))

(defn set-line-style!
  "Property.

  Member of GraphicsData.

  The style of the line."
  [this val]
  (aset this "lineStyle" val))

(defn matrix
  "Property.

  Member of GraphicsData.

  The transform matrix."
  [this]
  (-> this .-matrix))

(defn set-matrix!
  "Property.

  Member of GraphicsData.

  The transform matrix."
  [this val]
  (aset this "matrix" val))

(defn points
  "Property.

  Member of GraphicsData.

  The collection of points."
  [this]
  (-> this .-points))

(defn set-points!
  "Property.

  Member of GraphicsData.

  The collection of points."
  [this val]
  (aset this "points" val))

(defn shape
  "Property.

  Member of GraphicsData.

  The shape object to draw."
  [this]
  (-> this .-shape))

(defn set-shape!
  "Property.

  Member of GraphicsData.

  The shape object to draw."
  [this val]
  (aset this "shape" val))

(defn type
  "Property.

  Member of GraphicsData.

  The type of the shape, see the Const.Shapes file for all the
  types,"
  [this]
  (-> this .-type))

(defn set-type!
  "Property.

  Member of GraphicsData.

  The type of the shape, see the Const.Shapes file for all the
  types,"
  [this val]
  (aset this "type" val))

