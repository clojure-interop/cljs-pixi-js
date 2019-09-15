(ns pixi.MeshMaterial
  "Extends - Shader.

  Slightly opinionated default shader for PixiJS 2D objects."
  (:refer-clojure :exclude [update]))

(defn new
  "Constructor."
  ([u-sampler]
    (new js/MeshMaterial u-sampler))
  ([u-sampler options]
    (new js/MeshMaterial u-sampler options)))

(defn update
  "Method.

  Member of MeshMaterial.

  Gets called automatically by the Mesh. Intended to be overridden
  custom
  MeshMaterial objects."
  ([this]
    (-> this (.update))))

(defn alpha
  "Property.

  Member of MeshMaterial.

  This gets automatically set by the object using this."
  [this]
  (-> this .-alpha))

(defn set-alpha!
  "Property.

  Member of MeshMaterial.

  This gets automatically set by the object using this."
  [this val]
  (aset this "alpha" val))

(defn batchable
  "Property.

  Member of MeshMaterial.

  `true` if shader can be batch with the renderer's batch system."
  [this]
  (-> this .-batchable))

(defn set-batchable!
  "Property.

  Member of MeshMaterial.

  `true` if shader can be batch with the renderer's batch system."
  [this val]
  (aset this "batchable" val))

(defn plugin-name
  "Property.

  Member of MeshMaterial.

  Renderer plugin for batching"
  [this]
  (-> this .-pluginName))

(defn set-plugin-name!
  "Property.

  Member of MeshMaterial.

  Renderer plugin for batching"
  [this val]
  (aset this "pluginName" val))

(defn texture
  "Property.

  Member of MeshMaterial.

  Reference to the texture being rendered."
  [this]
  (-> this .-texture))

(defn set-texture!
  "Property.

  Member of MeshMaterial.

  Reference to the texture being rendered."
  [this val]
  (aset this "texture" val))

(defn tint
  "Property.

  Member of MeshMaterial.

  Multiply tint for the material."
  [this]
  (-> this .-tint))

(defn set-tint!
  "Property.

  Member of MeshMaterial.

  Multiply tint for the material."
  [this val]
  (aset this "tint" val))

(defn uv-matrix
  "Property.

  Member of MeshMaterial.

  TextureMatrix instance for this Mesh, used to track Texture changes"
  [this]
  (-> this .-uvMatrix))

(defn set-uv-matrix!
  "Property.

  Member of MeshMaterial.

  TextureMatrix instance for this Mesh, used to track Texture changes"
  [this val]
  (aset this "uvMatrix" val))

