(ns pixi.LineStyle
  "Extends - FillStyle.

  Represents the line style for Graphics."
  (:refer-clojure :exclude [clone]))

(defn new
  "Constructor."
  ([]
    (new js/LineStyle)))

(defn clone
  "Method.

  Member of LineStyle.

  Clones the object"
  ([this]
    (-> this (.clone))))

(defn destroy
  "Method.

  Member of LineStyle.

  Destroy and don't use after this"
  ([this]
    (-> this (.destroy))))

(defn reset
  "Method.

  Member of LineStyle.

  Reset the line style to default."
  ([this]
    (-> this (.reset))))

(defn alignment
  "Property.

  Member of LineStyle.

  The alignment of any lines drawn (0.5 = middle, 1 = outter, 0
  inner)."
  [this]
  (-> this .-alignment))

(defn set-alignment!
  "Property.

  Member of LineStyle.

  The alignment of any lines drawn (0.5 = middle, 1 = outter, 0
  inner)."
  [this val]
  (aset this "alignment" val))

(defn alpha
  "Property.

  Member of LineStyle.

  The alpha value used when filling the Graphics object."
  [this]
  (-> this .-alpha))

(defn set-alpha!
  "Property.

  Member of LineStyle.

  The alpha value used when filling the Graphics object."
  [this val]
  (aset this "alpha" val))

(defn color
  "Property.

  Member of LineStyle.

  The hex color value used when coloring the Graphics object."
  [this]
  (-> this .-color))

(defn set-color!
  "Property.

  Member of LineStyle.

  The hex color value used when coloring the Graphics object."
  [this val]
  (aset this "color" val))

(defn matrix
  "Property.

  Member of LineStyle.

  The transform aplpied to the texture."
  [this]
  (-> this .-matrix))

(defn set-matrix!
  "Property.

  Member of LineStyle.

  The transform aplpied to the texture."
  [this val]
  (aset this "matrix" val))

(defn native
  "Property.

  Member of LineStyle.

  If true the lines will be draw using LINES instead of TRIANGLE_STRIP"
  [this]
  (-> this .-native))

(defn set-native!
  "Property.

  Member of LineStyle.

  If true the lines will be draw using LINES instead of TRIANGLE_STRIP"
  [this val]
  (aset this "native" val))

(defn texture
  "Property.

  Member of LineStyle.

  The texture to be used for the fill."
  [this]
  (-> this .-texture))

(defn set-texture!
  "Property.

  Member of LineStyle.

  The texture to be used for the fill."
  [this val]
  (aset this "texture" val))

(defn visible
  "Property.

  Member of LineStyle.

  If the current fill is visible."
  [this]
  (-> this .-visible))

(defn set-visible!
  "Property.

  Member of LineStyle.

  If the current fill is visible."
  [this val]
  (aset this "visible" val))

(defn width
  "Property.

  Member of LineStyle.

  The width (thickness) of any lines drawn."
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of LineStyle.

  The width (thickness) of any lines drawn."
  [this val]
  (aset this "width" val))

