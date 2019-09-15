(ns pixi.core.CubeTexture
  "Extends - BaseTexture.

  A Texture that depends on six other resources."
  (:refer-clojure :exclude [type update]))

(defn new
  "Constructor."
  ([]
    (new js/CubeTexture)))

(defn *add-to-cache
  "Method.

  Member of CubeTexture.

  Adds a BaseTexture to the global BaseTextureCache. This cache
  shared across the whole PIXI object."
  ([base-texture id]
    (-> js/BaseTexture (.addToCache base-texture id))))

(defn destroy
  "Method.

  Member of CubeTexture.

  Destroys this base texture.
  The method stops if resource doesn't want this texture to be
  Removes texture from all caches."
  ([this]
    (-> this (.destroy))))

(defn dispose
  "Method.

  Member of CubeTexture.

  Frees the texture from WebGL memory without destroying this texture
  This means you can still use the texture later which will upload
  to GPU
  memory again."
  ([this]
    (-> this (.dispose))))

(defn *from
  "Method.

  Member of CubeTexture.

  Generate a new CubeTexture."
  ([resources]
    (-> js/CubeTexture (.from resources)))
  ([resources options]
    (-> js/CubeTexture (.from resources options))))

(defn *from-buffer
  "Method.

  Member of CubeTexture.

  Create a new BaseTexture with a BufferResource from a Float32Array.
  RGBA values are floats from 0 to 1."
  ([buffer width height]
    (-> js/BaseTexture (.fromBuffer buffer width height)))
  ([buffer width height options]
    (-> js/BaseTexture (.fromBuffer buffer width height options))))

(defn on-error
  "Method.

  Member of CubeTexture.

  Handle errors with resources."
  ([this event]
    (-> this (.onError event))))

(defn *remove-from-cache
  "Method.

  Member of CubeTexture.

  Remove a BaseTexture from the global BaseTextureCache."
  ([base-texture]
    (-> js/BaseTexture (.removeFromCache base-texture))))

(defn set-real-size
  "Method.

  Member of CubeTexture.

  Sets real size of baseTexture, preserves current resolution."
  ([this real-width real-height]
    (-> this (.setRealSize real-width real-height)))
  ([this real-width real-height resolution]
    (-> this (.setRealSize real-width real-height resolution))))

(defn set-resolution
  "Method.

  Member of CubeTexture.

  Changes resolution"
  ([this]
    (-> this (.setResolution)))
  ([this resolution]
    (-> this (.setResolution resolution))))

(defn set-resource
  "Method.

  Member of CubeTexture.

  Sets the resource if it wasn't set. Throws error if resource
  present"
  ([this resource]
    (-> this (.setResource resource))))

(defn set-size
  "Method.

  Member of CubeTexture.

  Changes w/h/resolution. Texture becomes valid if width and height
  greater than zero."
  ([this width height]
    (-> this (.setSize width height)))
  ([this width height resolution]
    (-> this (.setSize width height resolution))))

(defn set-style
  "Method.

  Member of CubeTexture.

  Changes style options of BaseTexture"
  ([this]
    (-> this (.setStyle)))
  ([this scale-mode]
    (-> this (.setStyle scale-mode)))
  ([this scale-mode mipmap]
    (-> this (.setStyle scale-mode mipmap))))

(defn update
  "Method.

  Member of CubeTexture.

  Invalidates the object. Texture becomes valid if width and height
  greater than zero."
  ([this]
    (-> this (.update))))

(defn anisotropic-level
  "Property.

  Member of CubeTexture.

  Anisotropic filtering level of texture"
  [this]
  (-> this .-anisotropicLevel))

(defn set-anisotropic-level!
  "Property.

  Member of CubeTexture.

  Anisotropic filtering level of texture"
  [this val]
  (aset this "anisotropicLevel" val))

(defn cache-id
  "Property.

  Member of CubeTexture.

  Currently default cache ID."
  [this]
  (-> this .-cacheId))

(defn set-cache-id!
  "Property.

  Member of CubeTexture.

  Currently default cache ID."
  [this val]
  (aset this "cacheId" val))

(defn destroyed
  "Property.

  Member of CubeTexture.

  Flag if BaseTexture has been destroyed."
  [this]
  (-> this .-destroyed))

(defn set-destroyed!
  "Property.

  Member of CubeTexture.

  Flag if BaseTexture has been destroyed."
  [this val]
  (aset this "destroyed" val))

(defn dirty-id
  "Property.

  Member of CubeTexture.

  Used by TextureSystem to only update texture to the GPU when
  Please call `update()` to increment it."
  [this]
  (-> this .-dirtyId))

(defn set-dirty-id!
  "Property.

  Member of CubeTexture.

  Used by TextureSystem to only update texture to the GPU when
  Please call `update()` to increment it."
  [this val]
  (aset this "dirtyId" val))

(defn dirty-style-id
  "Property.

  Member of CubeTexture.

  Used by TextureSystem to only update texture style when needed."
  [this]
  (-> this .-dirtyStyleId))

(defn set-dirty-style-id!
  "Property.

  Member of CubeTexture.

  Used by TextureSystem to only update texture style when needed."
  [this val]
  (aset this "dirtyStyleId" val))

(defn format
  "Property.

  Member of CubeTexture.

  The pixel format of the texture"
  [this]
  (-> this .-format))

(defn set-format!
  "Property.

  Member of CubeTexture.

  The pixel format of the texture"
  [this val]
  (aset this "format" val))

(defn height
  "Property.

  Member of CubeTexture.

  The height of the base texture set when the image has loaded"
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of CubeTexture.

  The height of the base texture set when the image has loaded"
  [this val]
  (aset this "height" val))

(defn is-power-of-two
  "Property.

  Member of CubeTexture.

  Whether or not the texture is a power of two, try to use power
  two textures as much
  as you can"
  [this]
  (-> this .-isPowerOfTwo))

(defn set-is-power-of-two!
  "Property.

  Member of CubeTexture.

  Whether or not the texture is a power of two, try to use power
  two textures as much
  as you can"
  [this val]
  (aset this "isPowerOfTwo" val))

(defn mipmap
  "Property.

  Member of CubeTexture.

  Mipmap mode of the texture, affects downscaled images"
  [this]
  (-> this .-mipmap))

(defn set-mipmap!
  "Property.

  Member of CubeTexture.

  Mipmap mode of the texture, affects downscaled images"
  [this val]
  (aset this "mipmap" val))

(defn premultiply-alpha
  "Property.

  Member of CubeTexture.

  Set to true to enable pre-multiplied alpha"
  [this]
  (-> this .-premultiplyAlpha))

(defn set-premultiply-alpha!
  "Property.

  Member of CubeTexture.

  Set to true to enable pre-multiplied alpha"
  [this val]
  (aset this "premultiplyAlpha" val))

(defn real-height
  "Property.

  Member of CubeTexture.

  Pixel height of the source of this texture"
  [this]
  (-> this .-realHeight))

(defn set-real-height!
  "Property.

  Member of CubeTexture.

  Pixel height of the source of this texture"
  [this val]
  (aset this "realHeight" val))

(defn real-width
  "Property.

  Member of CubeTexture.

  Pixel width of the source of this texture"
  [this]
  (-> this .-realWidth))

(defn set-real-width!
  "Property.

  Member of CubeTexture.

  Pixel width of the source of this texture"
  [this val]
  (aset this "realWidth" val))

(defn resolution
  "Property.

  Member of CubeTexture.

  The resolution / device pixel ratio of the texture"
  [this]
  (-> this .-resolution))

(defn set-resolution!
  "Property.

  Member of CubeTexture.

  The resolution / device pixel ratio of the texture"
  [this val]
  (aset this "resolution" val))

(defn resource
  "Property.

  Member of CubeTexture.

  The resource used by this BaseTexture, there can only
  be one resource per BaseTexture, but textures can share
  resources."
  [this]
  (-> this .-resource))

(defn set-resource!
  "Property.

  Member of CubeTexture.

  The resource used by this BaseTexture, there can only
  be one resource per BaseTexture, but textures can share
  resources."
  [this val]
  (aset this "resource" val))

(defn scale-mode
  "Property.

  Member of CubeTexture.

  The scale mode to apply when scaling this texture"
  [this]
  (-> this .-scaleMode))

(defn set-scale-mode!
  "Property.

  Member of CubeTexture.

  The scale mode to apply when scaling this texture"
  [this val]
  (aset this "scaleMode" val))

(defn target
  "Property.

  Member of CubeTexture.

  The target type"
  [this]
  (-> this .-target))

(defn set-target!
  "Property.

  Member of CubeTexture.

  The target type"
  [this val]
  (aset this "target" val))

(defn texture-cache-ids
  "Property.

  Member of CubeTexture.

  The collection of alternative cache ids, since some BaseTextures
  can have more than one ID, short name and longer full URL"
  [this]
  (-> this .-textureCacheIds))

(defn set-texture-cache-ids!
  "Property.

  Member of CubeTexture.

  The collection of alternative cache ids, since some BaseTextures
  can have more than one ID, short name and longer full URL"
  [this val]
  (aset this "textureCacheIds" val))

(defn touched
  "Property.

  Member of CubeTexture.

  Used by automatic texture Garbage Collection, stores last GC
  when it was bound"
  [this]
  (-> this .-touched))

(defn set-touched!
  "Property.

  Member of CubeTexture.

  Used by automatic texture Garbage Collection, stores last GC
  when it was bound"
  [this val]
  (aset this "touched" val))

(defn type
  "Property.

  Member of CubeTexture.

  The type of resource data"
  [this]
  (-> this .-type))

(defn set-type!
  "Property.

  Member of CubeTexture.

  The type of resource data"
  [this val]
  (aset this "type" val))

(defn uid
  "Property.

  Member of CubeTexture.

  Global unique identifier for this BaseTexture"
  [this]
  (-> this .-uid))

(defn set-uid!
  "Property.

  Member of CubeTexture.

  Global unique identifier for this BaseTexture"
  [this val]
  (aset this "uid" val))

(defn valid
  "Property.

  Member of CubeTexture.

  Generally speaking means when resource is loaded."
  [this]
  (-> this .-valid))

(defn set-valid!
  "Property.

  Member of CubeTexture.

  Generally speaking means when resource is loaded."
  [this val]
  (aset this "valid" val))

(defn width
  "Property.

  Member of CubeTexture.

  The width of the base texture set when the image has loaded"
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of CubeTexture.

  The width of the base texture set when the image has loaded"
  [this val]
  (aset this "width" val))

(defn wrap-mode
  "Property.

  Member of CubeTexture.

  How the texture wraps"
  [this]
  (-> this .-wrapMode))

(defn set-wrap-mode!
  "Property.

  Member of CubeTexture.

  How the texture wraps"
  [this val]
  (aset this "wrapMode" val))

