(ns pixi.TilingSprite
  "Extends - Sprite.

  A tiling sprite is a fast way of rendering a tiling image"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([texture]
    (new js/TilingSprite texture))
  ([texture width]
    (new js/TilingSprite texture width))
  ([texture width height]
    (new js/TilingSprite texture width height)))

(defn calculate-trimmed-vertices
  "Method.

  Member of TilingSprite.

  calculates worldTransform * vertices for a non texture with a
  store it in vertexTrimmedData
  This is used to ensure that the true width and height of a trimmed
  is respected"
  ([this]
    (-> this (.calculateTrimmedVertices))))

(defn calculate-vertices
  "Method.

  Member of TilingSprite.

  calculates worldTransform * vertices, store it in vertexData"
  ([this]
    (-> this (.calculateVertices))))

(defn contains-point
  "Method.

  Member of TilingSprite.

  Checks if a point is inside this tiling sprite."
  ([this point]
    (-> this (.containsPoint point))))

(defn destroy
  "Method.

  Member of TilingSprite.

  Destroys this sprite and optionally its texture and children"
  ([this]
    (-> this (.destroy)))
  ([this options]
    (-> this (.destroy options))))

(defn *from
  "Method.

  Member of TilingSprite.

  Helper function that creates a new tiling sprite based on the
  you provide.
  The source can be - frame id, image url, video url, canvas element,
  element, base texture"
  ([source width height]
    (-> js/TilingSprite (.from source width height))))

(defn *from-frame
  "Method.

  Member of TilingSprite.

  Helper function that creates a tiling sprite that will use a
  from the TextureCache based on the frameId
  The frame ids are created when a Texture packer file has been"
  ([frame-id width height]
    (-> js/TilingSprite (.fromFrame frame-id width height))))

(defn *from-image
  "Method.

  Member of TilingSprite.

  Helper function that creates a sprite that will contain a texture
  on an image url
  If the image is not in the texture cache it will be loaded"
  ([image-id width height]
    (-> js/TilingSprite (.fromImage image-id width height)))
  ([image-id width height options]
    (-> js/TilingSprite (.fromImage image-id width height options))))

(defn get-local-bounds
  "Method.

  Member of TilingSprite.

  Gets the local bounds of the sprite object."
  ([this rect]
    (-> this (.getLocalBounds rect))))

(defn anchor
  "Property.

  Member of TilingSprite.

  The anchor sets the origin point of the text. The default value
  taken from the {@link PIXI.Texture|Texture}
  and passed to the constructor.
  The default is `(0,0)`, this means the text's origin is the top
  Setting the anchor to `(0.5,0.5)` means the text's origin is
  Setting the anchor to `(1,1)` would mean the text's origin point
  be the bottom right corner.
  If you pass only single parameter, it will set both x and y to
  same value as shown in the example below."
  [this]
  (-> this .-anchor))

(defn set-anchor!
  "Property.

  Member of TilingSprite.

  The anchor sets the origin point of the text. The default value
  taken from the {@link PIXI.Texture|Texture}
  and passed to the constructor.
  The default is `(0,0)`, this means the text's origin is the top
  Setting the anchor to `(0.5,0.5)` means the text's origin is
  Setting the anchor to `(1,1)` would mean the text's origin point
  be the bottom right corner.
  If you pass only single parameter, it will set both x and y to
  same value as shown in the example below."
  [this val]
  (aset this "anchor" val))

(defn blend-mode
  "Property.

  Member of TilingSprite.

  The blend mode to be applied to the sprite. Apply a value of
  to reset the blend mode."
  [this]
  (-> this .-blendMode))

(defn set-blend-mode!
  "Property.

  Member of TilingSprite.

  The blend mode to be applied to the sprite. Apply a value of
  to reset the blend mode."
  [this val]
  (aset this "blendMode" val))

(defn clamp-margin
  "Property.

  Member of TilingSprite.

  Changes frame clamping in corresponding textureTransform, shortcut
  Change to -0.5 to add a pixel to the edge, recommended for transparent
  textures in atlas"
  [this]
  (-> this .-clampMargin))

(defn set-clamp-margin!
  "Property.

  Member of TilingSprite.

  Changes frame clamping in corresponding textureTransform, shortcut
  Change to -0.5 to add a pixel to the edge, recommended for transparent
  textures in atlas"
  [this val]
  (aset this "clampMargin" val))

(defn height
  "Property.

  Member of TilingSprite.

  The height of the TilingSprite, setting this will actually modify
  scale to achieve the value set"
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of TilingSprite.

  The height of the TilingSprite, setting this will actually modify
  scale to achieve the value set"
  [this val]
  (aset this "height" val))

(defn is-sprite
  "Property.

  Member of TilingSprite.

  used to fast check if a sprite is.. a sprite!"
  [this]
  (-> this .-isSprite))

(defn set-is-sprite!
  "Property.

  Member of TilingSprite.

  used to fast check if a sprite is.. a sprite!"
  [this val]
  (aset this "isSprite" val))

(defn plugin-name
  "Property.

  Member of TilingSprite.

  Plugin that is responsible for rendering this element.
  Allows to customize the rendering process without overriding
  method."
  [this]
  (-> this .-pluginName))

(defn set-plugin-name!
  "Property.

  Member of TilingSprite.

  Plugin that is responsible for rendering this element.
  Allows to customize the rendering process without overriding
  method."
  [this val]
  (aset this "pluginName" val))

(defn round-pixels
  "Property.

  Member of TilingSprite.

  If true PixiJS will Math.floor() x/y values when rendering, stopping
  interpolation.
  Advantages can include sharper image quality (like text) and
  rendering on canvas.
  The main disadvantage is movement of objects may appear less
  To set the global default, change {@link PIXI.settings.ROUND_PIXELS}"
  [this]
  (-> this .-roundPixels))

(defn set-round-pixels!
  "Property.

  Member of TilingSprite.

  If true PixiJS will Math.floor() x/y values when rendering, stopping
  interpolation.
  Advantages can include sharper image quality (like text) and
  rendering on canvas.
  The main disadvantage is movement of objects may appear less
  To set the global default, change {@link PIXI.settings.ROUND_PIXELS}"
  [this val]
  (aset this "roundPixels" val))

(defn shader
  "Property.

  Member of TilingSprite.

  The shader that will be used to render the sprite. Set to null
  remove a current shader."
  [this]
  (-> this .-shader))

(defn set-shader!
  "Property.

  Member of TilingSprite.

  The shader that will be used to render the sprite. Set to null
  remove a current shader."
  [this val]
  (aset this "shader" val))

(defn texture
  "Property.

  Member of TilingSprite.

  The texture that the sprite is using"
  [this]
  (-> this .-texture))

(defn set-texture!
  "Property.

  Member of TilingSprite.

  The texture that the sprite is using"
  [this val]
  (aset this "texture" val))

(defn tile-position
  "Property.

  Member of TilingSprite.

  The offset of the image that is being tiled"
  [this]
  (-> this .-tilePosition))

(defn set-tile-position!
  "Property.

  Member of TilingSprite.

  The offset of the image that is being tiled"
  [this val]
  (aset this "tilePosition" val))

(defn tile-scale
  "Property.

  Member of TilingSprite.

  The scaling of the image that is being tiled"
  [this]
  (-> this .-tileScale))

(defn set-tile-scale!
  "Property.

  Member of TilingSprite.

  The scaling of the image that is being tiled"
  [this val]
  (aset this "tileScale" val))

(defn tile-transform
  "Property.

  Member of TilingSprite.

  Tile transform"
  [this]
  (-> this .-tileTransform))

(defn set-tile-transform!
  "Property.

  Member of TilingSprite.

  Tile transform"
  [this val]
  (aset this "tileTransform" val))

(defn tint
  "Property.

  Member of TilingSprite.

  The tint applied to the sprite. This is a hex value.
  A value of 0xFFFFFF will remove any tint effect."
  [this]
  (-> this .-tint))

(defn set-tint!
  "Property.

  Member of TilingSprite.

  The tint applied to the sprite. This is a hex value.
  A value of 0xFFFFFF will remove any tint effect."
  [this val]
  (aset this "tint" val))

(defn uv-matrix
  "Property.

  Member of TilingSprite.

  matrix that is applied to UV to get the coords in Texture normalized
  to coords in BaseTexture space"
  [this]
  (-> this .-uvMatrix))

(defn set-uv-matrix!
  "Property.

  Member of TilingSprite.

  matrix that is applied to UV to get the coords in Texture normalized
  to coords in BaseTexture space"
  [this val]
  (aset this "uvMatrix" val))

(defn uv-respect-anchor
  "Property.

  Member of TilingSprite.

  Whether or not anchor affects uvs"
  [this]
  (-> this .-uvRespectAnchor))

(defn set-uv-respect-anchor!
  "Property.

  Member of TilingSprite.

  Whether or not anchor affects uvs"
  [this val]
  (aset this "uvRespectAnchor" val))

(defn vertex-data
  "Property.

  Member of TilingSprite.

  this is used to store the vertex data of the sprite (basically
  quad)"
  [this]
  (-> this .-vertexData))

(defn set-vertex-data!
  "Property.

  Member of TilingSprite.

  this is used to store the vertex data of the sprite (basically
  quad)"
  [this val]
  (aset this "vertexData" val))

(defn vertex-trimmed-data
  "Property.

  Member of TilingSprite.

  This is used to calculate the bounds of the object IF it is a
  sprite"
  [this]
  (-> this .-vertexTrimmedData))

(defn set-vertex-trimmed-data!
  "Property.

  Member of TilingSprite.

  This is used to calculate the bounds of the object IF it is a
  sprite"
  [this val]
  (aset this "vertexTrimmedData" val))

(defn width
  "Property.

  Member of TilingSprite.

  The width of the sprite, setting this will actually modify the
  to achieve the value set"
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of TilingSprite.

  The width of the sprite, setting this will actually modify the
  to achieve the value set"
  [this val]
  (aset this "width" val))

