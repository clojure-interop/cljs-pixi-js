(ns pixi.FillStyle
  "Fill style object for Graphics."
  (:refer-clojure :exclude [clone]))

(defn new
  "Constructor."
  ([]
    (new js/FillStyle)))

(defn clone
  "Method.

  Member of FillStyle.

  Clones the object"
  ([this]
    (-> this (.clone))))

(defn destroy
  "Method.

  Member of FillStyle.

  Destroy and don't use after this"
  ([this]
    (-> this (.destroy))))

(defn reset
  "Method.

  Member of FillStyle.

  Reset"
  ([this]
    (-> this (.reset))))

(defn alpha
  "Property.

  Member of FillStyle.

  The alpha value used when filling the Graphics object."
  [this]
  (-> this .-alpha))

(defn set-alpha!
  "Property.

  Member of FillStyle.

  The alpha value used when filling the Graphics object."
  [this val]
  (aset this "alpha" val))

(defn color
  "Property.

  Member of FillStyle.

  The hex color value used when coloring the Graphics object."
  [this]
  (-> this .-color))

(defn set-color!
  "Property.

  Member of FillStyle.

  The hex color value used when coloring the Graphics object."
  [this val]
  (aset this "color" val))

(defn matrix
  "Property.

  Member of FillStyle.

  The transform aplpied to the texture."
  [this]
  (-> this .-matrix))

(defn set-matrix!
  "Property.

  Member of FillStyle.

  The transform aplpied to the texture."
  [this val]
  (aset this "matrix" val))

(defn texture
  "Property.

  Member of FillStyle.

  The texture to be used for the fill."
  [this]
  (-> this .-texture))

(defn set-texture!
  "Property.

  Member of FillStyle.

  The texture to be used for the fill."
  [this val]
  (aset this "texture" val))

(defn visible
  "Property.

  Member of FillStyle.

  If the current fill is visible."
  [this]
  (-> this .-visible))

(defn set-visible!
  "Property.

  Member of FillStyle.

  If the current fill is visible."
  [this val]
  (aset this "visible" val))

