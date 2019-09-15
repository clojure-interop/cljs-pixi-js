(ns pixi.DisplacementFilter
  "Extends - Filter.

  The DisplacementFilter class uses the pixel values from the specified
  (called the displacement map) to perform a displacement of an
  You can use this filter to apply all manor of crazy warping effects.
  Currently the `r` property of the texture is used to offset the
  and the `g` property of the texture is used to offset the `y`.
  The way it works is it uses the values of the displacement map
  look up the
  correct pixels to output. This means it's not technically moving
  original.
  Instead, it's starting at the output and asking \"which pixel
  the original goes here\".
  For example, if a displacement map pixel has `red = 1` and the
  scale is `20`,
  this filter will output the pixel approximately 20 pixels to
  right of the original."
  (:refer-clojure :exclude [map apply]))

(defn new
  "Constructor."
  ([sprite]
    (new js/DisplacementFilter sprite))
  ([sprite scale]
    (new js/DisplacementFilter sprite scale)))

(defn apply
  "Method.

  Member of DisplacementFilter.

  Applies the filter."
  ([this filter-manager input output clear]
    (-> this (.apply filter-manager input output clear))))

(defn map
  "Property.

  Member of DisplacementFilter.

  The texture used for the displacement map. Must be power of 2
  texture."
  [this]
  (-> this .-map))

(defn set-map!
  "Property.

  Member of DisplacementFilter.

  The texture used for the displacement map. Must be power of 2
  texture."
  [this val]
  (aset this "map" val))

(defn scale
  "Property.

  Member of DisplacementFilter.

  scaleX, scaleY for displacements"
  [this]
  (-> this .-scale))

(defn set-scale!
  "Property.

  Member of DisplacementFilter.

  scaleX, scaleY for displacements"
  [this val]
  (aset this "scale" val))

