(ns pixi.core.TextureSystem
  "Extends - System.

  System plugin to the renderer to manage textures."
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([renderer]
    (new js/TextureSystem renderer)))

(defn bind
  "Method.

  Member of TextureSystem.

  Bind a texture to a specific location
  If you want to unbind something, please use `unbind(texture)`
  of `bind(null, textureLocation)`"
  ([this texture]
    (-> this (.bind texture)))
  ([this texture location]
    (-> this (.bind texture location))))

(defn context-change
  "Method.

  Member of TextureSystem.

  Sets up the renderer context and necessary buffers."
  ([this]
    (-> this (.contextChange))))

(defn destroy
  "Method.

  Member of TextureSystem.

  Generic destroy methods to be overridden by the subclass"
  ([this]
    (-> this (.destroy))))

(defn destroy-texture
  "Method.

  Member of TextureSystem.

  Deletes the texture from WebGL"
  ([this texture]
    (-> this (.destroyTexture texture)))
  ([this texture skip-remove]
    (-> this (.destroyTexture texture skip-remove))))

(defn init-texture
  "Method.

  Member of TextureSystem.

  Initialize a texture"
  ([this texture]
    (-> this (.initTexture texture))))

(defn reset
  "Method.

  Member of TextureSystem.

  Resets texture location and bound textures
  Actual `bind(null, i)` calls will be performed at next `unbind()`"
  ([this]
    (-> this (.reset))))

(defn set-style
  "Method.

  Member of TextureSystem.

  Set style for texture"
  ([this texture gl-texture]
    (-> this (.setStyle texture gl-texture))))

(defn unbind
  "Method.

  Member of TextureSystem.

  Unbind a texture"
  ([this texture]
    (-> this (.unbind texture))))

(defn update-texture
  "Method.

  Member of TextureSystem.

  Update a texture"
  ([this texture]
    (-> this (.updateTexture texture))))

(defn update-texture-style
  "Method.

  Member of TextureSystem.

  Update texture style such as mipmap flag"
  ([this texture]
    (-> this (.updateTextureStyle texture))))

(defn bound-textures
  "Property.

  Member of TextureSystem.

  Bound textures"
  [this]
  (-> this .-boundTextures))

(defn set-bound-textures!
  "Property.

  Member of TextureSystem.

  Bound textures"
  [this val]
  (aset this "boundTextures" val))

(defn current-location
  "Property.

  Member of TextureSystem.

  Current location"
  [this]
  (-> this .-currentLocation))

(defn set-current-location!
  "Property.

  Member of TextureSystem.

  Current location"
  [this val]
  (aset this "currentLocation" val))

(defn managed-textures
  "Property.

  Member of TextureSystem.

  List of managed textures"
  [this]
  (-> this .-managedTextures))

(defn set-managed-textures!
  "Property.

  Member of TextureSystem.

  List of managed textures"
  [this val]
  (aset this "managedTextures" val))

(defn renderer
  "Property.

  Member of TextureSystem.

  The renderer this manager works for."
  [this]
  (-> this .-renderer))

(defn set-renderer!
  "Property.

  Member of TextureSystem.

  The renderer this manager works for."
  [this val]
  (aset this "renderer" val))

(defn unknown-texture
  "Property.

  Member of TextureSystem.

  BaseTexture value that shows that we don't know what is bound"
  [this]
  (-> this .-unknownTexture))

(defn set-unknown-texture!
  "Property.

  Member of TextureSystem.

  BaseTexture value that shows that we don't know what is bound"
  [this val]
  (aset this "unknownTexture" val))

