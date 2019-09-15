(ns pixi.core.BufferResource
  "Extends - Resource.

  Buffer resource with data of typed array."
  (:refer-clojure :exclude [test load update]))

(defn new
  "Constructor."
  ([source options]
    (new js/BufferResource source options)))

(defn bind
  "Method.

  Member of BufferResource.

  Bind to a parent BaseTexture"
  ([this base-texture]
    (-> this (.bind base-texture))))

(defn destroy
  "Method.

  Member of BufferResource.

  Call when destroying resource, unbind any BaseTexture object
  before calling this method, as reference counts are maintained
  internally."
  ([this]
    (-> this (.destroy))))

(defn dispose
  "Method.

  Member of BufferResource.

  Destroy and don't use after this"
  ([this]
    (-> this (.dispose))))

(defn load
  "Method.

  Member of BufferResource.

  This can be overridden to start preloading a resource
  or do any other prepare step."
  ([this]
    (-> this (.load))))

(defn resize
  "Method.

  Member of BufferResource.

  Trigger a resize event"
  ([this]
    (-> this (.resize))))

(defn style
  "Method.

  Member of BufferResource.

  Set the style, optional to override"
  ([this renderer base-texture gl-texture]
    (-> this (.style renderer base-texture gl-texture))))

(defn *test
  "Method.

  Member of BufferResource.

  Used to auto-detect the type of resource."
  ([source]
    (-> js/BufferResource (.test source))))

(defn unbind
  "Method.

  Member of BufferResource.

  Unbind to a parent BaseTexture"
  ([this base-texture]
    (-> this (.unbind base-texture))))

(defn update
  "Method.

  Member of BufferResource.

  Has been updated trigger event"
  ([this]
    (-> this (.update))))

(defn upload
  "Method.

  Member of BufferResource.

  Upload the texture to the GPU."
  ([this renderer base-texture gl-texture]
    (-> this (.upload renderer base-texture gl-texture))))

(defn data
  "Property.

  Member of BufferResource.

  Source array
  Cannot be ClampedUint8Array because it cant be uploaded to WebGL"
  [this]
  (-> this .-data))

(defn set-data!
  "Property.

  Member of BufferResource.

  Source array
  Cannot be ClampedUint8Array because it cant be uploaded to WebGL"
  [this val]
  (aset this "data" val))

(defn destroyed
  "Property.

  Member of BufferResource.

  If resource has been destroyed"
  [this]
  (-> this .-destroyed))

(defn set-destroyed!
  "Property.

  Member of BufferResource.

  If resource has been destroyed"
  [this val]
  (aset this "destroyed" val))

(defn height
  "Property.

  Member of BufferResource.

  The height of the resource."
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of BufferResource.

  The height of the resource."
  [this val]
  (aset this "height" val))

(defn internal
  "Property.

  Member of BufferResource.

  `true` if resource is created by BaseTexture
  useful for doing cleanup with BaseTexture destroy
  and not cleaning up resources that were created
  externally."
  [this]
  (-> this .-internal))

(defn set-internal!
  "Property.

  Member of BufferResource.

  `true` if resource is created by BaseTexture
  useful for doing cleanup with BaseTexture destroy
  and not cleaning up resources that were created
  externally."
  [this val]
  (aset this "internal" val))

(defn on-error
  "Property.

  Member of BufferResource.

  Handle internal errors, such as loading errors"
  [this]
  (-> this .-onError))

(defn set-on-error!
  "Property.

  Member of BufferResource.

  Handle internal errors, such as loading errors"
  [this val]
  (aset this "onError" val))

(defn on-resize
  "Property.

  Member of BufferResource.

  Mini-runner for handling resize events"
  [this]
  (-> this .-onResize))

(defn set-on-resize!
  "Property.

  Member of BufferResource.

  Mini-runner for handling resize events"
  [this val]
  (aset this "onResize" val))

(defn on-update
  "Property.

  Member of BufferResource.

  Mini-runner for handling update events"
  [this]
  (-> this .-onUpdate))

(defn set-on-update!
  "Property.

  Member of BufferResource.

  Mini-runner for handling update events"
  [this val]
  (aset this "onUpdate" val))

(defn valid
  "Property.

  Member of BufferResource.

  Has been validated"
  [this]
  (-> this .-valid))

(defn set-valid!
  "Property.

  Member of BufferResource.

  Has been validated"
  [this val]
  (aset this "valid" val))

(defn width
  "Property.

  Member of BufferResource.

  The width of the resource."
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of BufferResource.

  The width of the resource."
  [this val]
  (aset this "width" val))

