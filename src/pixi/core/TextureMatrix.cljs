(ns pixi.core.TextureMatrix
  "Class controls uv mapping from Texture normal space to BaseTexture
  space.
  Takes `trim` and `rotate` into account. May contain clamp settings
  Meshes and TilingSprite.
  Can be used in Texture `uvMatrix` field, or separately, you can
  different clamp settings on the same texture.
  If you want to add support for texture region of certain feature
  filter, that's what you're looking for.
  Takes track of Texture changes through `_lastTextureID` private
  Use `update()` method call to track it from outside."
  (:refer-clojure :exclude [update]))

(defn new
  "Constructor."
  ([texture]
    (new js/TextureMatrix texture))
  ([texture clamp-margin]
    (new js/TextureMatrix texture clamp-margin)))

(defn multiply-uvs
  "Method.

  Member of TextureMatrix.

  Multiplies uvs array to transform"
  ([this uvs]
    (-> this (.multiplyUvs uvs)))
  ([this uvs out]
    (-> this (.multiplyUvs uvs out))))

(defn update
  "Method.

  Member of TextureMatrix.

  updates matrices if texture was changed"
  ([this]
    (-> this (.update)))
  ([this force-update]
    (-> this (.update force-update))))

(defn clamp-margin
  "Property.

  Member of TextureMatrix.

  Changes frame clamping
  Works with TilingSprite and Mesh
  Change to -0.5 to add a pixel to the edge, recommended for transparent
  textures in atlas"
  [this]
  (-> this .-clampMargin))

(defn set-clamp-margin!
  "Property.

  Member of TextureMatrix.

  Changes frame clamping
  Works with TilingSprite and Mesh
  Change to -0.5 to add a pixel to the edge, recommended for transparent
  textures in atlas"
  [this val]
  (aset this "clampMargin" val))

(defn clamp-offset
  "Property.

  Member of TextureMatrix.

  Changes frame clamping
  Works with TilingSprite and Mesh
  Change to 1.5 if you texture has repeated right and bottom lines,
  leads to smoother borders"
  [this]
  (-> this .-clampOffset))

(defn set-clamp-offset!
  "Property.

  Member of TextureMatrix.

  Changes frame clamping
  Works with TilingSprite and Mesh
  Change to 1.5 if you texture has repeated right and bottom lines,
  leads to smoother borders"
  [this val]
  (aset this "clampOffset" val))

(defn is-simple
  "Property.

  Member of TextureMatrix.

  If texture size is the same as baseTexture"
  [this]
  (-> this .-isSimple))

(defn set-is-simple!
  "Property.

  Member of TextureMatrix.

  If texture size is the same as baseTexture"
  [this val]
  (aset this "isSimple" val))

(defn map-coord
  "Property.

  Member of TextureMatrix.

  Matrix operation that converts texture region coords to texture"
  [this]
  (-> this .-mapCoord))

(defn set-map-coord!
  "Property.

  Member of TextureMatrix.

  Matrix operation that converts texture region coords to texture"
  [this val]
  (aset this "mapCoord" val))

(defn texture
  "Property.

  Member of TextureMatrix.

  texture property"
  [this]
  (-> this .-texture))

(defn set-texture!
  "Property.

  Member of TextureMatrix.

  texture property"
  [this val]
  (aset this "texture" val))

(defn u-clamp-frame
  "Property.

  Member of TextureMatrix.

  Clamp region for normalized coords, left-top pixel center in
  , bottom-right in zw.
  Calculated based on clampOffset."
  [this]
  (-> this .-uClampFrame))

(defn set-u-clamp-frame!
  "Property.

  Member of TextureMatrix.

  Clamp region for normalized coords, left-top pixel center in
  , bottom-right in zw.
  Calculated based on clampOffset."
  [this val]
  (aset this "uClampFrame" val))

(defn u-clamp-offset
  "Property.

  Member of TextureMatrix.

  Normalized clamp offset.
  Calculated based on clampOffset."
  [this]
  (-> this .-uClampOffset))

(defn set-u-clamp-offset!
  "Property.

  Member of TextureMatrix.

  Normalized clamp offset.
  Calculated based on clampOffset."
  [this val]
  (aset this "uClampOffset" val))

