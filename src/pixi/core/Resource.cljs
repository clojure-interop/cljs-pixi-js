(ns pixi.core.Resource
  "Base resource class for textures that manages validation and
  depending on its type.
  Uploading of a base texture to the GPU is required."
  (:refer-clojure :exclude [load update]))

(defn new
  "Constructor."
  ([]
    (new js/Resource))
  ([width]
    (new js/Resource width))
  ([width height]
    (new js/Resource width height)))

(defn bind
  "Method.

  Member of Resource.

  Bind to a parent BaseTexture"
  ([this base-texture]
    (-> this (.bind base-texture))))

(defn destroy
  "Method.

  Member of Resource.

  Call when destroying resource, unbind any BaseTexture object
  before calling this method, as reference counts are maintained
  internally."
  ([this]
    (-> this (.destroy))))

(defn dispose
  "Method.

  Member of Resource.

  Clean up anything, this happens when destroying is ready."
  ([this]
    (-> this (.dispose))))

(defn load
  "Method.

  Member of Resource.

  This can be overridden to start preloading a resource
  or do any other prepare step."
  ([this]
    (-> this (.load))))

(defn resize
  "Method.

  Member of Resource.

  Trigger a resize event"
  ([this]
    (-> this (.resize))))

(defn style
  "Method.

  Member of Resource.

  Set the style, optional to override"
  ([this renderer base-texture gl-texture]
    (-> this (.style renderer base-texture gl-texture))))

(defn unbind
  "Method.

  Member of Resource.

  Unbind to a parent BaseTexture"
  ([this base-texture]
    (-> this (.unbind base-texture))))

(defn update
  "Method.

  Member of Resource.

  Has been updated trigger event"
  ([this]
    (-> this (.update))))

(defn upload
  "Method.

  Member of Resource.

  Uploads the texture or returns false if it cant for some reason.
  this."
  ([this renderer base-texture gl-texture]
    (-> this (.upload renderer base-texture gl-texture))))

(defn destroyed
  "Property.

  Member of Resource.

  If resource has been destroyed"
  [this]
  (-> this .-destroyed))

(defn set-destroyed!
  "Property.

  Member of Resource.

  If resource has been destroyed"
  [this val]
  (aset this "destroyed" val))

(defn height
  "Property.

  Member of Resource.

  The height of the resource."
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of Resource.

  The height of the resource."
  [this val]
  (aset this "height" val))

(defn internal
  "Property.

  Member of Resource.

  `true` if resource is created by BaseTexture
  useful for doing cleanup with BaseTexture destroy
  and not cleaning up resources that were created
  externally."
  [this]
  (-> this .-internal))

(defn set-internal!
  "Property.

  Member of Resource.

  `true` if resource is created by BaseTexture
  useful for doing cleanup with BaseTexture destroy
  and not cleaning up resources that were created
  externally."
  [this val]
  (aset this "internal" val))

(defn on-error
  "Property.

  Member of Resource.

  Handle internal errors, such as loading errors"
  [this]
  (-> this .-onError))

(defn set-on-error!
  "Property.

  Member of Resource.

  Handle internal errors, such as loading errors"
  [this val]
  (aset this "onError" val))

(defn on-resize
  "Property.

  Member of Resource.

  Mini-runner for handling resize events"
  [this]
  (-> this .-onResize))

(defn set-on-resize!
  "Property.

  Member of Resource.

  Mini-runner for handling resize events"
  [this val]
  (aset this "onResize" val))

(defn on-update
  "Property.

  Member of Resource.

  Mini-runner for handling update events"
  [this]
  (-> this .-onUpdate))

(defn set-on-update!
  "Property.

  Member of Resource.

  Mini-runner for handling update events"
  [this val]
  (aset this "onUpdate" val))

(defn valid
  "Property.

  Member of Resource.

  Has been validated"
  [this]
  (-> this .-valid))

(defn set-valid!
  "Property.

  Member of Resource.

  Has been validated"
  [this val]
  (aset this "valid" val))

(defn width
  "Property.

  Member of Resource.

  The width of the resource."
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of Resource.

  The width of the resource."
  [this val]
  (aset this "width" val))

