(ns pixi.core.SVGResource
  "Extends - BaseImageResource.

  Resource type for SVG elements and graphics."
  (:refer-clojure :exclude [test update]))

(defn new
  "Constructor."
  ([source]
    (new js/SVGResource source))
  ([source options]
    (new js/SVGResource source options)))

(defn *cross-origin
  "Method.

  Member of SVGResource.

  Set cross origin based detecting the url and the crossorigin"
  ([element url]
    (-> js/BaseImageResource (.crossOrigin element url)))
  ([element url crossorigin]
    (-> js/BaseImageResource (.crossOrigin element url crossorigin))))

(defn dispose
  "Method.

  Member of SVGResource.

  Destroys this texture"
  ([this]
    (-> this (.dispose))))

(defn *get-size
  "Method.

  Member of SVGResource.

  Get size from an svg string using regexp."
  ([svg-string]
    (-> js/SVGResource (.getSize svg-string))))

(defn *test
  "Method.

  Member of SVGResource.

  Used to auto-detect the type of resource."
  ([source extension]
    (-> js/SVGResource (.test source extension))))

(defn update
  "Method.

  Member of SVGResource.

  Checks if source width/height was changed, resize can cause extra
  update.
  Triggers one update in any case."
  ([this]
    (-> this (.update))))

(defn upload
  "Method.

  Member of SVGResource.

  Upload the texture to the GPU."
  ([this renderer base-texture gl-texture]
    (-> this (.upload renderer base-texture gl-texture)))
  ([this renderer base-texture gl-texture source]
    (-> this (.upload renderer base-texture gl-texture source))))

(defn scale
  "Property.

  Member of SVGResource.

  The source scale to apply when rasterizing on load"
  [this]
  (-> this .-scale))

(defn set-scale!
  "Property.

  Member of SVGResource.

  The source scale to apply when rasterizing on load"
  [this val]
  (aset this "scale" val))

(defn source
  "Property.

  Member of SVGResource.

  The source element"
  [this]
  (-> this .-source))

(defn set-source!
  "Property.

  Member of SVGResource.

  The source element"
  [this val]
  (aset this "source" val))

(defn svg
  "Property.

  Member of SVGResource.

  Base64 encoded SVG element or URL for SVG file"
  [this]
  (-> this .-svg))

(defn set-svg!
  "Property.

  Member of SVGResource.

  Base64 encoded SVG element or URL for SVG file"
  [this val]
  (aset this "svg" val))

