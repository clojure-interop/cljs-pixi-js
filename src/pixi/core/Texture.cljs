(ns pixi.core.Texture
  "Extends - EventEmitter.

  A texture stores the information that represents an image or
  of an image.
  It cannot be added to the display list directly; instead use
  as the texture for a Sprite.
  If no frame is provided for a texture, then the whole image is
  You can directly create a texture from an image and then reuse
  multiple times like this :
  ```js
  let texture = PIXI.Texture.from('assets/image.png');
  let sprite1 = new PIXI.Sprite(texture);
  let sprite2 = new PIXI.Sprite(texture);
  ```
  If you didnt pass the texture frame to constructor, it enables
  mode:
  it subscribes on baseTexture events, it automatically resizes
  the same time as baseTexture.
  Textures made from SVGs, loaded or not, cannot be used before
  file finishes processing.
  You can check for this by checking the sprite's _textureID property.
  ```js
  var texture = PIXI.Texture.from('assets/image.svg');
  var sprite1 = new PIXI.Sprite(texture);
  //sprite1._textureID should not be undefined if the texture has
  processing the SVG file
  ```
  You can use a ticker or rAF to ensure your sprites load the finished
  after processing. See issue #3068."
  (:refer-clojure :exclude [empty clone update]))

(defn new
  "Constructor."
  ([base-texture]
    (new js/Texture base-texture))
  ([base-texture frame]
    (new js/Texture base-texture frame))
  ([base-texture frame orig]
    (new js/Texture base-texture frame orig))
  ([base-texture frame orig trim]
    (new js/Texture base-texture frame orig trim))
  ([base-texture frame orig trim rotate]
    (new js/Texture base-texture frame orig trim rotate))
  ([base-texture frame orig trim rotate anchor]
    (new js/Texture base-texture frame orig trim rotate anchor)))

(defn *add-to-cache
  "Method.

  Member of Texture.

  Adds a Texture to the global TextureCache. This cache is shared
  the whole PIXI object."
  ([texture id]
    (-> js/Texture (.addToCache texture id))))

(defn clone
  "Method.

  Member of Texture.

  Creates a new texture object that acts the same as this one."
  ([this]
    (-> this (.clone))))

(defn destroy
  "Method.

  Member of Texture.

  Destroys this texture"
  ([this]
    (-> this (.destroy)))
  ([this destroy-base]
    (-> this (.destroy destroy-base))))

(defn *from
  "Method.

  Member of Texture.

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

  Member of Texture.

  Create a new Texture with a BufferResource from a Float32Array.
  RGBA values are floats from 0 to 1."
  ([buffer width height]
    (-> js/Texture (.fromBuffer buffer width height)))
  ([buffer width height options]
    (-> js/Texture (.fromBuffer buffer width height options))))

(defn *from-loader
  "Method.

  Member of Texture.

  Create a texture from a source and add to the cache."
  ([source image-url]
    (-> js/Texture (.fromLoader source image-url)))
  ([source image-url name]
    (-> js/Texture (.fromLoader source image-url name))))

(defn on-base-texture-updated
  "Method.

  Member of Texture.

  Called when the base texture is updated"
  ([this base-texture]
    (-> this (.onBaseTextureUpdated base-texture))))

(defn *remove-from-cache
  "Method.

  Member of Texture.

  Remove a Texture from the global TextureCache."
  ([texture]
    (-> js/Texture (.removeFromCache texture))))

(defn update
  "Method.

  Member of Texture.

  Updates this texture on the gpu.
  Calls the TextureResource update.
  If you adjusted `frame` manually, please call `updateUvs()` instead."
  ([this]
    (-> this (.update))))

(defn update-uvs
  "Method.

  Member of Texture.

  Updates the internal WebGL UV cache. Use it after you change
  or `trim` of the texture.
  Call it after changing the frame"
  ([this]
    (-> this (.updateUvs))))

(defn empty
  "Property.

  Member of Texture.

  An empty texture, used often to not have to create multiple empty
  Can not be destroyed."
  []
  (-> js/Texture .-EMPTY))

(defn set-empty!
  "Property.

  Member of Texture.

  An empty texture, used often to not have to create multiple empty
  Can not be destroyed."
  [val]
  (aset js/Texture "EMPTY" val))

(defn white
  "Property.

  Member of Texture.

  A white texture of 16x16 size, used for graphics and other things
  Can not be destroyed."
  []
  (-> js/Texture .-WHITE))

(defn set-white!
  "Property.

  Member of Texture.

  A white texture of 16x16 size, used for graphics and other things
  Can not be destroyed."
  [val]
  (aset js/Texture "WHITE" val))

(defn base-texture
  "Property.

  Member of Texture.

  The base texture that this texture uses."
  [this]
  (-> this .-baseTexture))

(defn set-base-texture!
  "Property.

  Member of Texture.

  The base texture that this texture uses."
  [this val]
  (aset this "baseTexture" val))

(defn default-anchor
  "Property.

  Member of Texture.

  Anchor point that is used as default if sprite is created with
  texture.
  Changing the `defaultAnchor` at a later point of time will not
  Sprite's anchor point."
  [this]
  (-> this .-defaultAnchor))

(defn set-default-anchor!
  "Property.

  Member of Texture.

  Anchor point that is used as default if sprite is created with
  texture.
  Changing the `defaultAnchor` at a later point of time will not
  Sprite's anchor point."
  [this val]
  (aset this "defaultAnchor" val))

(defn frame
  "Property.

  Member of Texture.

  The frame specifies the region of the base texture that this
  uses.
  Please call `updateUvs()` after you change coordinates of `frame`"
  [this]
  (-> this .-frame))

(defn set-frame!
  "Property.

  Member of Texture.

  The frame specifies the region of the base texture that this
  uses.
  Please call `updateUvs()` after you change coordinates of `frame`"
  [this val]
  (aset this "frame" val))

(defn height
  "Property.

  Member of Texture.

  The height of the Texture in pixels."
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of Texture.

  The height of the Texture in pixels."
  [this val]
  (aset this "height" val))

(defn no-frame
  "Property.

  Member of Texture.

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

  Member of Texture.

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

  Member of Texture.

  This is the area of original texture, before it was put in atlas"
  [this]
  (-> this .-orig))

(defn set-orig!
  "Property.

  Member of Texture.

  This is the area of original texture, before it was put in atlas"
  [this val]
  (aset this "orig" val))

(defn requires-update
  "Property.

  Member of Texture.

  This will let a renderer know that a texture has been updated
  mainly for WebGL uv updates)"
  [this]
  (-> this .-requiresUpdate))

(defn set-requires-update!
  "Property.

  Member of Texture.

  This will let a renderer know that a texture has been updated
  mainly for WebGL uv updates)"
  [this val]
  (aset this "requiresUpdate" val))

(defn resolution
  "Property.

  Member of Texture.

  Returns resolution of baseTexture"
  [this]
  (-> this .-resolution))

(defn set-resolution!
  "Property.

  Member of Texture.

  Returns resolution of baseTexture"
  [this val]
  (aset this "resolution" val))

(defn rotate
  "Property.

  Member of Texture.

  Indicates whether the texture is rotated inside the atlas
  set to 2 to compensate for texture packer rotation
  set to 6 to compensate for spine packer rotation
  can be used to rotate or mirror sprites
  See {@link PIXI.GroupD8} for explanation"
  [this]
  (-> this .-rotate))

(defn set-rotate!
  "Property.

  Member of Texture.

  Indicates whether the texture is rotated inside the atlas
  set to 2 to compensate for texture packer rotation
  set to 6 to compensate for spine packer rotation
  can be used to rotate or mirror sprites
  See {@link PIXI.GroupD8} for explanation"
  [this val]
  (aset this "rotate" val))

(defn texture-cache-ids
  "Property.

  Member of Texture.

  The ids under which this Texture has been added to the texture
  This is
  automatically set as long as Texture.addToCache is used, but
  not be set if a
  Texture is added directly to the TextureCache array."
  [this]
  (-> this .-textureCacheIds))

(defn set-texture-cache-ids!
  "Property.

  Member of Texture.

  The ids under which this Texture has been added to the texture
  This is
  automatically set as long as Texture.addToCache is used, but
  not be set if a
  Texture is added directly to the TextureCache array."
  [this val]
  (aset this "textureCacheIds" val))

(defn trim
  "Property.

  Member of Texture.

  This is the trimmed area of original texture, before it was put
  atlas
  Please call `updateUvs()` after you change coordinates of `trim`"
  [this]
  (-> this .-trim))

(defn set-trim!
  "Property.

  Member of Texture.

  This is the trimmed area of original texture, before it was put
  atlas
  Please call `updateUvs()` after you change coordinates of `trim`"
  [this val]
  (aset this "trim" val))

(defn uv-matrix
  "Property.

  Member of Texture.

  Default TextureMatrix instance for this texture
  By default that object is not created because its heavy"
  [this]
  (-> this .-uvMatrix))

(defn set-uv-matrix!
  "Property.

  Member of Texture.

  Default TextureMatrix instance for this texture
  By default that object is not created because its heavy"
  [this val]
  (aset this "uvMatrix" val))

(defn valid
  "Property.

  Member of Texture.

  This will let the renderer know if the texture is valid. If it's
  then it cannot be rendered."
  [this]
  (-> this .-valid))

(defn set-valid!
  "Property.

  Member of Texture.

  This will let the renderer know if the texture is valid. If it's
  then it cannot be rendered."
  [this val]
  (aset this "valid" val))

(defn width
  "Property.

  Member of Texture.

  The width of the Texture in pixels."
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of Texture.

  The width of the Texture in pixels."
  [this val]
  (aset this "width" val))

