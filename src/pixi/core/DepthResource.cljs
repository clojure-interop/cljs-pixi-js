(ns pixi.core.DepthResource
  "Extends - BufferResource.

  Resource type for DepthTexture."
  (:refer-clojure :exclude [test]))

(defn new
  "Constructor."
  ([]
    (new js/DepthResource)))

(defn dispose
  "Method.

  Member of DepthResource.

  Destroy and don't use after this"
  ([this]
    (-> this (.dispose))))

(defn *test
  "Method.

  Member of DepthResource.

  Used to auto-detect the type of resource."
  ([source]
    (-> js/BufferResource (.test source))))

(defn upload
  "Method.

  Member of DepthResource.

  Upload the texture to the GPU."
  ([this renderer base-texture gl-texture]
    (-> this (.upload renderer base-texture gl-texture))))

(defn data
  "Property.

  Member of DepthResource.

  Source array
  Cannot be ClampedUint8Array because it cant be uploaded to WebGL"
  [this]
  (-> this .-data))

(defn set-data!
  "Property.

  Member of DepthResource.

  Source array
  Cannot be ClampedUint8Array because it cant be uploaded to WebGL"
  [this val]
  (aset this "data" val))

