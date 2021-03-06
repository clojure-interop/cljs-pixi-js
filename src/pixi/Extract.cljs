(ns pixi.Extract
  "The extract manager provides functionality to export content
  the renderers.
  An instance of this class is automatically created by default,
  can be found at `renderer.plugins.extract`"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([renderer]
    (new js/Extract renderer)))

(defn *array-post-divide
  "Method.

  Member of Extract.

  Takes premultiplied pixel data and produces regular pixel data"
  ([pixels out]
    (-> js/Extract (.arrayPostDivide pixels out))))

(defn base64
  "Method.

  Member of Extract.

  Will return a a base64 encoded string of this target. It works
  calling
  `Extract.getCanvas` and then running toDataURL on that."
  ([this target]
    (-> this (.base64 target)))
  ([this target format]
    (-> this (.base64 target format)))
  ([this target format quality]
    (-> this (.base64 target format quality))))

(defn canvas
  "Method.

  Member of Extract.

  Creates a Canvas element, renders this target to it and then
  it."
  ([this target]
    (-> this (.canvas target))))

(defn destroy
  "Method.

  Member of Extract.

  Destroys the extract"
  ([this]
    (-> this (.destroy))))

(defn image
  "Method.

  Member of Extract.

  Will return a HTML Image of the target"
  ([this target]
    (-> this (.image target)))
  ([this target format]
    (-> this (.image target format)))
  ([this target format quality]
    (-> this (.image target format quality))))

(defn pixels
  "Method.

  Member of Extract.

  Will return a one-dimensional array containing the pixel data
  the entire texture in RGBA
  order, with integer values between 0 and 255 (included)."
  ([this target]
    (-> this (.pixels target))))

(defn extract
  "Property.

  Member of Extract.

  Collection of methods for extracting data (image, pixels, etc.)
  a display object or render texture"
  [this]
  (-> this .-extract))

(defn set-extract!
  "Property.

  Member of Extract.

  Collection of methods for extracting data (image, pixels, etc.)
  a display object or render texture"
  [this val]
  (aset this "extract" val))

