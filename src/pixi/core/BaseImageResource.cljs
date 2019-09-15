(ns pixi.core.BaseImageResource
  "Extends - Resource.

  Base for all the image/canvas resources"
  (:refer-clojure :exclude [update load]))

(defn new
  "Constructor."
  ([source]
    (new js/BaseImageResource source)))

(defn bind
  "Method.

  Member of BaseImageResource.

  Bind to a parent BaseTexture"
  ([this base-texture]
    (-> this (.bind base-texture))))

(defn *cross-origin
  "Method.

  Member of BaseImageResource.

  Set cross origin based detecting the url and the crossorigin"
  ([element url]
    (-> js/BaseImageResource (.crossOrigin element url)))
  ([element url crossorigin]
    (-> js/BaseImageResource (.crossOrigin element url crossorigin))))

(defn destroy
  "Method.

  Member of BaseImageResource.

  Call when destroying resource, unbind any BaseTexture object
  before calling this method, as reference counts are maintained
  internally."
  ([this]
    (-> this (.destroy))))

(defn dispose
  "Method.

  Member of BaseImageResource.

  Destroy this BaseImageResource"
  ([this]
    (-> this (.dispose))))

(defn load
  "Method.

  Member of BaseImageResource.

  This can be overridden to start preloading a resource
  or do any other prepare step."
  ([this]
    (-> this (.load))))

(defn resize
  "Method.

  Member of BaseImageResource.

  Trigger a resize event"
  ([this]
    (-> this (.resize))))

(defn style
  "Method.

  Member of BaseImageResource.

  Set the style, optional to override"
  ([this renderer base-texture gl-texture]
    (-> this (.style renderer base-texture gl-texture))))

(defn unbind
  "Method.

  Member of BaseImageResource.

  Unbind to a parent BaseTexture"
  ([this base-texture]
    (-> this (.unbind base-texture))))

(defn update
  "Method.

  Member of BaseImageResource.

  Checks if source width/height was changed, resize can cause extra
  update.
  Triggers one update in any case."
  ([this]
    (-> this (.update))))

(defn upload
  "Method.

  Member of BaseImageResource.

  Upload the texture to the GPU."
  ([this renderer base-texture gl-texture]
    (-> this (.upload renderer base-texture gl-texture)))
  ([this renderer base-texture gl-texture source]
    (-> this (.upload renderer base-texture gl-texture source))))

(defn destroyed
  "Property.

  Member of BaseImageResource.

  If resource has been destroyed"
  [this]
  (-> this .-destroyed))

(defn set-destroyed!
  "Property.

  Member of BaseImageResource.

  If resource has been destroyed"
  [this val]
  (aset this "destroyed" val))

(defn height
  "Property.

  Member of BaseImageResource.

  The height of the resource."
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of BaseImageResource.

  The height of the resource."
  [this val]
  (aset this "height" val))

(defn internal
  "Property.

  Member of BaseImageResource.

  `true` if resource is created by BaseTexture
  useful for doing cleanup with BaseTexture destroy
  and not cleaning up resources that were created
  externally."
  [this]
  (-> this .-internal))

(defn set-internal!
  "Property.

  Member of BaseImageResource.

  `true` if resource is created by BaseTexture
  useful for doing cleanup with BaseTexture destroy
  and not cleaning up resources that were created
  externally."
  [this val]
  (aset this "internal" val))

(defn on-error
  "Property.

  Member of BaseImageResource.

  Handle internal errors, such as loading errors"
  [this]
  (-> this .-onError))

(defn set-on-error!
  "Property.

  Member of BaseImageResource.

  Handle internal errors, such as loading errors"
  [this val]
  (aset this "onError" val))

(defn on-resize
  "Property.

  Member of BaseImageResource.

  Mini-runner for handling resize events"
  [this]
  (-> this .-onResize))

(defn set-on-resize!
  "Property.

  Member of BaseImageResource.

  Mini-runner for handling resize events"
  [this val]
  (aset this "onResize" val))

(defn on-update
  "Property.

  Member of BaseImageResource.

  Mini-runner for handling update events"
  [this]
  (-> this .-onUpdate))

(defn set-on-update!
  "Property.

  Member of BaseImageResource.

  Mini-runner for handling update events"
  [this val]
  (aset this "onUpdate" val))

(defn source
  "Property.

  Member of BaseImageResource.

  The source element"
  [this]
  (-> this .-source))

(defn set-source!
  "Property.

  Member of BaseImageResource.

  The source element"
  [this val]
  (aset this "source" val))

(defn valid
  "Property.

  Member of BaseImageResource.

  Has been validated"
  [this]
  (-> this .-valid))

(defn set-valid!
  "Property.

  Member of BaseImageResource.

  Has been validated"
  [this val]
  (aset this "valid" val))

(defn width
  "Property.

  Member of BaseImageResource.

  The width of the resource."
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of BaseImageResource.

  The width of the resource."
  [this val]
  (aset this "width" val))

