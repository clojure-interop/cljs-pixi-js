(ns pixi.AlphaFilter
  "Extends - Filter.

  Simplest filter - applies alpha.
  Use this instead of Container's alpha property to avoid visual
  of individual elements.
  AlphaFilter applies alpha evenly across the entire display object
  any opaque elements it contains.
  If elements are not opaque, they will blend with each other anyway.
  Very handy if you want to use common features of all filters:
  1. Assign a blendMode to this filter, blend all elements inside
  object with background.
  2. To use clipping in display coordinates, assign a filterArea
  the same container that has this filter."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/AlphaFilter))
  ([alpha]
    (new js/AlphaFilter alpha)))

(defn alpha
  "Property.

  Member of AlphaFilter.

  Coefficient for alpha multiplication"
  [this]
  (-> this .-alpha))

(defn set-alpha!
  "Property.

  Member of AlphaFilter.

  Coefficient for alpha multiplication"
  [this val]
  (aset this "alpha" val))

