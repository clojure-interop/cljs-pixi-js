(ns pixi.core.ImageBitmapResource
  "Extends - BaseImageResource.

  Resource type for ImageBitmap."
  (:refer-clojure :exclude [test update]))

(defn new
  "Constructor."
  ([]
    (new js/ImageBitmapResource)))

(defn *cross-origin
  "Method.

  Member of ImageBitmapResource.

  Set cross origin based detecting the url and the crossorigin"
  ([element url]
    (-> js/BaseImageResource (.crossOrigin element url)))
  ([element url crossorigin]
    (-> js/BaseImageResource (.crossOrigin element url crossorigin))))

(defn dispose
  "Method.

  Member of ImageBitmapResource.

  Destroy this BaseImageResource"
  ([this]
    (-> this (.dispose))))

(defn *test
  "Method.

  Member of ImageBitmapResource.

  Used to auto-detect the type of resource."
  ([source]
    (-> js/ImageBitmapResource (.test source))))

(defn update
  "Method.

  Member of ImageBitmapResource.

  Checks if source width/height was changed, resize can cause extra
  update.
  Triggers one update in any case."
  ([this]
    (-> this (.update))))

(defn upload
  "Method.

  Member of ImageBitmapResource.

  Upload the texture to the GPU."
  ([this renderer base-texture gl-texture]
    (-> this (.upload renderer base-texture gl-texture)))
  ([this renderer base-texture gl-texture source]
    (-> this (.upload renderer base-texture gl-texture source))))

(defn source
  "Property.

  Member of ImageBitmapResource.

  The source element"
  [this]
  (-> this .-source))

(defn set-source!
  "Property.

  Member of ImageBitmapResource.

  The source element"
  [this val]
  (aset this "source" val))

