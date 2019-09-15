(ns pixi.Text
  "Extends - Sprite.

  A Text Object will create a line or multiple lines of text.
  The text is created using the [Canvas API](https://developer.mozilla.org/en-US/docs/Web/API/Canvas_API).
  The primary advantage of this class over BitmapText is that you
  great control over the style of the next,
  which you can change at runtime.
  The primary disadvantages is that each piece of text has it's
  texture, which can use more memory.
  When text changes, this texture has to be re-generated and re-uploaded
  the GPU, taking up time.
  To split a line you can use '\\n' in your text string, or, on
  `style` object,
  change its `wordWrap` property to true and and give the `wordWrapWidth`
  a value.
  A Text can be created directly from a string and a style object,
  which can be generated [here](https://pixijs.io/pixi-text-style).
  ```js
  let text = new PIXI.Text('This is a PixiJS text',{fontFamily
  'Arial', fontSize: 24, fill : 0xff1010, align : 'center'});
  ```"
  (:refer-clojure :exclude []))

(defn new
  "Constructor."
  ([text]
    (new js/Text text))
  ([text style]
    (new js/Text text style))
  ([text style canvas]
    (new js/Text text style canvas)))

(defn calculate-trimmed-vertices
  "Method.

  Member of Text.

  calculates worldTransform * vertices for a non texture with a
  store it in vertexTrimmedData
  This is used to ensure that the true width and height of a trimmed
  is respected"
  ([this]
    (-> this (.calculateTrimmedVertices))))

(defn calculate-vertices
  "Method.

  Member of Text.

  calculates worldTransform * vertices, store it in vertexData"
  ([this]
    (-> this (.calculateVertices))))

(defn contains-point
  "Method.

  Member of Text.

  Tests if a point is inside this sprite"
  ([this point]
    (-> this (.containsPoint point))))

(defn destroy
  "Method.

  Member of Text.

  Destroys this text object.
  Note* Unlike a Sprite, a Text object will automatically destroy
  baseTexture and texture as
  the majority of the time the texture will not be shared with
  other Sprites."
  ([this]
    (-> this (.destroy)))
  ([this options]
    (-> this (.destroy options))))

(defn draw-letter-spacing
  "Method.

  Member of Text.

  Render the text with letter-spacing."
  ([this text x y]
    (-> this (.drawLetterSpacing text x y)))
  ([this text x y is-stroke]
    (-> this (.drawLetterSpacing text x y is-stroke))))

(defn *from
  "Method.

  Member of Text.

  Helper function that creates a new sprite based on the source
  provide.
  The source can be - frame id, image url, video url, canvas element,
  element, base texture"
  ([source]
    (-> js/Sprite (.from source)))
  ([source options]
    (-> js/Sprite (.from source options))))

(defn get-local-bounds
  "Method.

  Member of Text.

  Gets the local bounds of the text object."
  ([this rect]
    (-> this (.getLocalBounds rect))))

(defn update-text
  "Method.

  Member of Text.

  Renders text and updates it when needed."
  ([this respect-dirty]
    (-> this (.updateText respect-dirty))))

(defn update-texture
  "Method.

  Member of Text.

  Updates texture size based on canvas size"
  ([this]
    (-> this (.updateTexture))))

(defn anchor
  "Property.

  Member of Text.

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

  Member of Text.

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

  Member of Text.

  The blend mode to be applied to the sprite. Apply a value of
  to reset the blend mode."
  [this]
  (-> this .-blendMode))

(defn set-blend-mode!
  "Property.

  Member of Text.

  The blend mode to be applied to the sprite. Apply a value of
  to reset the blend mode."
  [this val]
  (aset this "blendMode" val))

(defn canvas
  "Property.

  Member of Text.

  The canvas element that everything is drawn to"
  [this]
  (-> this .-canvas))

(defn set-canvas!
  "Property.

  Member of Text.

  The canvas element that everything is drawn to"
  [this val]
  (aset this "canvas" val))

(defn context
  "Property.

  Member of Text.

  The canvas 2d context that everything is drawn with"
  [this]
  (-> this .-context))

(defn set-context!
  "Property.

  Member of Text.

  The canvas 2d context that everything is drawn with"
  [this val]
  (aset this "context" val))

(defn height
  "Property.

  Member of Text.

  The height of the Text, setting this will actually modify the
  to achieve the value set"
  [this]
  (-> this .-height))

(defn set-height!
  "Property.

  Member of Text.

  The height of the Text, setting this will actually modify the
  to achieve the value set"
  [this val]
  (aset this "height" val))

(defn is-sprite
  "Property.

  Member of Text.

  used to fast check if a sprite is.. a sprite!"
  [this]
  (-> this .-isSprite))

(defn set-is-sprite!
  "Property.

  Member of Text.

  used to fast check if a sprite is.. a sprite!"
  [this val]
  (aset this "isSprite" val))

(defn plugin-name
  "Property.

  Member of Text.

  Plugin that is responsible for rendering this element.
  Allows to customize the rendering process without overriding
  & '_renderCanvas' methods."
  [this]
  (-> this .-pluginName))

(defn set-plugin-name!
  "Property.

  Member of Text.

  Plugin that is responsible for rendering this element.
  Allows to customize the rendering process without overriding
  & '_renderCanvas' methods."
  [this val]
  (aset this "pluginName" val))

(defn resolution
  "Property.

  Member of Text.

  The resolution / device pixel ratio of the canvas.
  This is set to automatically match the renderer resolution by
  but can be overridden by setting manually."
  [this]
  (-> this .-resolution))

(defn set-resolution!
  "Property.

  Member of Text.

  The resolution / device pixel ratio of the canvas.
  This is set to automatically match the renderer resolution by
  but can be overridden by setting manually."
  [this val]
  (aset this "resolution" val))

(defn round-pixels
  "Property.

  Member of Text.

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

  Member of Text.

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

  Member of Text.

  The shader that will be used to render the sprite. Set to null
  remove a current shader."
  [this]
  (-> this .-shader))

(defn set-shader!
  "Property.

  Member of Text.

  The shader that will be used to render the sprite. Set to null
  remove a current shader."
  [this val]
  (aset this "shader" val))

(defn style
  "Property.

  Member of Text.

  Set the style of the text. Set up an event listener to listen
  changes on the style
  object and mark the text as dirty."
  [this]
  (-> this .-style))

(defn set-style!
  "Property.

  Member of Text.

  Set the style of the text. Set up an event listener to listen
  changes on the style
  object and mark the text as dirty."
  [this val]
  (aset this "style" val))

(defn text
  "Property.

  Member of Text.

  Set the copy for the text object. To split a line you can use"
  [this]
  (-> this .-text))

(defn set-text!
  "Property.

  Member of Text.

  Set the copy for the text object. To split a line you can use"
  [this val]
  (aset this "text" val))

(defn texture
  "Property.

  Member of Text.

  The texture that the sprite is using"
  [this]
  (-> this .-texture))

(defn set-texture!
  "Property.

  Member of Text.

  The texture that the sprite is using"
  [this val]
  (aset this "texture" val))

(defn tint
  "Property.

  Member of Text.

  The tint applied to the sprite. This is a hex value.
  A value of 0xFFFFFF will remove any tint effect."
  [this]
  (-> this .-tint))

(defn set-tint!
  "Property.

  Member of Text.

  The tint applied to the sprite. This is a hex value.
  A value of 0xFFFFFF will remove any tint effect."
  [this val]
  (aset this "tint" val))

(defn vertex-data
  "Property.

  Member of Text.

  this is used to store the vertex data of the sprite (basically
  quad)"
  [this]
  (-> this .-vertexData))

(defn set-vertex-data!
  "Property.

  Member of Text.

  this is used to store the vertex data of the sprite (basically
  quad)"
  [this val]
  (aset this "vertexData" val))

(defn vertex-trimmed-data
  "Property.

  Member of Text.

  This is used to calculate the bounds of the object IF it is a
  sprite"
  [this]
  (-> this .-vertexTrimmedData))

(defn set-vertex-trimmed-data!
  "Property.

  Member of Text.

  This is used to calculate the bounds of the object IF it is a
  sprite"
  [this val]
  (aset this "vertexTrimmedData" val))

(defn width
  "Property.

  Member of Text.

  The width of the Text, setting this will actually modify the
  to achieve the value set"
  [this]
  (-> this .-width))

(defn set-width!
  "Property.

  Member of Text.

  The width of the Text, setting this will actually modify the
  to achieve the value set"
  [this val]
  (aset this "width" val))

