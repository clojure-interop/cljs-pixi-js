(ns pixi.core.CubeResource
  "Extends - ArrayResource.

  Resource for a CubeTexture which contains six resources."
  (:refer-clojure :exclude [load]))

(defn new
  "Constructor."
  ([]
    (new js/CubeResource))
  ([source]
    (new js/CubeResource source))
  ([source options]
    (new js/CubeResource source options)))

(defn add-resource-at
  "Method.

  Member of CubeResource.

  Set a resource by ID"
  ([this resource index]
    (-> this (.addResourceAt resource index))))

(defn bind
  "Method.

  Member of CubeResource.

  Add binding"
  ([this base-texture]
    (-> this (.bind base-texture))))

(defn dispose
  "Method.

  Member of CubeResource.

  Destroy this BaseImageResource"
  ([this]
    (-> this (.dispose))))

(defn load
  "Method.

  Member of CubeResource.

  Load all the resources simultaneously"
  ([this]
    (-> this (.load))))

(defn upload
  "Method.

  Member of CubeResource.

  Upload the resource"
  ([this]
    (-> this (.upload))))

(defn sides
  "Property.

  Member of CubeResource.

  Number of texture sides to store for CubeResources"
  []
  (-> js/CubeResource .-SIDES))

(defn set-sides!
  "Property.

  Member of CubeResource.

  Number of texture sides to store for CubeResources"
  [val]
  (aset js/CubeResource "SIDES" val))

(defn item-dirty-ids
  "Property.

  Member of CubeResource.

  Dirty IDs for each part"
  [this]
  (-> this .-itemDirtyIds))

(defn set-item-dirty-ids!
  "Property.

  Member of CubeResource.

  Dirty IDs for each part"
  [this val]
  (aset this "itemDirtyIds" val))

(defn items
  "Property.

  Member of CubeResource.

  Collection of resources."
  [this]
  (-> this .-items))

(defn set-items!
  "Property.

  Member of CubeResource.

  Collection of resources."
  [this val]
  (aset this "items" val))

(defn length
  "Property.

  Member of CubeResource.

  Number of elements in array"
  [this]
  (-> this .-length))

(defn set-length!
  "Property.

  Member of CubeResource.

  Number of elements in array"
  [this val]
  (aset this "length" val))

(defn unbind
  "Property.

  Member of CubeResource.

  Unset the parent base texture"
  [this]
  (-> this .-unbind))

(defn set-unbind!
  "Property.

  Member of CubeResource.

  Unset the parent base texture"
  [this val]
  (aset this "unbind" val))

