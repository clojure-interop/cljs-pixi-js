(ns pixi.core.ArrayResource
  "Extends - Resource.

  A resource that contains a number of sources."
  (:refer-clojure :exclude [load update]))

(defn new
  "Constructor."
  ([source]
    (new js/ArrayResource source))
  ([source options]
    (new js/ArrayResource source options)))

(defn add-resource-at
  "Method.

  Member of ArrayResource.

  Set a resource by ID"
  ([this resource index]
    (-> this (.addResourceAt resource index))))

(defn destroy
  "Method.

  Member of ArrayResource.

  Call when destroying resource, unbind any BaseTexture object
  before calling this method, as reference counts are maintained
  internally."
  ([this]
    (-> this (.destroy))))

(defn dispose
  "Method.

  Member of ArrayResource.

  Destroy this BaseImageResource"
  ([this]
    (-> this (.dispose))))

(defn load
  "Method.

  Member of ArrayResource.

  Load all the resources simultaneously"
  ([this]
    (-> this (.load))))

(defn resize
  "Method.

  Member of ArrayResource.

  Trigger a resize event"
  ([this]
    (-> this (.resize))))

(defn style
  "Method.

  Member of ArrayResource.

  Set the style, optional to override"
  ([this renderer base-texture gl-texture]
    (-> this (.style renderer base-texture gl-texture))))

(defn update
  "Method.

  Member of ArrayResource.

  Has been updated trigger event"
  ([this]
    (-> this (.update))))

(defn upload
  "Method.

  Member of ArrayResource.

  Upload the resources to the GPU."
  ([this renderer texture gl-texture]
    (-> this (.upload renderer texture gl-texture))))

(defn bind
  "Property.

  Member of ArrayResource.

  Set the parent base texture"
  [this]
  (-> this .-bind))

(defn set-bind!
  "Property.

  Member of ArrayResource.

  Set the parent base texture"
  [this val]
  (aset this "bind" val))

(defn destroyed
  "Property.

  Member of ArrayResource.

  If resource has been destroyed"
  [this]
  (-> this .-destroyed))

(defn set-destroyed!
  "Property.

  Member of ArrayResource.

  If resource has been destroyed"
  [this val]
  (aset this "destroyed" val))

(defn height
  "Property.

  Member of ArrayResource.

  The height of the resource."
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of ArrayResource.

  The height of the resource."
  [this val]
  (aset this "height" val))

(defn internal
  "Property.

  Member of ArrayResource.

  `true` if resource is created by BaseTexture
  useful for doing cleanup with BaseTexture destroy
  and not cleaning up resources that were created
  externally."
  [this]
  (-> this .-internal))

(defn set-internal!
  "Property.

  Member of ArrayResource.

  `true` if resource is created by BaseTexture
  useful for doing cleanup with BaseTexture destroy
  and not cleaning up resources that were created
  externally."
  [this val]
  (aset this "internal" val))

(defn item-dirty-ids
  "Property.

  Member of ArrayResource.

  Dirty IDs for each part"
  [this]
  (-> this .-itemDirtyIds))

(defn set-item-dirty-ids!
  "Property.

  Member of ArrayResource.

  Dirty IDs for each part"
  [this val]
  (aset this "itemDirtyIds" val))

(defn items
  "Property.

  Member of ArrayResource.

  Collection of resources."
  [this]
  (-> this .-items))

(defn set-items!
  "Property.

  Member of ArrayResource.

  Collection of resources."
  [this val]
  (aset this "items" val))

(defn length
  "Property.

  Member of ArrayResource.

  Number of elements in array"
  [this]
  (-> this .-length))

(defn set-length!
  "Property.

  Member of ArrayResource.

  Number of elements in array"
  [this val]
  (aset this "length" val))

(defn on-error
  "Property.

  Member of ArrayResource.

  Handle internal errors, such as loading errors"
  [this]
  (-> this .-onError))

(defn set-on-error!
  "Property.

  Member of ArrayResource.

  Handle internal errors, such as loading errors"
  [this val]
  (aset this "onError" val))

(defn on-resize
  "Property.

  Member of ArrayResource.

  Mini-runner for handling resize events"
  [this]
  (-> this .-onResize))

(defn set-on-resize!
  "Property.

  Member of ArrayResource.

  Mini-runner for handling resize events"
  [this val]
  (aset this "onResize" val))

(defn on-update
  "Property.

  Member of ArrayResource.

  Mini-runner for handling update events"
  [this]
  (-> this .-onUpdate))

(defn set-on-update!
  "Property.

  Member of ArrayResource.

  Mini-runner for handling update events"
  [this val]
  (aset this "onUpdate" val))

(defn unbind
  "Property.

  Member of ArrayResource.

  Unset the parent base texture"
  [this]
  (-> this .-unbind))

(defn set-unbind!
  "Property.

  Member of ArrayResource.

  Unset the parent base texture"
  [this val]
  (aset this "unbind" val))

(defn valid
  "Property.

  Member of ArrayResource.

  Has been validated"
  [this]
  (-> this .-valid))

(defn set-valid!
  "Property.

  Member of ArrayResource.

  Has been validated"
  [this val]
  (aset this "valid" val))

(defn width
  "Property.

  Member of ArrayResource.

  The width of the resource."
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of ArrayResource.

  The width of the resource."
  [this val]
  (aset this "width" val))

