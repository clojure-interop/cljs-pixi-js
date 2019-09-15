(ns pixi.core.GLTexture
  "Internal texture for WebGL context"
  (:refer-clojure :exclude [type]))

(defn new
  "Constructor."
  ([]
    (new js/GLTexture)))

(defn dirty-id
  "Property.

  Member of GLTexture.

  Texture contents dirty flag"
  [this]
  (-> this .-dirtyId))

(defn set-dirty-id!
  "Property.

  Member of GLTexture.

  Texture contents dirty flag"
  [this val]
  (aset this "dirtyId" val))

(defn dirty-style-id
  "Property.

  Member of GLTexture.

  Texture style dirty flag"
  [this]
  (-> this .-dirtyStyleId))

(defn set-dirty-style-id!
  "Property.

  Member of GLTexture.

  Texture style dirty flag"
  [this val]
  (aset this "dirtyStyleId" val))

(defn height
  "Property.

  Member of GLTexture.

  Height of texture that was used in texImage2D"
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of GLTexture.

  Height of texture that was used in texImage2D"
  [this val]
  (aset this "height" val))

(defn internal-format
  "Property.

  Member of GLTexture.

  Type copied from baseTexture"
  [this]
  (-> this .-internalFormat))

(defn set-internal-format!
  "Property.

  Member of GLTexture.

  Type copied from baseTexture"
  [this val]
  (aset this "internalFormat" val))

(defn mipmap
  "Property.

  Member of GLTexture.

  Whether mip levels has to be generated"
  [this]
  (-> this .-mipmap))

(defn set-mipmap!
  "Property.

  Member of GLTexture.

  Whether mip levels has to be generated"
  [this val]
  (aset this "mipmap" val))

(defn texture
  "Property.

  Member of GLTexture.

  The WebGL texture"
  [this]
  (-> this .-texture))

(defn set-texture!
  "Property.

  Member of GLTexture.

  The WebGL texture"
  [this val]
  (aset this "texture" val))

(defn type
  "Property.

  Member of GLTexture.

  Type copied from baseTexture"
  [this]
  (-> this .-type))

(defn set-type!
  "Property.

  Member of GLTexture.

  Type copied from baseTexture"
  [this val]
  (aset this "type" val))

(defn width
  "Property.

  Member of GLTexture.

  Width of texture that was used in texImage2D"
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of GLTexture.

  Width of texture that was used in texImage2D"
  [this val]
  (aset this "width" val))

(defn wrap-mode
  "Property.

  Member of GLTexture.

  WrapMode copied from baseTexture"
  [this]
  (-> this .-wrapMode))

(defn set-wrap-mode!
  "Property.

  Member of GLTexture.

  WrapMode copied from baseTexture"
  [this val]
  (aset this "wrapMode" val))

