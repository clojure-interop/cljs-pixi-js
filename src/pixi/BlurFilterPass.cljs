(ns pixi.BlurFilterPass
  "Extends - Filter.

  The BlurFilterPass applies a horizontal or vertical Gaussian
  to an object."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([horizontal strength quality resolution]
    (new js/BlurFilterPass horizontal strength quality resolution))
  ([horizontal strength quality resolution kernel-size]
    (new js/BlurFilterPass horizontal strength quality resolution kernel-size)))

(defn blur
  "Property.

  Member of BlurFilterPass.

  Sets the strength of both the blur."
  [this]
  (-> this .-blur))

(defn set-blur!
  "Property.

  Member of BlurFilterPass.

  Sets the strength of both the blur."
  [this val]
  (aset this "blur" val))

(defn quality
  "Property.

  Member of BlurFilterPass.

  Sets the quality of the blur by modifying the number of passes.
  passes means higher
  quaility bluring but the lower the performance."
  [this]
  (-> this .-quality))

(defn set-quality!
  "Property.

  Member of BlurFilterPass.

  Sets the quality of the blur by modifying the number of passes.
  passes means higher
  quaility bluring but the lower the performance."
  [this val]
  (aset this "quality" val))

