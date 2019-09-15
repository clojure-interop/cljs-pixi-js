(ns pixi.MeshBatchUvs
  "Class controls cache for UV mapping from Texture normal space
  BaseTexture normal space."
  (:refer-clojure :exclude [update]))

(defn new
  "Constructor."
  ([uv-buffer uv-matrix]
    (new js/MeshBatchUvs uv-buffer uv-matrix)))

(defn update
  "Method.

  Member of MeshBatchUvs.

  updates"
  ([this force-update]
    (-> this (.update force-update))))

(defn data
  "Property.

  Member of MeshBatchUvs.

  UV Buffer data"
  [this]
  (-> this .-data))

(defn set-data!
  "Property.

  Member of MeshBatchUvs.

  UV Buffer data"
  [this val]
  (aset this "data" val))

(defn uv-buffer
  "Property.

  Member of MeshBatchUvs.

  Buffer with normalized UV's"
  [this]
  (-> this .-uvBuffer))

(defn set-uv-buffer!
  "Property.

  Member of MeshBatchUvs.

  Buffer with normalized UV's"
  [this val]
  (aset this "uvBuffer" val))

(defn uv-matrix
  "Property.

  Member of MeshBatchUvs.

  Material UV matrix"
  [this]
  (-> this .-uvMatrix))

(defn set-uv-matrix!
  "Property.

  Member of MeshBatchUvs.

  Material UV matrix"
  [this val]
  (aset this "uvMatrix" val))

