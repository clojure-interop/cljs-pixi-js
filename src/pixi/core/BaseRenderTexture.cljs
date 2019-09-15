(ns pixi.core.BaseRenderTexture
  "Extends - BaseTexture.

  A BaseRenderTexture is a special texture that allows any PixiJS
  object to be rendered to it.
  __Hint__: All DisplayObjects (i.e. Sprites) that render to a
  should be preloaded
  otherwise black rectangles will be drawn instead.
  A BaseRenderTexture takes a snapshot of any Display Object given
  its render method. The position
  and rotation of the given Display Objects is ignored. For example:
  ```js
  let renderer = PIXI.autoDetectRenderer();
  let baseRenderTexture = new PIXI.BaseRenderTexture({ width: 800,
  600 });
  let renderTexture = new PIXI.RenderTexture(baseRenderTexture);
  let sprite = PIXI.Sprite.from(\"spinObj_01.png\");
  sprite.position.x = 800/2;
  sprite.position.y = 600/2;
  sprite.anchor.x = 0.5;
  sprite.anchor.y = 0.5;
  renderer.render(sprite, renderTexture);
  ```
  The Sprite in this case will be rendered using its local transform.
  render this sprite at 0,0
  you can clear the transform
  ```js
  sprite.setTransform()
  let baseRenderTexture = new PIXI.BaseRenderTexture({ width: 100,
  100 });
  let renderTexture = new PIXI.RenderTexture(baseRenderTexture);
  renderer.render(sprite, renderTexture); // Renders to center
  RenderTexture
  ```"
  (:refer-clojure :exclude [type update]))

(defn new
  "Constructor."
  ([]
    (new js/BaseRenderTexture))
  ([options]
    (new js/BaseRenderTexture options)))

(defn *add-to-cache
  "Method.

  Member of BaseRenderTexture.

  Adds a BaseTexture to the global BaseTextureCache. This cache
  shared across the whole PIXI object."
  ([base-texture id]
    (-> js/BaseTexture (.addToCache base-texture id))))

(defn destroy
  "Method.

  Member of BaseRenderTexture.

  Destroys this texture."
  ([this]
    (-> this (.destroy))))

(defn dispose
  "Method.

  Member of BaseRenderTexture.

  Frees the texture and framebuffer from WebGL memory without destroying
  texture object.
  This means you can still use the texture later which will upload
  to GPU
  memory again."
  ([this]
    (-> this (.dispose))))

(defn *from
  "Method.

  Member of BaseRenderTexture.

  Helper function that creates a base texture based on the source
  provide.
  The source can be - image url, image element, canvas element.
  the
  source is an image url or an image element and not in the base
  cache, it will be created and loaded."
  ([source]
    (-> js/BaseTexture (.from source)))
  ([source options]
    (-> js/BaseTexture (.from source options)))
  ([source options strict]
    (-> js/BaseTexture (.from source options strict))))

(defn *from-buffer
  "Method.

  Member of BaseRenderTexture.

  Create a new BaseTexture with a BufferResource from a Float32Array.
  RGBA values are floats from 0 to 1."
  ([buffer width height]
    (-> js/BaseTexture (.fromBuffer buffer width height)))
  ([buffer width height options]
    (-> js/BaseTexture (.fromBuffer buffer width height options))))

(defn on-error
  "Method.

  Member of BaseRenderTexture.

  Handle errors with resources."
  ([this event]
    (-> this (.onError event))))

(defn *remove-from-cache
  "Method.

  Member of BaseRenderTexture.

  Remove a BaseTexture from the global BaseTextureCache."
  ([base-texture]
    (-> js/BaseTexture (.removeFromCache base-texture))))

(defn resize
  "Method.

  Member of BaseRenderTexture.

  Resizes the BaseRenderTexture."
  ([this width height]
    (-> this (.resize width height))))

(defn set-real-size
  "Method.

  Member of BaseRenderTexture.

  Sets real size of baseTexture, preserves current resolution."
  ([this real-width real-height]
    (-> this (.setRealSize real-width real-height)))
  ([this real-width real-height resolution]
    (-> this (.setRealSize real-width real-height resolution))))

(defn set-resolution
  "Method.

  Member of BaseRenderTexture.

  Changes resolution"
  ([this]
    (-> this (.setResolution)))
  ([this resolution]
    (-> this (.setResolution resolution))))

(defn set-resource
  "Method.

  Member of BaseRenderTexture.

  Sets the resource if it wasn't set. Throws error if resource
  present"
  ([this resource]
    (-> this (.setResource resource))))

(defn set-size
  "Method.

  Member of BaseRenderTexture.

  Changes w/h/resolution. Texture becomes valid if width and height
  greater than zero."
  ([this width height]
    (-> this (.setSize width height)))
  ([this width height resolution]
    (-> this (.setSize width height resolution))))

(defn set-style
  "Method.

  Member of BaseRenderTexture.

  Changes style options of BaseTexture"
  ([this]
    (-> this (.setStyle)))
  ([this scale-mode]
    (-> this (.setStyle scale-mode)))
  ([this scale-mode mipmap]
    (-> this (.setStyle scale-mode mipmap))))

(defn update
  "Method.

  Member of BaseRenderTexture.

  Invalidates the object. Texture becomes valid if width and height
  greater than zero."
  ([this]
    (-> this (.update))))

(defn anisotropic-level
  "Property.

  Member of BaseRenderTexture.

  Anisotropic filtering level of texture"
  [this]
  (-> this .-anisotropicLevel))

(defn set-anisotropic-level!
  "Property.

  Member of BaseRenderTexture.

  Anisotropic filtering level of texture"
  [this val]
  (aset this "anisotropicLevel" val))

(defn cache-id
  "Property.

  Member of BaseRenderTexture.

  Currently default cache ID."
  [this]
  (-> this .-cacheId))

(defn set-cache-id!
  "Property.

  Member of BaseRenderTexture.

  Currently default cache ID."
  [this val]
  (aset this "cacheId" val))

(defn destroyed
  "Property.

  Member of BaseRenderTexture.

  Flag if BaseTexture has been destroyed."
  [this]
  (-> this .-destroyed))

(defn set-destroyed!
  "Property.

  Member of BaseRenderTexture.

  Flag if BaseTexture has been destroyed."
  [this val]
  (aset this "destroyed" val))

(defn dirty-id
  "Property.

  Member of BaseRenderTexture.

  Used by TextureSystem to only update texture to the GPU when
  Please call `update()` to increment it."
  [this]
  (-> this .-dirtyId))

(defn set-dirty-id!
  "Property.

  Member of BaseRenderTexture.

  Used by TextureSystem to only update texture to the GPU when
  Please call `update()` to increment it."
  [this val]
  (aset this "dirtyId" val))

(defn dirty-style-id
  "Property.

  Member of BaseRenderTexture.

  Used by TextureSystem to only update texture style when needed."
  [this]
  (-> this .-dirtyStyleId))

(defn set-dirty-style-id!
  "Property.

  Member of BaseRenderTexture.

  Used by TextureSystem to only update texture style when needed."
  [this val]
  (aset this "dirtyStyleId" val))

(defn filter-stack
  "Property.

  Member of BaseRenderTexture.

  The data structure for the filters."
  [this]
  (-> this .-filterStack))

(defn set-filter-stack!
  "Property.

  Member of BaseRenderTexture.

  The data structure for the filters."
  [this val]
  (aset this "filterStack" val))

(defn format
  "Property.

  Member of BaseRenderTexture.

  The pixel format of the texture"
  [this]
  (-> this .-format))

(defn set-format!
  "Property.

  Member of BaseRenderTexture.

  The pixel format of the texture"
  [this val]
  (aset this "format" val))

(defn height
  "Property.

  Member of BaseRenderTexture.

  The height of the base texture set when the image has loaded"
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of BaseRenderTexture.

  The height of the base texture set when the image has loaded"
  [this val]
  (aset this "height" val))

(defn is-power-of-two
  "Property.

  Member of BaseRenderTexture.

  Whether or not the texture is a power of two, try to use power
  two textures as much
  as you can"
  [this]
  (-> this .-isPowerOfTwo))

(defn set-is-power-of-two!
  "Property.

  Member of BaseRenderTexture.

  Whether or not the texture is a power of two, try to use power
  two textures as much
  as you can"
  [this val]
  (aset this "isPowerOfTwo" val))

(defn mipmap
  "Property.

  Member of BaseRenderTexture.

  Mipmap mode of the texture, affects downscaled images"
  [this]
  (-> this .-mipmap))

(defn set-mipmap!
  "Property.

  Member of BaseRenderTexture.

  Mipmap mode of the texture, affects downscaled images"
  [this val]
  (aset this "mipmap" val))

(defn premultiply-alpha
  "Property.

  Member of BaseRenderTexture.

  Set to true to enable pre-multiplied alpha"
  [this]
  (-> this .-premultiplyAlpha))

(defn set-premultiply-alpha!
  "Property.

  Member of BaseRenderTexture.

  Set to true to enable pre-multiplied alpha"
  [this val]
  (aset this "premultiplyAlpha" val))

(defn real-height
  "Property.

  Member of BaseRenderTexture.

  Pixel height of the source of this texture"
  [this]
  (-> this .-realHeight))

(defn set-real-height!
  "Property.

  Member of BaseRenderTexture.

  Pixel height of the source of this texture"
  [this val]
  (aset this "realHeight" val))

(defn real-width
  "Property.

  Member of BaseRenderTexture.

  Pixel width of the source of this texture"
  [this]
  (-> this .-realWidth))

(defn set-real-width!
  "Property.

  Member of BaseRenderTexture.

  Pixel width of the source of this texture"
  [this val]
  (aset this "realWidth" val))

(defn resolution
  "Property.

  Member of BaseRenderTexture.

  The resolution / device pixel ratio of the texture"
  [this]
  (-> this .-resolution))

(defn set-resolution!
  "Property.

  Member of BaseRenderTexture.

  The resolution / device pixel ratio of the texture"
  [this val]
  (aset this "resolution" val))

(defn resource
  "Property.

  Member of BaseRenderTexture.

  The resource used by this BaseTexture, there can only
  be one resource per BaseTexture, but textures can share
  resources."
  [this]
  (-> this .-resource))

(defn set-resource!
  "Property.

  Member of BaseRenderTexture.

  The resource used by this BaseTexture, there can only
  be one resource per BaseTexture, but textures can share
  resources."
  [this val]
  (aset this "resource" val))

(defn scale-mode
  "Property.

  Member of BaseRenderTexture.

  The scale mode to apply when scaling this texture"
  [this]
  (-> this .-scaleMode))

(defn set-scale-mode!
  "Property.

  Member of BaseRenderTexture.

  The scale mode to apply when scaling this texture"
  [this val]
  (aset this "scaleMode" val))

(defn stencil-mask-stack
  "Property.

  Member of BaseRenderTexture.

  The data structure for the stencil masks."
  [this]
  (-> this .-stencilMaskStack))

(defn set-stencil-mask-stack!
  "Property.

  Member of BaseRenderTexture.

  The data structure for the stencil masks."
  [this val]
  (aset this "stencilMaskStack" val))

(defn target
  "Property.

  Member of BaseRenderTexture.

  The target type"
  [this]
  (-> this .-target))

(defn set-target!
  "Property.

  Member of BaseRenderTexture.

  The target type"
  [this val]
  (aset this "target" val))

(defn texture-cache-ids
  "Property.

  Member of BaseRenderTexture.

  The collection of alternative cache ids, since some BaseTextures
  can have more than one ID, short name and longer full URL"
  [this]
  (-> this .-textureCacheIds))

(defn set-texture-cache-ids!
  "Property.

  Member of BaseRenderTexture.

  The collection of alternative cache ids, since some BaseTextures
  can have more than one ID, short name and longer full URL"
  [this val]
  (aset this "textureCacheIds" val))

(defn touched
  "Property.

  Member of BaseRenderTexture.

  Used by automatic texture Garbage Collection, stores last GC
  when it was bound"
  [this]
  (-> this .-touched))

(defn set-touched!
  "Property.

  Member of BaseRenderTexture.

  Used by automatic texture Garbage Collection, stores last GC
  when it was bound"
  [this val]
  (aset this "touched" val))

(defn type
  "Property.

  Member of BaseRenderTexture.

  The type of resource data"
  [this]
  (-> this .-type))

(defn set-type!
  "Property.

  Member of BaseRenderTexture.

  The type of resource data"
  [this val]
  (aset this "type" val))

(defn uid
  "Property.

  Member of BaseRenderTexture.

  Global unique identifier for this BaseTexture"
  [this]
  (-> this .-uid))

(defn set-uid!
  "Property.

  Member of BaseRenderTexture.

  Global unique identifier for this BaseTexture"
  [this val]
  (aset this "uid" val))

(defn valid
  "Property.

  Member of BaseRenderTexture.

  Generally speaking means when resource is loaded."
  [this]
  (-> this .-valid))

(defn set-valid!
  "Property.

  Member of BaseRenderTexture.

  Generally speaking means when resource is loaded."
  [this val]
  (aset this "valid" val))

(defn width
  "Property.

  Member of BaseRenderTexture.

  The width of the base texture set when the image has loaded"
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of BaseRenderTexture.

  The width of the base texture set when the image has loaded"
  [this val]
  (aset this "width" val))

(defn wrap-mode
  "Property.

  Member of BaseRenderTexture.

  How the texture wraps"
  [this]
  (-> this .-wrapMode))

(defn set-wrap-mode!
  "Property.

  Member of BaseRenderTexture.

  How the texture wraps"
  [this val]
  (aset this "wrapMode" val))

