(ns pixi.ColorMatrixFilter
  "Extends - Filter.

  The ColorMatrixFilter class lets you apply a 5x4 matrix transformation
  the RGBA
  color and alpha values of every pixel on your displayObject to
  a result
  with a new set of RGBA color and alpha values. It's pretty powerful!
  ```js
  let colorMatrix = new PIXI.filters.ColorMatrixFilter();
  container.filters = [colorMatrix];
  colorMatrix.contrast(2);
  ```"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([]
    (new js/ColorMatrixFilter)))

(defn black-and-white
  "Method.

  Member of ColorMatrixFilter.

  Set the black and white matrice."
  ([this multiply]
    (-> this (.blackAndWhite multiply))))

(defn brightness
  "Method.

  Member of ColorMatrixFilter.

  Adjusts brightness"
  ([this b multiply]
    (-> this (.brightness b multiply))))

(defn browni
  "Method.

  Member of ColorMatrixFilter.

  Brown delicious browni filter (thanks Dominic Szablewski)"
  ([this multiply]
    (-> this (.browni multiply))))

(defn color-tone
  "Method.

  Member of ColorMatrixFilter.

  We don't know exactly what it does, kind of gradient map, but
  to play with!"
  ([this desaturation toned light-color dark-color multiply]
    (-> this (.colorTone desaturation toned light-color dark-color multiply))))

(defn contrast
  "Method.

  Member of ColorMatrixFilter.

  Set the contrast matrix, increase the separation between dark
  bright
  Increase contrast : shadows darker and highlights brighter
  Decrease contrast : bring the shadows up and the highlights down"
  ([this amount multiply]
    (-> this (.contrast amount multiply))))

(defn desaturate
  "Method.

  Member of ColorMatrixFilter.

  Desaturate image (remove color)
  Call the saturate function"
  ([this]
    (-> this (.desaturate))))

(defn greyscale
  "Method.

  Member of ColorMatrixFilter.

  Set the matrices in grey scales"
  ([this scale multiply]
    (-> this (.greyscale scale multiply))))

(defn hue
  "Method.

  Member of ColorMatrixFilter.

  Set the hue property of the color"
  ([this rotation multiply]
    (-> this (.hue rotation multiply))))

(defn kodachrome
  "Method.

  Member of ColorMatrixFilter.

  Color reversal film introduced by Eastman Kodak in 1935. (thanks
  Szablewski)"
  ([this multiply]
    (-> this (.kodachrome multiply))))

(defn lsd
  "Method.

  Member of ColorMatrixFilter.

  LSD effect
  Multiply the current matrix"
  ([this multiply]
    (-> this (.lsd multiply))))

(defn negative
  "Method.

  Member of ColorMatrixFilter.

  Negative image (inverse of classic rgb matrix)"
  ([this multiply]
    (-> this (.negative multiply))))

(defn night
  "Method.

  Member of ColorMatrixFilter.

  Night effect"
  ([this intensity multiply]
    (-> this (.night intensity multiply))))

(defn polaroid
  "Method.

  Member of ColorMatrixFilter.

  Polaroid filter"
  ([this multiply]
    (-> this (.polaroid multiply))))

(defn predator
  "Method.

  Member of ColorMatrixFilter.

  Predator effect
  Erase the current matrix by setting a new indepent one"
  ([this amount multiply]
    (-> this (.predator amount multiply))))

(defn reset
  "Method.

  Member of ColorMatrixFilter.

  Erase the current matrix by setting the default one"
  ([this]
    (-> this (.reset))))

(defn saturate
  "Method.

  Member of ColorMatrixFilter.

  Set the saturation matrix, increase the separation between colors
  Increase saturation : increase contrast, brightness, and sharpness"
  ([this amount multiply]
    (-> this (.saturate amount multiply))))

(defn sepia
  "Method.

  Member of ColorMatrixFilter.

  Sepia image"
  ([this multiply]
    (-> this (.sepia multiply))))

(defn technicolor
  "Method.

  Member of ColorMatrixFilter.

  Color motion picture process invented in 1916 (thanks Dominic"
  ([this multiply]
    (-> this (.technicolor multiply))))

(defn to-bgr
  "Method.

  Member of ColorMatrixFilter.

  Filter who transforms : Red -> Blue and Blue -> Red"
  ([this multiply]
    (-> this (.toBGR multiply))))

(defn vintage
  "Method.

  Member of ColorMatrixFilter.

  Vintage filter (thanks Dominic Szablewski)"
  ([this multiply]
    (-> this (.vintage multiply))))

(defn alpha
  "Property.

  Member of ColorMatrixFilter.

  The opacity value to use when mixing the original and resultant
  When the value is 0, the original color is used without modification.
  When the value is 1, the result color is used.
  When in the range (0, 1) the color is interpolated between the
  and result by this amount."
  [this]
  (-> this .-alpha))

(defn set-alpha!
  "Property.

  Member of ColorMatrixFilter.

  The opacity value to use when mixing the original and resultant
  When the value is 0, the original color is used without modification.
  When the value is 1, the result color is used.
  When in the range (0, 1) the color is interpolated between the
  and result by this amount."
  [this val]
  (aset this "alpha" val))

(defn matrix
  "Property.

  Member of ColorMatrixFilter.

  The matrix of the color matrix filter"
  [this]
  (-> this .-matrix))

(defn set-matrix!
  "Property.

  Member of ColorMatrixFilter.

  The matrix of the color matrix filter"
  [this val]
  (aset this "matrix" val))

