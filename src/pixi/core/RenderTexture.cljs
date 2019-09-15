(ns pixi.core.RenderTexture
  "Extends - Texture.

  A RenderTexture is a special texture that allows any PixiJS display
  to be rendered to it.
  __Hint__: All DisplayObjects (i.e. Sprites) that render to a
  should be preloaded
  otherwise black rectangles will be drawn instead.
  __Hint-2__: The actual memory allocation will happen on first
  You shouldn't create renderTextures each frame just to delete
  after, try to reuse them.
  A RenderTexture takes a snapshot of any Display Object given
  its render method. For example:
  ```js
  let renderer = PIXI.autoDetectRenderer();
  let renderTexture = PIXI.RenderTexture.create(800, 600);
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
  let renderTexture = new PIXI.RenderTexture.create(100, 100);
  renderer.render(sprite, renderTexture); // Renders to center
  RenderTexture
  ```"
  (:refer-clojure :exclude [empty create clone update]))

(defn new
  "Constructor."
  ([base-render-texture]
    (new js/RenderTexture base-render-texture))
  ([base-render-texture frame]
    (new js/RenderTexture base-render-texture frame)))

(defn *add-to-cache
  "Method.

  Member of RenderTexture.

  Adds a Texture to the global TextureCache. This cache is shared
  the whole PIXI object."
  ([texture id]
    (-> js/Texture (.addToCache texture id))))

(defn clone
  "Method.

  Member of RenderTexture.

  Creates a new texture object that acts the same as this one."
  ([this]
    (-> this (.clone))))

(defn *create
  "Method.

  Member of RenderTexture.

  A short hand way of creating a render texture."
  ([]
    (-> js/RenderTexture (.create)))
  ([options]
    (-> js/RenderTexture (.create options))))

(defn destroy
  "Method.

  Member of RenderTexture.

  Destroys this texture"
  ([this]
    (-> this (.destroy)))
  ([this destroy-base]
    (-> this (.destroy destroy-base))))

(defn *from
  "Method.

  Member of RenderTexture.

  Helper function that creates a new Texture based on the source
  provide.
  The source can be - frame id, image url, video url, canvas element,
  element, base texture"
  ([source]
    (-> js/Texture (.from source)))
  ([source options]
    (-> js/Texture (.from source options)))
  ([source options strict]
    (-> js/Texture (.from source options strict))))

(defn *from-buffer
  "Method.

  Member of RenderTexture.

  Create a new Texture with a BufferResource from a Float32Array.
  RGBA values are floats from 0 to 1."
  ([buffer width height]
    (-> js/Texture (.fromBuffer buffer width height)))
  ([buffer width height options]
    (-> js/Texture (.fromBuffer buffer width height options))))

(defn *from-loader
  "Method.

  Member of RenderTexture.

  Create a texture from a source and add to the cache."
  ([source image-url]
    (-> js/Texture (.fromLoader source image-url)))
  ([source image-url name]
    (-> js/Texture (.fromLoader source image-url name))))

(defn on-base-texture-updated
  "Method.

  Member of RenderTexture.

  Called when the base texture is updated"
  ([this base-texture]
    (-> this (.onBaseTextureUpdated base-texture))))

(defn *remove-from-cache
  "Method.

  Member of RenderTexture.

  Remove a Texture from the global TextureCache."
  ([texture]
    (-> js/Texture (.removeFromCache texture))))

(defn resize
  "Method.

  Member of RenderTexture.

  Resizes the RenderTexture."
  ([this width height]
    (-> this (.resize width height)))
  ([this width height resize-base-texture]
    (-> this (.resize width height resize-base-texture))))

(defn set-resolution
  "Method.

  Member of RenderTexture.

  Changes the resolution of baseTexture, but does not change framebuffer"
  ([this resolution]
    (-> this (.setResolution resolution))))

(defn update
  "Method.

  Member of RenderTexture.

  Updates this texture on the gpu.
  Calls the TextureResource update.
  If you adjusted `frame` manually, please call `updateUvs()` instead."
  ([this]
    (-> this (.update))))

(defn update-uvs
  "Method.

  Member of RenderTexture.

  Updates the internal WebGL UV cache. Use it after you change
  or `trim` of the texture.
  Call it after changing the frame"
  ([this]
    (-> this (.updateUvs))))

(defn empty
  "Property.

  Member of RenderTexture.

  An empty texture, used often to not have to create multiple empty
  Can not be destroyed."
  []
  (-> js/Texture .-EMPTY))

(defn set-empty!
  "Property.

  Member of RenderTexture.

  An empty texture, used often to not have to create multiple empty
  Can not be destroyed."
  [val]
  (aset js/Texture "EMPTY" val))

(defn white
  "Property.

  Member of RenderTexture.

  A white texture of 16x16 size, used for graphics and other things
  Can not be destroyed."
  []
  (-> js/Texture .-WHITE))

(defn set-white!
  "Property.

  Member of RenderTexture.

  A white texture of 16x16 size, used for graphics and other things
  Can not be destroyed."
  [val]
  (aset js/Texture "WHITE" val))

(defn base-texture
  "Property.

  Member of RenderTexture.

  The base texture that this texture uses."
  [this]
  (-> this .-baseTexture))

(defn set-base-texture!
  "Property.

  Member of RenderTexture.

  The base texture that this texture uses."
  [this val]
  (aset this "baseTexture" val))

(defn default-anchor
  "Property.

  Member of RenderTexture.

  Anchor point that is used as default if sprite is created with
  texture.
  Changing the `defaultAnchor` at a later point of time will not
  Sprite's anchor point."
  [this]
  (-> this .-defaultAnchor))

(defn set-default-anchor!
  "Property.

  Member of RenderTexture.

  Anchor point that is used as default if sprite is created with
  texture.
  Changing the `defaultAnchor` at a later point of time will not
  Sprite's anchor point."
  [this val]
  (aset this "defaultAnchor" val))

(defn filter-frame
  "Property.

  Member of RenderTexture.

  Stores `sourceFrame` when this texture is inside current filter
  You can read it inside filters."
  [this]
  (-> this .-filterFrame))

(defn set-filter-frame!
  "Property.

  Member of RenderTexture.

  Stores `sourceFrame` when this texture is inside current filter
  You can read it inside filters."
  [this val]
  (aset this "filterFrame" val))

(defn filter-pool-key
  "Property.

  Member of RenderTexture.

  The key for pooled texture of FilterSystem"
  [this]
  (-> this .-filterPoolKey))

(defn set-filter-pool-key!
  "Property.

  Member of RenderTexture.

  The key for pooled texture of FilterSystem"
  [this val]
  (aset this "filterPoolKey" val))

(defn frame
  "Property.

  Member of RenderTexture.

  The frame specifies the region of the base texture that this
  uses.
  Please call `updateUvs()` after you change coordinates of `frame`"
  [this]
  (-> this .-frame))

(defn set-frame!
  "Property.

  Member of RenderTexture.

  The frame specifies the region of the base texture that this
  uses.
  Please call `updateUvs()` after you change coordinates of `frame`"
  [this val]
  (aset this "frame" val))

(defn height
  "Property.

  Member of RenderTexture.

  The height of the Texture in pixels."
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of RenderTexture.

  The height of the Texture in pixels."
  [this val]
  (aset this "height" val))

(defn no-frame
  "Property.

  Member of RenderTexture.

  Does this Texture have any frame data assigned to it?
  This mode is enabled automatically if no frame was passed inside
  In this mode texture is subscribed to baseTexture events, and
  `update` on any change.
  Beware, after loading or resize of baseTexture event can fired
  times!
  If you want more control, subscribe on baseTexture itself.
  ```js
  texture.on('update', () => {});
  ```
  Any assignment of `frame` switches off `noFrame` mode."
  [this]
  (-> this .-noFrame))

(defn set-no-frame!
  "Property.

  Member of RenderTexture.

  Does this Texture have any frame data assigned to it?
  This mode is enabled automatically if no frame was passed inside
  In this mode texture is subscribed to baseTexture events, and
  `update` on any change.
  Beware, after loading or resize of baseTexture event can fired
  times!
  If you want more control, subscribe on baseTexture itself.
  ```js
  texture.on('update', () => {});
  ```
  Any assignment of `frame` switches off `noFrame` mode."
  [this val]
  (aset this "noFrame" val))

(defn orig
  "Property.

  Member of RenderTexture.

  This is the area of original texture, before it was put in atlas"
  [this]
  (-> this .-orig))

(defn set-orig!
  "Property.

  Member of RenderTexture.

  This is the area of original texture, before it was put in atlas"
  [this val]
  (aset this "orig" val))

(defn requires-update
  "Property.

  Member of RenderTexture.

  This will let a renderer know that a texture has been updated
  mainly for WebGL uv updates)"
  [this]
  (-> this .-requiresUpdate))

(defn set-requires-update!
  "Property.

  Member of RenderTexture.

  This will let a renderer know that a texture has been updated
  mainly for WebGL uv updates)"
  [this val]
  (aset this "requiresUpdate" val))

(defn resolution
  "Property.

  Member of RenderTexture.

  Returns resolution of baseTexture"
  [this]
  (-> this .-resolution))

(defn set-resolution!
  "Property.

  Member of RenderTexture.

  Returns resolution of baseTexture"
  [this val]
  (aset this "resolution" val))

(defn rotate
  "Property.

  Member of RenderTexture.

  Indicates whether the texture is rotated inside the atlas
  set to 2 to compensate for texture packer rotation
  set to 6 to compensate for spine packer rotation
  can be used to rotate or mirror sprites
  See {@link PIXI.GroupD8} for explanation"
  [this]
  (-> this .-rotate))

(defn set-rotate!
  "Property.

  Member of RenderTexture.

  Indicates whether the texture is rotated inside the atlas
  set to 2 to compensate for texture packer rotation
  set to 6 to compensate for spine packer rotation
  can be used to rotate or mirror sprites
  See {@link PIXI.GroupD8} for explanation"
  [this val]
  (aset this "rotate" val))

(defn texture-cache-ids
  "Property.

  Member of RenderTexture.

  The ids under which this Texture has been added to the texture
  This is
  automatically set as long as Texture.addToCache is used, but
  not be set if a
  Texture is added directly to the TextureCache array."
  [this]
  (-> this .-textureCacheIds))

(defn set-texture-cache-ids!
  "Property.

  Member of RenderTexture.

  The ids under which this Texture has been added to the texture
  This is
  automatically set as long as Texture.addToCache is used, but
  not be set if a
  Texture is added directly to the TextureCache array."
  [this val]
  (aset this "textureCacheIds" val))

(defn trim
  "Property.

  Member of RenderTexture.

  This is the trimmed area of original texture, before it was put
  atlas
  Please call `updateUvs()` after you change coordinates of `trim`"
  [this]
  (-> this .-trim))

(defn set-trim!
  "Property.

  Member of RenderTexture.

  This is the trimmed area of original texture, before it was put
  atlas
  Please call `updateUvs()` after you change coordinates of `trim`"
  [this val]
  (aset this "trim" val))

(defn uv-matrix
  "Property.

  Member of RenderTexture.

  Default TextureMatrix instance for this texture
  By default that object is not created because its heavy"
  [this]
  (-> this .-uvMatrix))

(defn set-uv-matrix!
  "Property.

  Member of RenderTexture.

  Default TextureMatrix instance for this texture
  By default that object is not created because its heavy"
  [this val]
  (aset this "uvMatrix" val))

(defn valid
  "Property.

  Member of RenderTexture.

  This will let the renderer know if the texture is valid. If it's
  then it cannot be rendered."
  [this]
  (-> this .-valid))

(defn set-valid!
  "Property.

  Member of RenderTexture.

  This will let the renderer know if the texture is valid. If it's
  then it cannot be rendered."
  [this val]
  (aset this "valid" val))

(defn width
  "Property.

  Member of RenderTexture.

  The width of the Texture in pixels."
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of RenderTexture.

  The width of the Texture in pixels."
  [this val]
  (aset this "width" val))

