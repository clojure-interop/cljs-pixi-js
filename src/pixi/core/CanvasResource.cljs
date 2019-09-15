(ns pixi.core.CanvasResource
  "Extends - BaseImageResource.

  Resource type for HTMLCanvasElement."
  (:refer-clojure :exclude [test update]))

(defn new
  "Constructor."
  ([]
    (new js/CanvasResource)))

(defn *cross-origin
  "Method.

  Member of CanvasResource.

  Set cross origin based detecting the url and the crossorigin"
  ([element url]
    (-> js/BaseImageResource (.crossOrigin element url)))
  ([element url crossorigin]
    (-> js/BaseImageResource (.crossOrigin element url crossorigin))))

(defn dispose
  "Method.

  Member of CanvasResource.

  Destroy this BaseImageResource"
  ([this]
    (-> this (.dispose))))

(defn *test
  "Method.

  Member of CanvasResource.

  Used to auto-detect the type of resource."
  ([source]
    (-> js/CanvasResource (.test source))))

(defn update
  "Method.

  Member of CanvasResource.

  Checks if source width/height was changed, resize can cause extra
  update.
  Triggers one update in any case."
  ([this]
    (-> this (.update))))

(defn upload
  "Method.

  Member of CanvasResource.

  Upload the texture to the GPU."
  ([this renderer base-texture gl-texture]
    (-> this (.upload renderer base-texture gl-texture)))
  ([this renderer base-texture gl-texture source]
    (-> this (.upload renderer base-texture gl-texture source))))

(defn source
  "Property.

  Member of CanvasResource.

  The source element"
  [this]
  (-> this .-source))

(defn set-source!
  "Property.

  Member of CanvasResource.

  The source element"
  [this val]
  (aset this "source" val))

