(ns pixi.BlurFilter
  "Extends - Filter.

  The BlurFilter applies a Gaussian blur to an object.
  The strength of the blur can be set for the x-axis and y-axis"
  (:refer-clojure :exclude [apply]))

(defn new
  "Constructor."
  ([]
    (new js/BlurFilter))
  ([strength]
    (new js/BlurFilter strength))
  ([strength quality]
    (new js/BlurFilter strength quality))
  ([strength quality resolution]
    (new js/BlurFilter strength quality resolution))
  ([strength quality resolution kernel-size]
    (new js/BlurFilter strength quality resolution kernel-size)))

(defn apply
  "Method.

  Member of BlurFilter.

  Applies the filter."
  ([this filter-manager input output]
    (-> this (.apply filter-manager input output))))

(defn blend-mode
  "Property.

  Member of BlurFilter.

  Sets the blendmode of the filter"
  [this]
  (-> this .-blendMode))

(defn set-blend-mode!
  "Property.

  Member of BlurFilter.

  Sets the blendmode of the filter"
  [this val]
  (aset this "blendMode" val))

(defn blur
  "Property.

  Member of BlurFilter.

  Sets the strength of both the blurX and blurY properties simultaneously"
  [this]
  (-> this .-blur))

(defn set-blur!
  "Property.

  Member of BlurFilter.

  Sets the strength of both the blurX and blurY properties simultaneously"
  [this val]
  (aset this "blur" val))

(defn blur-x
  "Property.

  Member of BlurFilter.

  Sets the strength of the blurX property"
  [this]
  (-> this .-blurX))

(defn set-blur-x!
  "Property.

  Member of BlurFilter.

  Sets the strength of the blurX property"
  [this val]
  (aset this "blurX" val))

(defn blur-y
  "Property.

  Member of BlurFilter.

  Sets the strength of the blurY property"
  [this]
  (-> this .-blurY))

(defn set-blur-y!
  "Property.

  Member of BlurFilter.

  Sets the strength of the blurY property"
  [this val]
  (aset this "blurY" val))

(defn quality
  "Property.

  Member of BlurFilter.

  Sets the number of passes for blur. More passes means higher
  bluring."
  [this]
  (-> this .-quality))

(defn set-quality!
  "Property.

  Member of BlurFilter.

  Sets the number of passes for blur. More passes means higher
  bluring."
  [this val]
  (aset this "quality" val))

(defn repeat-edge-pixels
  "Property.

  Member of BlurFilter.

  If set to true the edge of the target will be clamped"
  [this]
  (-> this .-repeatEdgePixels))

(defn set-repeat-edge-pixels!
  "Property.

  Member of BlurFilter.

  If set to true the edge of the target will be clamped"
  [this val]
  (aset this "repeatEdgePixels" val))

